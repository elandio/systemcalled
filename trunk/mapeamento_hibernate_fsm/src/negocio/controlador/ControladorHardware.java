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
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Salvando um objeto do tipo Hardware na sessão aberta
			repositorio.incluir(pHardware);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclusão de Hardware realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir Hardware",e);
		}
	}
	
	public void alterar(Hardware pHardware){
		try {
			System.out.println("Alterando o Hardware...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo Hardware na sessão aberta
			repositorio.alterar(pHardware);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Alteração de Hardware realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar Hardware",e);
		}
	}
	
	
	public void remover(Hardware pHardware){
		try {
			System.out.println("Removendo o Hardware...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo Hardware na sessão aberta
			repositorio.remover(pHardware);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remoção de Hardware realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover Hardware",e);
		}
	}
	
	public Hardware consultarPorChavePrimaria(Hardware pHardware){
		try {
			System.out.println("Consultando Hardware por chave primária");
			Object id = pHardware.getId();

			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Hardware por chave primária na sessão aberta
			pHardware = repositorio.consultarPorChavePrimaria(pHardware);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (pHardware == null)
				throw new RuntimeException("Registro não encontrado");
			System.out.println("Consulta por chave primária de Hardware realizada com sucesso...");

			return pHardware;
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Hardware por chave Primária",e);
		}
		
	
	

	}
	
	public List<Hardware> listar(){
		List<Hardware> retorno;
		try {
			System.out.println("Consultando Hardware por chave primária");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Hardware por chave primária na sessão aberta
			retorno = repositorio.listar();
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave primária de Hardware realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Hardware por chave Primária",e);
		}
		return retorno;
		
	}
	

}

