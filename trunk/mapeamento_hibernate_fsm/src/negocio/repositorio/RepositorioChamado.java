package negocio.repositorio;

import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Chamado;

public class RepositorioChamado {

	public void incluir(Chamado pChamado){

			HibernateUtil.getSession().save(pChamado);

	}
	
	public void alterar(Chamado pChamado){

			HibernateUtil.getSession().update(pChamado);

	}
	
	
	public void remover(Chamado pChamado){

			HibernateUtil.getSession().delete(pChamado);

	}
	
	public Chamado consultarPorChavePrimaria(Chamado pChamado){

			pChamado = (Chamado) HibernateUtil.getSession().get(Chamado.class,
					pChamado.getId());

			return pChamado;
	

	}
	
	public List<Chamado> listar(){
		List<Chamado> retorno;

			retorno = HibernateUtil.getSession().createCriteria(Chamado.class).list();

		return retorno;
		
	}
}
