package negocio.repositorio;

import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Privilegio;

public class RepositorioPrivilegio {

	public void incluir(Privilegio pPrivilegio){

			HibernateUtil.getSession().save(pPrivilegio);
	
	}
	
	public void alterar(Privilegio pPrivilegio){

			HibernateUtil.getSession().update(pPrivilegio);

	}
	
	
	public void remover(Privilegio pPrivilegio){

			HibernateUtil.getSession().delete(pPrivilegio);

	}
	
	public Privilegio consultarPorChavePrimaria(Privilegio pPrivilegio){

			pPrivilegio = (Privilegio) HibernateUtil.getSession().get(Privilegio.class,
					pPrivilegio.getId());

			return pPrivilegio;


	}
	
	public List<Privilegio> listar(){
		List<Privilegio> retorno;
	
			retorno = HibernateUtil.getSession().createCriteria(Privilegio.class).list();
	
		return retorno;
		
	}
}
