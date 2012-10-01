package negocio.controlador;
// Generated 24/09/2012 21:42:05 by Hibernate Tools 3.2.0.CR1


import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Hardware;
import negocio.repositorio.RepositorioHardware;



/**
* Interface Service da entidade Hardware.
* @see negocio.controlador.Hardware
* @author Thiago Ribeiro Tavares
*/

public class ControladorHardware {
	private RepositorioHardware repositorio = new RepositorioHardware();
	public ControladorHardware(){
		
	}
	public void incluir(Hardware pHardware){
		try {
			System.out.println("Incluindo o Hardware...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Salvando um objeto do tipo Hardware na sess�o aberta
			repositorio.incluir(pHardware);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclus�o de Hardware realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir Hardware",e);
		}
	}
	
	public void alterar(Hardware pHardware){
		try {
			System.out.println("Alterando o Hardware...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo Hardware na sess�o aberta
			repositorio.alterar(pHardware);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Altera��o de Hardware realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar Hardware",e);
		}
	}
	
	
	public void remover(Hardware pHardware){
		try {
			System.out.println("Removendo o Hardware...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo Hardware na sess�o aberta
			repositorio.remover(pHardware);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remo��o de Hardware realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover Hardware",e);
		}
	}
	
	public Hardware consultarPorChavePrimaria(Hardware pHardware){
		try {
			System.out.println("Consultando Hardware por chave prim�ria");
			Object id = pHardware.getId();

			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Hardware por chave prim�ria na sess�o aberta
			pHardware = repositorio.consultarPorChavePrimaria(pHardware);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (pHardware == null)
				throw new RuntimeException("Registro n�o encontrado");
			System.out.println("Consulta por chave prim�ria de Hardware realizada com sucesso...");

			return pHardware;
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Hardware por chave Prim�ria",e);
		}
		
	
	

	}
	
	public List<Hardware> listar(){
		List<Hardware> retorno;
		try {
			System.out.println("Consultando Hardware por chave prim�ria");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Hardware por chave prim�ria na sess�o aberta
			retorno = repositorio.listar();
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave prim�ria de Hardware realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Hardware por chave Prim�ria",e);
		}
		return retorno;
		
	}
	

}

