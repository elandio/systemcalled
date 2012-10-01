package negocio.controlador;
// Generated 24/09/2012 21:42:05 by Hibernate Tools 3.2.0.CR1


import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Privilegio;
import negocio.repositorio.RepositorioPrivilegio;



/**
* Interface Service da entidade Privilegio.
* @see negocio.controlador.Privilegio
* @author Thiago Ribeiro Tavares
*/

public class ControladorPrivilegio {
	private RepositorioPrivilegio repositorio = new RepositorioPrivilegio();
	public ControladorPrivilegio(){
		
	}
	public void incluir(Privilegio pPrivilegio){
		try {
			System.out.println("Incluindo o Privilegio...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Salvando um objeto do tipo Privilegio na sess�o aberta
			repositorio.incluir(pPrivilegio);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclus�o de Privilegio realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir Privilegio",e);
		}
	}
	
	public void alterar(Privilegio pPrivilegio){
		try {
			System.out.println("Alterando o Privilegio...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo Privilegio na sess�o aberta
			repositorio.alterar(pPrivilegio);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Altera��o de Privilegio realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar Privilegio",e);
		}
	}
	
	
	public void remover(Privilegio pPrivilegio){
		try {
			System.out.println("Removendo o Privilegio...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo Privilegio na sess�o aberta
			repositorio.remover(pPrivilegio);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remo��o de Privilegio realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover Privilegio",e);
		}
	}
	
	public Privilegio consultarPorChavePrimaria(Privilegio pPrivilegio){
		try {
			System.out.println("Consultando Privilegio por chave prim�ria");
			Object id = pPrivilegio.getId();

			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Privilegio por chave prim�ria na sess�o aberta
			pPrivilegio = repositorio.consultarPorChavePrimaria(pPrivilegio);

			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (pPrivilegio == null)
				throw new RuntimeException("Registro n�o encontrado");
			System.out.println("Consulta por chave prim�ria de Privilegio realizada com sucesso...");

			return pPrivilegio;
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Privilegio por chave Prim�ria",e);
		}
		
	
	

	}
	
	public List<Privilegio> listar(){
		List<Privilegio> retorno;
		try {
			System.out.println("Consultando Privilegio por chave prim�ria");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Privilegio por chave prim�ria na sess�o aberta
			retorno = repositorio.listar();
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave prim�ria de Privilegio realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Privilegio por chave Prim�ria",e);
		}
		return retorno;
		
	}
	

}

