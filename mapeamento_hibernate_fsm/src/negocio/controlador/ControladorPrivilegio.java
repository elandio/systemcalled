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
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Salvando um objeto do tipo Privilegio na sessão aberta
			repositorio.incluir(pPrivilegio);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclusão de Privilegio realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir Privilegio",e);
		}
	}
	
	public void alterar(Privilegio pPrivilegio){
		try {
			System.out.println("Alterando o Privilegio...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo Privilegio na sessão aberta
			repositorio.alterar(pPrivilegio);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Alteração de Privilegio realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar Privilegio",e);
		}
	}
	
	
	public void remover(Privilegio pPrivilegio){
		try {
			System.out.println("Removendo o Privilegio...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo Privilegio na sessão aberta
			repositorio.remover(pPrivilegio);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remoção de Privilegio realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover Privilegio",e);
		}
	}
	
	public Privilegio consultarPorChavePrimaria(Privilegio pPrivilegio){
		try {
			System.out.println("Consultando Privilegio por chave primária");
			Object id = pPrivilegio.getId();

			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Privilegio por chave primária na sessão aberta
			pPrivilegio = repositorio.consultarPorChavePrimaria(pPrivilegio);

			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (pPrivilegio == null)
				throw new RuntimeException("Registro não encontrado");
			System.out.println("Consulta por chave primária de Privilegio realizada com sucesso...");

			return pPrivilegio;
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Privilegio por chave Primária",e);
		}
		
	
	

	}
	
	public List<Privilegio> listar(){
		List<Privilegio> retorno;
		try {
			System.out.println("Consultando Privilegio por chave primária");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Privilegio por chave primária na sessão aberta
			retorno = repositorio.listar();
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave primária de Privilegio realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Privilegio por chave Primária",e);
		}
		return retorno;
		
	}
	

}

