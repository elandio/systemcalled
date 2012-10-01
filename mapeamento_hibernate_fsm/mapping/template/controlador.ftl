${pojo.getPackageDeclaration()}
// Generated ${date} by Hibernate Tools ${version}

<#assign classbody>

<#assign declarationName = pojo.importType(pojo.getDeclarationName())>

/**
* Interface Service da entidade ${declarationName}.
* @see ${pojo.getQualifiedDeclarationName()}
* @author Thiago Ribeiro Tavares
*/

public class Controlador${declarationName} {
	
	public Controlador${declarationName}(){
		
	}
	public void incluir(${declarationName} p${declarationName}){
		try {
			System.out.println("Incluindo o ${declarationName}...");
			//Abrindo transa��o com o banco de dados
			${pojo.importType("hibernate.util.HibernateUtil")}.beginTransaction();
			//Salvando um objeto do tipo ${declarationName} na sess�o aberta
			HibernateUtil.getSession().save(p${declarationName});
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclus�o de ${declarationName} realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir ${declarationName}",e);
		}
	}
	
	public void alterar(${declarationName} p${declarationName}){
		try {
			System.out.println("Alterando o ${declarationName}...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo ${declarationName} na sess�o aberta
			HibernateUtil.getSession().update(p${declarationName});
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Altera��o de ${declarationName} realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar ${declarationName}",e);
		}
	}
	
	
	public void remover(${declarationName} p${declarationName}){
		try {
			System.out.println("Removendo o ${declarationName}...");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo ${declarationName} na sess�o aberta
			HibernateUtil.getSession().delete(p${declarationName});
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remo��o de ${declarationName} realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover ${declarationName}",e);
		}
	}
	
	public ${declarationName} consultarPorChavePrimaria(${declarationName} p${declarationName}){
		<#if pojo.hasIdentifierProperty()>
		try {
			System.out.println("Consultando ${declarationName} por chave prim�ria");
			Object id = p${declarationName}.get${pojo.getIdentifierProperty().getName().substring(0,1).toUpperCase()}${pojo.getIdentifierProperty().getName().substring(1)}();

			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo ${declarationName} por chave prim�ria na sess�o aberta
			p${declarationName} = (${declarationName}) HibernateUtil.getSession().get(${declarationName}.class,
					p${declarationName}.get${pojo.getIdentifierProperty().getName().substring(0,1).toUpperCase()}${pojo.getIdentifierProperty().getName().substring(1)}());

			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (p${declarationName} == null)
				throw new RuntimeException("Registro n�o encontrado");
			System.out.println("Consulta por chave prim�ria de ${declarationName} realizada com sucesso...");

			return p${declarationName};
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar ${declarationName} por chave Prim�ria",e);
		}
		
	</#if>
	<#if !pojo.hasIdentifierProperty()>
				throw new RuntimeException("O tipo ${declarationName} n�o tem chave prim�ria!");
	</#if>
	
	

	}
	
	public ${pojo.importType("java.util.List")}<${declarationName}> listar(){
		List<${declarationName}> retorno;
		try {
			System.out.println("Consultando ${declarationName} por chave prim�ria");
			//Abrindo transa��o com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo ${declarationName} por chave prim�ria na sess�o aberta
			retorno = HibernateUtil.getSession().createCriteria(${declarationName}.class).list();
			//Efetuando um commit na transa��o (aqui, as informa��es s�o persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave prim�ria de ${declarationName} realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar ${declarationName} por chave Prim�ria",e);
		}
		return retorno;
		
	}
	

}

</#assign>

${pojo.generateImports()}
${classbody}