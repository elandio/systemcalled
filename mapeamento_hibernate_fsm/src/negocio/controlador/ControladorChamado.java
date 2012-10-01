package negocio.controlador;
// Generated 24/09/2012 21:42:05 by Hibernate Tools 3.2.0.CR1


import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Chamado;
import negocio.repositorio.RepositorioChamado;



/**
* Interface Service da entidade Chamado.
* @see negocio.controlador.Chamado
* @author Thiago Ribeiro Tavares
*/

public class ControladorChamado {
	private RepositorioChamado repositorio = new RepositorioChamado();
	public ControladorChamado(){
		
	}
	public void incluir(Chamado pChamado){
		try {
			System.out.println("Incluindo o Chamado...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Salvando um objeto do tipo Chamado na sess�o aberta
			repositorio.incluir(pChamado);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclus�o de Chamado realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir Chamado",e);
		}
	}
	
	public void alterar(Chamado pChamado){
		try {
			System.out.println("Alterando o Chamado...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo Chamado na sess�o aberta
			repositorio.alterar(pChamado);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Altera��o de Chamado realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar Chamado",e);
		}
	}
	
	
	public void remover(Chamado pChamado){
		try {
			System.out.println("Removendo o Chamado...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo Chamado na sess�o aberta
			repositorio.remover(pChamado);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remo��o de Chamado realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover Chamado",e);
		}
	}
	
	public Chamado consultarPorChavePrimaria(Chamado pChamado){
		try {
			System.out.println("Consultando Chamado por chave prim�ria");
			Object id = pChamado.getId();

			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Chamado por chave prim�ria na sess�o aberta
			pChamado = repositorio.consultarPorChavePrimaria(pChamado);

			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (pChamado == null)
				throw new RuntimeException("Registro n�o encontrado");
			System.out.println("Consulta por chave prim�ria de Chamado realizada com sucesso...");

			return pChamado;
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Chamado por chave Prim�ria",e);
		}
		
	
	

	}
	
	public List<Chamado> listar(){
		List<Chamado> retorno;
		try {
			System.out.println("Consultando Chamado por chave prim�ria");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Chamado por chave prim�ria na sess�o aberta
			retorno = repositorio.listar();
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave prim�ria de Chamado realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Chamado por chave Prim�ria",e);
		}
		return retorno;
		
	}
	

}

