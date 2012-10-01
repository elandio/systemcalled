package negocio.controlador;
// Generated 24/09/2012 21:42:05 by Hibernate Tools 3.2.0.CR1


import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Funcionario;
import negocio.repositorio.RepositorioFuncionario;



/**
* Interface Service da entidade Funcionario.
* @see negocio.controlador.Funcionario
* @author Thiago Ribeiro Tavares
*/

public class ControladorFuncionario {
	private RepositorioFuncionario repositorio = new RepositorioFuncionario();
	public ControladorFuncionario(){
		
	}
	public void incluir(Funcionario pFuncionario){
		try {
			System.out.println("Incluindo o Funcionario...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Salvando um objeto do tipo Funcionario na sessão aberta
			repositorio.incluir(pFuncionario);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclusão de Funcionario realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir Funcionario",e);
		}
	}
	
	public void alterar(Funcionario pFuncionario){
		try {
			System.out.println("Alterando o Funcionario...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo Funcionario na sessão aberta
			repositorio.alterar(pFuncionario);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Alteração de Funcionario realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar Funcionario",e);
		}
	}
	
	
	public void remover(Funcionario pFuncionario){
		try {
			System.out.println("Removendo o Funcionario...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo Funcionario na sessão aberta
			repositorio.remover(pFuncionario);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remoção de Funcionario realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover Funcionario",e);
		}
	}
	
	public Funcionario consultarPorChavePrimaria(Funcionario pFuncionario){
		try {
			System.out.println("Consultando Funcionario por chave primária");
			Object id = pFuncionario.getId();

			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Funcionario por chave primária na sessão aberta
			pFuncionario = repositorio.consultarPorChavePrimaria(pFuncionario);

			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (pFuncionario == null)
				throw new RuntimeException("Registro não encontrado");
			System.out.println("Consulta por chave primária de Funcionario realizada com sucesso...");

			return pFuncionario;
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Funcionario por chave Primária",e);
		}
		
	
	

	}
	
	public List<Funcionario> listar(){
		List<Funcionario> retorno;
		try {
			System.out.println("Consultando Funcionario por chave primária");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Funcionario por chave primária na sessão aberta
			retorno = repositorio.listar();
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave primária de Funcionario realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Funcionario por chave Primária",e);
		}
		return retorno;
		
	}
	

}

