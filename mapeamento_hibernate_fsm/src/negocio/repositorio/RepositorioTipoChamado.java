package negocio.repositorio;

import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Tipochamado;

public class RepositorioTipoChamado {

	public void incluir(Tipochamado pTipochamado){

			HibernateUtil.getSession().save(pTipochamado);

	}
	
	public void alterar(Tipochamado pTipochamado){

			HibernateUtil.getSession().update(pTipochamado);

	}
	
	
	public void remover(Tipochamado pTipochamado){

			HibernateUtil.getSession().delete(pTipochamado);

	}
	
	public Tipochamado consultarPorChavePrimaria(Tipochamado pTipochamado){

			pTipochamado = (Tipochamado) HibernateUtil.getSession().get(Tipochamado.class,
					pTipochamado.getId());

			return pTipochamado;
	

	}
	
	public List<Tipochamado> listar(){
		List<Tipochamado> retorno;

			retorno = HibernateUtil.getSession().createCriteria(Tipochamado.class).list();
	
		return retorno;
		
	}
}
