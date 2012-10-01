package negocio.controlador;
// Generated 24/09/2012 21:42:05 by Hibernate Tools 3.2.0.CR1


import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Monitor;
import negocio.repositorio.RepositorioMonitor;



/**
* Interface Service da entidade Monitor.
* @see negocio.controlador.Monitor
* @author Thiago Ribeiro Tavares
*/

public class ControladorMonitor {
	private RepositorioMonitor repositorio = new RepositorioMonitor();
	public ControladorMonitor(){
		
	}
	public void incluir(Monitor pMonitor){
		try {
			System.out.println("Incluindo o Monitor...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Salvando um objeto do tipo Monitor na sessão aberta
			repositorio.incluir(pMonitor);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclusão de Monitor realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir Monitor",e);
		}
	}
	
	public void alterar(Monitor pMonitor){
		try {
			System.out.println("Alterando o Monitor...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo Monitor na sessão aberta
			repositorio.alterar(pMonitor);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Alteração de Monitor realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar Monitor",e);
		}
	}
	
	
	public void remover(Monitor pMonitor){
		try {
			System.out.println("Removendo o Monitor...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo Monitor na sessão aberta
			repositorio.remover(pMonitor);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remoção de Monitor realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover Monitor",e);
		}
	}
	
	public Monitor consultarPorChavePrimaria(Monitor pMonitor){
		try {
			System.out.println("Consultando Monitor por chave primária");
			Object id = pMonitor.getId();

			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Monitor por chave primária na sessão aberta
			pMonitor = repositorio.consultarPorChavePrimaria(pMonitor);

			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (pMonitor == null)
				throw new RuntimeException("Registro não encontrado");
			System.out.println("Consulta por chave primária de Monitor realizada com sucesso...");

			return pMonitor;
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Monitor por chave Primária",e);
		}
		
	
	

	}
	
	public List<Monitor> listar(){
		List<Monitor> retorno;
		try {
			System.out.println("Consultando Monitor por chave primária");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Monitor por chave primária na sessão aberta
			retorno = repositorio.listar();
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave primária de Monitor realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Monitor por chave Primária",e);
		}
		return retorno;
		
	}
	

}

