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
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Salvando um objeto do tipo Software na sess�o aberta
			repositorio.incluir(pSoftware);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclus�o de Software realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir Software",e);
		}
	}
	
	public void alterar(Software pSoftware){
		try {
			System.out.println("Alterando o Software...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo Software na sess�o aberta
			repositorio.alterar(pSoftware);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Altera��o de Software realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar Software",e);
		}
	}
	
	
	public void remover(Software pSoftware){
		try {
			System.out.println("Removendo o Software...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo Software na sess�o aberta
			repositorio.remover(pSoftware);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remo��o de Software realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover Software",e);
		}
	}
	
	public Software consultarPorChavePrimaria(Software pSoftware){
		try {
			System.out.println("Consultando Software por chave prim�ria");
			Object id = pSoftware.getId();

			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Software por chave prim�ria na sess�o aberta
			pSoftware = repositorio.consultarPorChavePrimaria(pSoftware);

			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (pSoftware == null)
				throw new RuntimeException("Registro n�o encontrado");
			System.out.println("Consulta por chave prim�ria de Software realizada com sucesso...");

			return pSoftware;
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Software por chave Prim�ria",e);
		}
		
	
	

	}
	
	public List<Software> listar(){
		List<Software> retorno;
		try {
			System.out.println("Consultando Software por chave prim�ria");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Software por chave prim�ria na sess�o aberta
			retorno = repositorio.listar();
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave prim�ria de Software realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Software por chave Prim�ria",e);
		}
		return retorno;
		
	}
	

}

