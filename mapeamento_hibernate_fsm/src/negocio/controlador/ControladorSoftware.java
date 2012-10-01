package negocio.controlador;
// Generated 24/09/2012 21:42:05 by Hibernate Tools 3.2.0.CR1


import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Software;
import negocio.repositorio.RepositorioSoftware;



/**
* Interface Service da entidade Software.
* @see negocio.controlador.Software
* @author Thiago Ribeiro Tavares
*/

public class ControladorSoftware {
	private RepositorioSoftware repositorio = new RepositorioSoftware();
	public ControladorSoftware(){
		
	}
	public void incluir(Software pSoftware){
		try {
			System.out.println("Incluindo o Software...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Salvando um objeto do tipo Software na sessão aberta
			repositorio.incluir(pSoftware);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclusão de Software realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir Software",e);
		}
	}
	
	public void alterar(Software pSoftware){
		try {
			System.out.println("Alterando o Software...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo Software na sessão aberta
			repositorio.alterar(pSoftware);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Alteração de Software realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar Software",e);
		}
	}
	
	
	public void remover(Software pSoftware){
		try {
			System.out.println("Removendo o Software...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo Software na sessão aberta
			repositorio.remover(pSoftware);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remoção de Software realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover Software",e);
		}
	}
	
	public Software consultarPorChavePrimaria(Software pSoftware){
		try {
			System.out.println("Consultando Software por chave primária");
			Object id = pSoftware.getId();

			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Software por chave primária na sessão aberta
			pSoftware = repositorio.consultarPorChavePrimaria(pSoftware);

			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (pSoftware == null)
				throw new RuntimeException("Registro não encontrado");
			System.out.println("Consulta por chave primária de Software realizada com sucesso...");

			return pSoftware;
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Software por chave Primária",e);
		}
		
	
	

	}
	
	public List<Software> listar(){
		List<Software> retorno;
		try {
			System.out.println("Consultando Software por chave primária");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Software por chave primária na sessão aberta
			retorno = repositorio.listar();
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave primária de Software realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Software por chave Primária",e);
		}
		return retorno;
		
	}
	

}

