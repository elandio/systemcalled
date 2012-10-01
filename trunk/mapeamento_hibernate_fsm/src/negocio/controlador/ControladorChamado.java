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
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Salvando um objeto do tipo Chamado na sessão aberta
			repositorio.incluir(pChamado);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclusão de Chamado realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir Chamado",e);
		}
	}
	
	public void alterar(Chamado pChamado){
		try {
			System.out.println("Alterando o Chamado...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo Chamado na sessão aberta
			repositorio.alterar(pChamado);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Alteração de Chamado realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar Chamado",e);
		}
	}
	
	
	public void remover(Chamado pChamado){
		try {
			System.out.println("Removendo o Chamado...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo Chamado na sessão aberta
			repositorio.remover(pChamado);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remoção de Chamado realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover Chamado",e);
		}
	}
	
	public Chamado consultarPorChavePrimaria(Chamado pChamado){
		try {
			System.out.println("Consultando Chamado por chave primária");
			Object id = pChamado.getId();

			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Chamado por chave primária na sessão aberta
			pChamado = repositorio.consultarPorChavePrimaria(pChamado);

			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (pChamado == null)
				throw new RuntimeException("Registro não encontrado");
			System.out.println("Consulta por chave primária de Chamado realizada com sucesso...");

			return pChamado;
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Chamado por chave Primária",e);
		}
		
	
	

	}
	
	public List<Chamado> listar(){
		List<Chamado> retorno;
		try {
			System.out.println("Consultando Chamado por chave primária");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Chamado por chave primária na sessão aberta
			retorno = repositorio.listar();
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave primária de Chamado realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Chamado por chave Primária",e);
		}
		return retorno;
		
	}
	

}

