package negocio.apresentacao;

import negocio.basica.Departamento;
import negocio.basica.Funcionario;
import negocio.controlador.ControladorDepartamento;

public class ApresentacaoDepartamento {

	public static void main(String[] args) {
		ControladorDepartamento compDept = new ControladorDepartamento();
		Departamento dept = new Departamento();
		Funcionario funcionarios = new Funcionario();
		
		funcionarios.setId(1);
		
		dept.setId(1);
		dept.setNome("Finan�as");
		dept.setDescricao("Departamendo de Finan�as");
		dept.setFuncionarios(null);
		
		compDept.alterar(dept);
	}

}
