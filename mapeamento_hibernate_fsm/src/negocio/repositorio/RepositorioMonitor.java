package negocio.repositorio;

import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Monitor;

public class RepositorioMonitor {

	public void incluir(Monitor pMonitor){

			HibernateUtil.getSession().save(pMonitor);

	}
	
	public void alterar(Monitor pMonitor){

			HibernateUtil.getSession().update(pMonitor);

	}
	
	
	public void remover(Monitor pMonitor){
	
			HibernateUtil.getSession().delete(pMonitor);

	}
	
	public Monitor consultarPorChavePrimaria(Monitor pMonitor){

			pMonitor = (Monitor) HibernateUtil.getSession().get(Monitor.class,
					pMonitor.getId());

			return pMonitor;

		
	
	

	}
	
	public List<Monitor> listar(){
		List<Monitor> retorno;

			retorno = HibernateUtil.getSession().createCriteria(Monitor.class).list();

		return retorno;
		
	}
}
