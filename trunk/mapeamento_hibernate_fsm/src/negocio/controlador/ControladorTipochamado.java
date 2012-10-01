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
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Salvando um objeto do tipo Tipochamado na sess�o aberta
			repositorio.incluir(pTipochamado);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclus�o de Tipochamado realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir Tipochamado",e);
		}
	}
	
	public void alterar(Tipochamado pTipochamado){
		try {
			System.out.println("Alterando o Tipochamado...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo Tipochamado na sess�o aberta
			repositorio.alterar(pTipochamado);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Altera��o de Tipochamado realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar Tipochamado",e);
		}
	}
	
	
	public void remover(Tipochamado pTipochamado){
		try {
			System.out.println("Removendo o Tipochamado...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo Tipochamado na sess�o aberta
			repositorio.remover(pTipochamado);
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remo��o de Tipochamado realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover Tipochamado",e);
		}
	}
	
	public Tipochamado consultarPorChavePrimaria(Tipochamado pTipochamado){
		try {
			System.out.println("Consultando Tipochamado por chave prim�ria");
			Object id = pTipochamado.getId();

			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Tipochamado por chave prim�ria na sess�o aberta
			pTipochamado = repositorio.consultarPorChavePrimaria(pTipochamado);

			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (pTipochamado == null)
				throw new RuntimeException("Registro n�o encontrado");
			System.out.println("Consulta por chave prim�ria de Tipochamado realizada com sucesso...");

			return pTipochamado;
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Tipochamado por chave Prim�ria",e);
		}
		
	
	

	}
	
	public List<Tipochamado> listar(){
		List<Tipochamado> retorno;
		try {
			System.out.println("Consultando Tipochamado por chave prim�ria");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo Tipochamado por chave prim�ria na sess�o aberta
			retorno = repositorio.listar();
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave prim�ria de Tipochamado realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar Tipochamado por chave Prim�ria",e);
		}
		return retorno;
		
	}
	

}

