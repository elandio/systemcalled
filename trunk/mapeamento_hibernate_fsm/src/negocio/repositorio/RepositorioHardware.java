package negocio.repositorio;

import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Hardware;

public class RepositorioHardware {

	public void incluir(Hardware pHardware){

			HibernateUtil.getSession().save(pHardware);

	}
	
	public void alterar(Hardware pHardware){

			HibernateUtil.getSession().update(pHardware);

	}
	
	
	public void remover(Hardware pHardware){

			HibernateUtil.getSession().delete(pHardware);

	}
	
	public Hardware consultarPorChavePrimaria(Hardware pHardware){

			pHardware = (Hardware) HibernateUtil.getSession().get(Hardware.class,
					pHardware.getId());

			return pHardware;

		
	
	

	}
	
	public List<Hardware> listar(){
		List<Hardware> retorno;

			retorno = HibernateUtil.getSession().createCriteria(Hardware.class).list();

		return retorno;
		
	}
}
