package negocio.controlador;
// Generated 24/09/2012 21:42:05 by Hibernate Tools 3.2.0.CR1


import hibernate.util.HibernateUtil;

import java.util.List;

import negocio.basica.Computador;
import negocio.repositorio.RepositorioComputador;



/**
* Interface Service da entidade Computador.
* @see negocio.controlador.Computador
* @author Thiago Ribeiro Tavares
*/

public class ControladorComputador {
	private RepositorioComputador repositorio = new RepositorioComputador();
	public ControladorComputador(){
		
	}
	public void incluir(Computador pComputador){
		try {
			System.out.println("Incluindo o Computador...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Salvando um objeto do tipo Computador na sessão aberta
			repositorio.incluir(pComputador);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclusão de Computador realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir Computador",e);
		}
	}
	
	public void alterar(Computador pComputador){
		try {
			System.out.println("Alterando o Computador...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo Computador na sessão aberta
			repositorio.alterar(pComputador);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Alteração de Computador realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar Computador",e);
		}
	}
	
	
	public void remover(Computador pComputador){
		try {
			System.out.println("Removendo o Computador...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo Computador na sessão aberta
			repositorio.remover(pComputador);
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remoção de Computador realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover Computador",e);
		}
	}
	
	public Computador consultarPorChavePrimaria(Computador pComputador){
		try {
			System.out.println("Consultando Computador por chave primária");
			Object id = pComputador.getId();

			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Computador por chave primária na sessão aberta
			pComputador = repositorio.consultarPorChavePrimaria(pComputador);

			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (pComputador == null)
				throw new RuntimeException("Registro não encontrado");
			System.out.println("Consulta por chave primária de Computador realizada com sucesso...");

			return pComputador;
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Computador por chave Primária",e);
		}
		
	
	

	}
	
	public List<Computador> listar(){
		List<Computador> retorno;
		try {
			System.out.println("Consultando Computador por chave primária");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Computador por chave primária na sessão aberta
			retorno = repositorio.listar();
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave primária de Computador realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Computador por chave Primária",e);
		}
		return retorno;
		
	}
	

}

