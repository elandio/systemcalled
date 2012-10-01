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
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Salvando um objeto do tipo Orcamento na sess�o aberta
			repositorio.incluir(pOrcamento);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclus�o de Orcamento realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir Orcamento",e);
		}
	}
	
	public void alterar(Orcamento pOrcamento){
		try {
			System.out.println("Alterando o Orcamento...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo Orcamento na sess�o aberta
			repositorio.alterar(pOrcamento);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Altera��o de Orcamento realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar Orcamento",e);
		}
	}
	
	
	public void remover(Orcamento pOrcamento){
		try {
			System.out.println("Removendo o Orcamento...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo Orcamento na sess�o aberta
			repositorio.remover(pOrcamento);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remo��o de Orcamento realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover Orcamento",e);
		}
	}
	
	public Orcamento consultarPorChavePrimaria(Orcamento pOrcamento){
		try {
			System.out.println("Consultando Orcamento por chave prim�ria");
			Object id = pOrcamento.getId();

			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Orcamento por chave prim�ria na sess�o aberta
			pOrcamento = repositorio.consultarPorChavePrimaria(pOrcamento);

			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (pOrcamento == null)
				throw new RuntimeException("Registro n�o encontrado");
			System.out.println("Consulta por chave prim�ria de Orcamento realizada com sucesso...");

			return pOrcamento;
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Orcamento por chave Prim�ria",e);
		}
		
	
	

	}
	
	public List<Orcamento> listar(){
		List<Orcamento> retorno;
		try {
			System.out.println("Consultando Orcamento por chave prim�ria");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Orcamento por chave prim�ria na sess�o aberta
			retorno = repositorio.listar();
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave prim�ria de Orcamento realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Orcamento por chave Prim�ria",e);
		}
		return retorno;
		
	}
	

}

