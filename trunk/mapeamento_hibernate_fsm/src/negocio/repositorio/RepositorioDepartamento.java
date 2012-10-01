package negocio.repositorio;

import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Departamento;

public class RepositorioDepartamento {

	public void incluir(Departamento pDepartamento){

			HibernateUtil.getSession().save(pDepartamento);

	}
	
	public void alterar(Departamento pDepartamento){

			HibernateUtil.getSession().update(pDepartamento);

	}
	
	
	public void remover(Departamento pDepartamento){

			HibernateUtil.getSession().delete(pDepartamento);


	}
	
	public Departamento consultarPorChavePrimaria(Departamento pDepartamento){

			pDepartamento = (Departamento) HibernateUtil.getSession().get(Departamento.class,
					pDepartamento.getId());

			return pDepartamento;

	}
	
	public List<Departamento> listar(){
		List<Departamento> retorno;

			retorno = HibernateUtil.getSession().createCriteria(Departamento.class).list();

		return retorno;
		
	}
}
