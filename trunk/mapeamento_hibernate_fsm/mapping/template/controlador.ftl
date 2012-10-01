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
			//Abrindo transação com o banco de dados
			${pojo.importType("hibernate.util.HibernateUtil")}.beginTransaction();
			//Salvando um objeto do tipo ${declarationName} na sessão aberta
			HibernateUtil.getSession().save(p${declarationName});
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Inclusão de ${declarationName} realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar incluir ${declarationName}",e);
		}
	}
	
	public void alterar(${declarationName} p${declarationName}){
		try {
			System.out.println("Alterando o ${declarationName}...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Alterando um objeto do tipo ${declarationName} na sessão aberta
			HibernateUtil.getSession().update(p${declarationName});
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Alteração de ${declarationName} realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar alterar ${declarationName}",e);
		}
	}
	
	
	public void remover(${declarationName} p${declarationName}){
		try {
			System.out.println("Removendo o ${declarationName}...");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Removendo um objeto do tipo ${declarationName} na sessão aberta
			HibernateUtil.getSession().delete(p${declarationName});
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Remoção de ${declarationName} realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Remover ${declarationName}",e);
		}
	}
	
	public ${declarationName} consultarPorChavePrimaria(${declarationName} p${declarationName}){
		<#if pojo.hasIdentifierProperty()>
		try {
			System.out.println("Consultando ${declarationName} por chave primária");
			Object id = p${declarationName}.get${pojo.getIdentifierProperty().getName().substring(0,1).toUpperCase()}${pojo.getIdentifierProperty().getName().substring(1)}();

			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo ${declarationName} por chave primária na sessão aberta
			p${declarationName} = (${declarationName}) HibernateUtil.getSession().get(${declarationName}.class,
					p${declarationName}.get${pojo.getIdentifierProperty().getName().substring(0,1).toUpperCase()}${pojo.getIdentifierProperty().getName().substring(1)}());

			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
	
			if (p${declarationName} == null)
				throw new RuntimeException("Registro não encontrado");
			System.out.println("Consulta por chave primária de ${declarationName} realizada com sucesso...");

			return p${declarationName};
		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar ${declarationName} por chave Primária",e);
		}
		
	</#if>
	<#if !pojo.hasIdentifierProperty()>
				throw new RuntimeException("O tipo ${declarationName} não tem chave primária!");
	</#if>
	
	

	}
	
	public ${pojo.importType("java.util.List")}<${declarationName}> listar(){
		List<${declarationName}> retorno;
		try {
			System.out.println("Consultando ${declarationName} por chave primária");
			//Abrindo transação com o banco de dados
			HibernateUtil.beginTransaction();
			//Consultando objeto do tipo ${declarationName} por chave primária na sessão aberta
			retorno = HibernateUtil.getSession().createCriteria(${declarationName}.class).list();
			//Efetuando um commit na transação (aqui, as informações são persistidas "de fato")
			HibernateUtil.commitTransaction();
		
			System.out.println("Consulta por chave primária de ${declarationName} realizada com sucesso...");

		} catch (Exception e) {
			HibernateUtil.rollbackTransaction();
			throw new RuntimeException("Erro ao tentar Consultar ${declarationName} por chave Primária",e);
		}
		return retorno;
		
	}
	

}

</#assign>

${pojo.generateImports()}
${classbody}