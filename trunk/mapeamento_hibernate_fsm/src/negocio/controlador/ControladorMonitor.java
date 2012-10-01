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
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Salvando um objeto do tipo Monitor na sess�o aberta
			repositorio.incluir(pMonitor);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclus�o de Monitor realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir Monitor",e);
		}
	}
	
	public void alterar(Monitor pMonitor){
		try {
			System.out.println("Alterando o Monitor...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo Monitor na sess�o aberta
			repositorio.alterar(pMonitor);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Altera��o de Monitor realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar Monitor",e);
		}
	}
	
	
	public void remover(Monitor pMonitor){
		try {
			System.out.println("Removendo o Monitor...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo Monitor na sess�o aberta
			repositorio.remover(pMonitor);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remo��o de Monitor realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover Monitor",e);
		}
	}
	
	public Monitor consultarPorChavePrimaria(Monitor pMonitor){
		try {
			System.out.println("Consultando Monitor por chave prim�ria");
			Object id = pMonitor.getId();

			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Monitor por chave prim�ria na sess�o aberta
			pMonitor = repositorio.consultarPorChavePrimaria(pMonitor);

			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (pMonitor == null)
				throw new RuntimeException("Registro n�o encontrado");
			System.out.println("Consulta por chave prim�ria de Monitor realizada com sucesso...");

			return pMonitor;
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Monitor por chave Prim�ria",e);
		}
		
	
	

	}
	
	public List<Monitor> listar(){
		List<Monitor> retorno;
		try {
			System.out.println("Consultando Monitor por chave prim�ria");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Monitor por chave prim�ria na sess�o aberta
			retorno = repositorio.listar();
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave prim�ria de Monitor realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Monitor por chave Prim�ria",e);
		}
		return retorno;
		
	}
	

}

