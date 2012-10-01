package negocio.repositorio;

import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Computador;

public class RepositorioComputador {

	public void incluir(Computador pComputador){

			HibernateUtil.getSession().save(pComputador);

	}
	
	public void alterar(Computador pComputador){

			HibernateUtil.getSession().update(pComputador);

	}
	
	
	public void remover(Computador pComputador){

			HibernateUtil.getSession().delete(pComputador);

	}
	
	public Computador consultarPorChavePrimaria(Computador pComputador){

			pComputador = (Computador) HibernateUtil.getSession().get(Computador.class,
					pComputador.getId());

			return pComputador;


	}
	
	public List<Computador> listar(){
		List<Computador> retorno;
	
			retorno = HibernateUtil.getSession().createCriteria(Computador.class).list();
	
		return retorno;
		
	}
}
