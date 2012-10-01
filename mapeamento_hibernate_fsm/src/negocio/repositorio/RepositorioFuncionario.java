package negocio.repositorio;

import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Funcionario;

public class RepositorioFuncionario {

	public void incluir(Funcionario pFuncionario){

			HibernateUtil.getSession().save(pFuncionario);

	}
	
	public void alterar(Funcionario pFuncionario){

			HibernateUtil.getSession().update(pFuncionario);

	}
	
	
	public void remover(Funcionario pFuncionario){

			HibernateUtil.getSession().delete(pFuncionario);

	}
	
	public Funcionario consultarPorChavePrimaria(Funcionario pFuncionario){

			pFuncionario = (Funcionario) HibernateUtil.getSession().get(Funcionario.class,
					pFuncionario.getId());


			return pFuncionario;
	

	}
	
	public List<Funcionario> listar(){
		List<Funcionario> retorno;

			retorno = HibernateUtil.getSession().createCriteria(Funcionario.class).list();

		return retorno;
		
	}
}
