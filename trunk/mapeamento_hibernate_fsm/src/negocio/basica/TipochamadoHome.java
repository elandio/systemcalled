package negocio.basica;
// Generated 24/09/2012 21:42:03 by Hibernate Tools 3.2.0.CR1


import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Tipochamado.
 * @see negocio.basica.Tipochamado
 * @author Hibernate Tools
 */
public class TipochamadoHome {

    private static final Log log = LogFactory.getLog(TipochamadoHome.class);

    private final SessionFactory sessionFactory = getSessionFactory();
    
    protected SessionFactory getSessionFactory() {
        try {
            return (SessionFactory) new InitialContext().lookup("SessionFactory");
        }
        catch (Exception e) {
            log.error("Could not locate SessionFactory in JNDI", e);
            throw new IllegalStateException("Could not locate SessionFactory in JNDI");
        }
    }
    
    public void persist(Tipochamado transientInstance) {
        log.debug("persisting Tipochamado instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(Tipochamado instance) {
        log.debug("attaching dirty Tipochamado instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Tipochamado instance) {
        log.debug("attaching clean Tipochamado instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(Tipochamado persistentInstance) {
        log.debug("deleting Tipochamado instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Tipochamado merge(Tipochamado detachedInstance) {
        log.debug("merging Tipochamado instance");
        try {
            Tipochamado result = (Tipochamado) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Tipochamado findById( int id) {
        log.debug("getting Tipochamado instance with id: " + id);
        try {
            Tipochamado instance = (Tipochamado) sessionFactory.getCurrentSession()
                    .get("negocio.basica.Tipochamado", id);
            if (instance==null) {
                log.debug("get successful, no instance found");
            }
            else {
                log.debug("get successful, instance found");
            }
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    public List findByExample(Tipochamado instance) {
        log.debug("finding Tipochamado instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("negocio.basica.Tipochamado")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        }
        catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    } 
}

