package negocio.controlador;
// Generated 24/09/2012 21:42:05 by Hibernate Tools 3.2.0.CR1


import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Orcamento;
import negocio.repositorio.RepositorioOrcamento;



/**
* Interface Service da entidade Orcamento.
* @see negocio.controlador.Orcamento
* @author Thiago Ribeiro Tavares
*/

public class ControladorOrcamento {
	private RepositorioOrcamento repositorio = new RepositorioOrcamento();
	public ControladorOrcamento(){
		
	}
	public void incluir(Orcamento pOrcamento){
		try {
			System.out.println("Incluindo o Orcamento...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Salvando um objeto do tipo Orcamento na sessão aberta
			repositorio.incluir(pOrcamento);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclusão de Orcamento realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir Orcamento",e);
		}
	}
	
	public void alterar(Orcamento pOrcamento){
		try {
			System.out.println("Alterando o Orcamento...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo Orcamento na sessão aberta
			repositorio.alterar(pOrcamento);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Alteração de Orcamento realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar Orcamento",e);
		}
	}
	
	
	public void remover(Orcamento pOrcamento){
		try {
			System.out.println("Removendo o Orcamento...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo Orcamento na sessão aberta
			repositorio.remover(pOrcamento);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remoção de Orcamento realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover Orcamento",e);
		}
	}
	
	public Orcamento consultarPorChavePrimaria(Orcamento pOrcamento){
		try {
			System.out.println("Consultando Orcamento por chave primária");
			Object id = pOrcamento.getId();

			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Orcamento por chave primária na sessão aberta
			pOrcamento = repositorio.consultarPorChavePrimaria(pOrcamento);

			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (pOrcamento == null)
				throw new RuntimeException("Registro não encontrado");
			System.out.println("Consulta por chave primária de Orcamento realizada com sucesso...");

			return pOrcamento;
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Orcamento por chave Primária",e);
		}
		
	
	

	}
	
	public List<Orcamento> listar(){
		List<Orcamento> retorno;
		try {
			System.out.println("Consultando Orcamento por chave primária");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Orcamento por chave primária na sessão aberta
			retorno = repositorio.listar();
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave primária de Orcamento realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Orcamento por chave Primária",e);
		}
		return retorno;
		
	}
	

}

