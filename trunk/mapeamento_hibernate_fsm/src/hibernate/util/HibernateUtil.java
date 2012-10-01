package hibernate.util;


import java.sql.BatchUpdateException;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Interceptor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static Logger log = Logger.getLogger(HibernateUtil.class);

	private static org.hibernate.cfg.Configuration configuration;

	private static SessionFactory sessionFactory;

	private static final ThreadLocal threadSession = new ThreadLocal();

	private static final ThreadLocal threadTransaction = new ThreadLocal();

	private static final ThreadLocal threadInterceptor = new ThreadLocal();

	static {
		try {
			configuration = new Configuration();
			sessionFactory = configuration.configure("hibernate.cfg.xml")
					.buildSessionFactory();

		} catch (Throwable ex) {
			log.error("Criação da SessionFactory falhou.", ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static Configuration getConfiguration() {
		return configuration;
	}

	/**
	 * Rebuild the SessionFactory with the static Configuration.
	 * 
	 */
	public static void rebuildSessionFactory() throws Exception {
		synchronized (sessionFactory) {
			try {
				sessionFactory = getConfiguration().buildSessionFactory();
			} catch (Exception ex) {
				throw ex;
			}
		}
	}

	/**
	 * Rebuild the SessionFactory with the given Hibernate Configuration.
	 * 
	 * @param cfg
	 */
	public static void rebuildSessionFactory(Configuration cfg)
			throws Exception {
		synchronized (sessionFactory) {
			try {
				sessionFactory = cfg.buildSessionFactory();
				configuration = cfg;
			} catch (Exception ex) {
				throw ex;
			}
		}
	}

	/**
	 * Retrieves the current Session local to the thread.
	 * <p/>
	 * If no Session is open, opens a new Session for the running thread.
	 * 
	 * @return Session
	 */
	public static Session getSession() throws HibernateException {
		Session s = (Session) threadSession.get();
		try {
			if (s == null) {
				log.debug("Abrindo uma nova sessão para essa Thread.");
				if (getInterceptor() != null) {
					log.debug("Usando interceptor: "
							+ getInterceptor().getClass());
					s = getSessionFactory().openSession(getInterceptor());
				} else {
					s = getSessionFactory().openSession();
				}
				threadSession.set(s);
			}
		} catch (HibernateException ex) {
			throw ex;
		}
		s.flush();
		return s;
	}

	/**
	 * Closes the Session local to the thread.
	 */
	public static void closeSession() throws HibernateException {
		try {
			Session s = (Session) threadSession.get();
			threadSession.set(null);
			if (s != null && s.isOpen()) {
				log.debug("Fechando a sessao para essa thread.");
				s.close();
			}
		} catch (HibernateException ex) {
			throw ex;
		}
	}

	/**
	 * Start a new database transaction.
	 */
	public static void beginTransaction() throws HibernateException {
		Transaction tx = (Transaction) threadTransaction.get();
		try {
			if (tx == null) {
				log
						.debug("Iniciando uma nova transação com o Banco de Dados para essa thread.");
				tx = getSession().beginTransaction();
				threadTransaction.set(tx);
			}
		} catch (HibernateException ex) {
			throw ex;
		}
	}

	/**
	 * Commit the database transaction.
	 */
	public static void commitTransaction() throws HibernateException {
		Transaction tx = (Transaction) threadTransaction.get();
		try {
			if (tx != null && !tx.wasCommitted() && !tx.wasRolledBack()) {
				log
						.debug("Commitando a transação no Bando de Dados para essa thread.");
				tx.commit();
			}
			threadTransaction.set(null);
		} catch (HibernateException ex) {
			if (ex.getCause() instanceof BatchUpdateException) {
				((BatchUpdateException) ex.getCause()).getNextException()
						.printStackTrace();
			}
			rollbackTransaction();
			throw ex;
		}
	}

	/**
	 * Commit the database transaction.
	 */
	public static void rollbackTransaction() throws HibernateException {
		Transaction tx = (Transaction) threadTransaction.get();
		try {
			threadTransaction.set(null);
			if (tx != null && !tx.wasCommitted() && !tx.wasRolledBack()) {
				log.debug("tentando o rollback para transação desssa thread.");
				if (getSession().isOpen())
					tx.rollback();
			}
		} catch (HibernateException ex) {
			throw ex;
		} /*
		 * finally { closeSession(); }
		 */
	}

	/**
	 * Reconnects a Hibernate Session to the current Thread.
	 * 
	 * @param session
	 *            The Hibernate Session to be reconnected.
	 */
	public static void reconnect(Session session) throws HibernateException {
		try {
			session.reconnect();
			threadSession.set(session);
		} catch (HibernateException ex) {
			throw ex;
		}
	}

	/**
	 * Disconnect and return Session from current Thread.
	 * 
	 * @return Session the disconnected Session
	 */
	public static Session disconnectSession() throws HibernateException {

		Session session = getSession();
		try {
			threadSession.set(null);
			if (session.isConnected() && session.isOpen())
				session.disconnect();
		} catch (HibernateException ex) {
			throw ex;
		}
		return session;
	}

	/**
	 * Register a Hibernate interceptor with the current thread.
	 * <p>
	 * Every Session opened is opened with this interceptor after registration.
	 * Has no effect if the current Session of the thread is already open,
	 * effective on next close()/getSession().
	 */
	public static void registerInterceptor(Interceptor interceptor) {
		threadInterceptor.set(interceptor);
	}

	private static Interceptor getInterceptor() {
		Interceptor interceptor = (Interceptor) threadInterceptor.get();
		return interceptor;
	}

}

/*
 * public class HibernateUtil { private static SessionFactory sessionFactory;
 * public static final ThreadLocal session = new ThreadLocal(); private static
 * HibernateUtil instancia = null; private HibernateUtil(){
 * 
 * } static { try { sessionFactory = new AnnotationConfiguration()
 * .configure("hibernate.cfg.xml") .buildSessionFactory(); } catch
 * (HibernateException ex) { System.out.println(ex.getMessage()); } }
 * 
 * public static HibernateUtil getInstancia(){ if (instancia == null){ instancia
 * = new HibernateUtil(); } return instancia;
 * 
 * }
 * 
 * public static Session getCurrentSession() throws HibernateException { //pega
 * a sessao ativa no momento Session currentSession = (Session)session.get();
 * 
 * //caso ela seja nula, cria uma nova atraves da SessionFactory if
 * (currentSession == null) { currentSession = sessionFactory.openSession();
 * session.set(currentSession); }
 * 
 * return currentSession; }
 * 
 * public static void closeSession() throws HibernateException { //pega a sessao
 * atual Session currentSession = (Session)session.get();
 * 
 * //seta a sessao atual para null session.set(null);
 * 
 * //se o objeto da sessao atual nao for nulo, encerra a sessao if
 * (currentSession != null) { currentSession.close(); } } }
 */