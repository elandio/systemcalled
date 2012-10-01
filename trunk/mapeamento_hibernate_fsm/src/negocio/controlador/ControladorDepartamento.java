package negocio.controlador;
// Generated 24/09/2012 21:42:05 by Hibernate Tools 3.2.0.CR1


import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Departamento;
import negocio.repositorio.RepositorioDepartamento;



/**
* Interface Service da entidade Departamento.
* @see negocio.controlador.Departamento
* @author Thiago Ribeiro Tavares
*/

public class ControladorDepartamento {
	private RepositorioDepartamento repositorio = new RepositorioDepartamento();
	public ControladorDepartamento(){
		
	}
	public void incluir(Departamento pDepartamento){
		try {
			System.out.println("Incluindo o Departamento...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Salvando um objeto do tipo Departamento na sessão aberta
			repositorio.incluir(pDepartamento);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclusão de Departamento realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir Departamento",e);
		}
	}
	
	public void alterar(Departamento pDepartamento){
		try {
			System.out.println("Alterando o Departamento...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo Departamento na sessão aberta
			repositorio.alterar(pDepartamento);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Alteração de Departamento realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar Departamento",e);
		}
	}
	
	
	public void remover(Departamento pDepartamento){
		try {
			System.out.println("Removendo o Departamento...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo Departamento na sessão aberta
			repositorio.remover(pDepartamento);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remoção de Departamento realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover Departamento",e);
		}
	}
	
	public Departamento consultarPorChavePrimaria(Departamento pDepartamento){
		try {
			System.out.println("Consultando Departamento por chave primária");
			Object id = pDepartamento.getId();

			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Departamento por chave primária na sessão aberta
			pDepartamento = repositorio.consultarPorChavePrimaria(pDepartamento);

			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (pDepartamento == null)
				throw new RuntimeException("Registro não encontrado");
			System.out.println("Consulta por chave primária de Departamento realizada com sucesso...");

			return pDepartamento;
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Departamento por chave Primária",e);
		}
		
	
	

	}
	
	public List<Departamento> listar(){
		List<Departamento> retorno;
		try {
			System.out.println("Consultando Departamento por chave primária");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Departamento por chave primária na sessão aberta
			retorno = repositorio.listar();
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave primária de Departamento realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Departamento por chave Primária",e);
		}
		return retorno;
		
	}
	

}

