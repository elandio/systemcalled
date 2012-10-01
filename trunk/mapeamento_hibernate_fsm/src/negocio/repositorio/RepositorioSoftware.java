package negocio.repositorio;

import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Software;

public class RepositorioSoftware {

	public void incluir(Software pSoftware){
	
			HibernateUtil.getSession().save(pSoftware);

	}
	
	public void alterar(Software pSoftware){

			HibernateUtil.getSession().update(pSoftware);

	}
	
	
	public void remover(Software pSoftware){

			HibernateUtil.getSession().delete(pSoftware);

	}
	
	public Software consultarPorChavePrimaria(Software pSoftware){

			pSoftware = (Software) HibernateUtil.getSession().get(Software.class,
					pSoftware.getId());

			return pSoftware;
	
		
	
	

	}
	
	public List<Software> listar(){
		List<Software> retorno;

			retorno = HibernateUtil.getSession().createCriteria(Software.class).list();
	
		return retorno;
		
	}
}
