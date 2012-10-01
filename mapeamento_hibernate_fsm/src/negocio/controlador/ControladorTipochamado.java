package negocio.controlador;
// Generated 24/09/2012 21:42:05 by Hibernate Tools 3.2.0.CR1


import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Tipochamado;
import negocio.repositorio.RepositorioTipoChamado;



/**
* Interface Service da entidade Tipochamado.
* @see negocio.controlador.Tipochamado
* @author Thiago Ribeiro Tavares
*/

public class ControladorTipochamado {
	private RepositorioTipoChamado repositorio = new RepositorioTipoChamado();
	public ControladorTipochamado(){
		
	}
	public void incluir(Tipochamado pTipochamado){
		try {
			System.out.println("Incluindo o Tipochamado...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Salvando um objeto do tipo Tipochamado na sessão aberta
			repositorio.incluir(pTipochamado);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclusão de Tipochamado realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir Tipochamado",e);
		}
	}
	
	public void alterar(Tipochamado pTipochamado){
		try {
			System.out.println("Alterando o Tipochamado...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo Tipochamado na sessão aberta
			repositorio.alterar(pTipochamado);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Alteração de Tipochamado realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar Tipochamado",e);
		}
	}
	
	
	public void remover(Tipochamado pTipochamado){
		try {
			System.out.println("Removendo o Tipochamado...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo Tipochamado na sessão aberta
			repositorio.remover(pTipochamado);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remoção de Tipochamado realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover Tipochamado",e);
		}
	}
	
	public Tipochamado consultarPorChavePrimaria(Tipochamado pTipochamado){
		try {
			System.out.println("Consultando Tipochamado por chave primária");
			Object id = pTipochamado.getId();

			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Tipochamado por chave primária na sessão aberta
			pTipochamado = repositorio.consultarPorChavePrimaria(pTipochamado);

			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (pTipochamado == null)
				throw new RuntimeException("Registro não encontrado");
			System.out.println("Consulta por chave primária de Tipochamado realizada com sucesso...");

			return pTipochamado;
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Tipochamado por chave Primária",e);
		}
		
	
	

	}
	
	public List<Tipochamado> listar(){
		List<Tipochamado> retorno;
		try {
			System.out.println("Consultando Tipochamado por chave primária");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Tipochamado por chave primária na sessão aberta
			retorno = repositorio.listar();
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave primária de Tipochamado realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Tipochamado por chave Primária",e);
		}
		return retorno;
		
	}
	

}

