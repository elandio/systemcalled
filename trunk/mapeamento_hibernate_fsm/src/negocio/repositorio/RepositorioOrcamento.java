package negocio.repositorio;

import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Orcamento;

public class RepositorioOrcamento {

	public void incluir(Orcamento pOrcamento){

			HibernateUtil.getSession().save(pOrcamento);

	}
	
	public void alterar(Orcamento pOrcamento){

			HibernateUtil.getSession().update(pOrcamento);

	}
	
	
	public void remover(Orcamento pOrcamento){

			HibernateUtil.getSession().delete(pOrcamento);

	}
	
	public Orcamento consultarPorChavePrimaria(Orcamento pOrcamento){

			pOrcamento = (Orcamento) HibernateUtil.getSession().get(Orcamento.class,
					pOrcamento.getId());

			return pOrcamento;

		
	
	

	}
	
	public List<Orcamento> listar(){
		List<Orcamento> retorno;

			retorno = HibernateUtil.getSession().createCriteria(Orcamento.class).list();
	
		return retorno;
		
	}
}
