package negocio.apresentacao;

import negocio.basica.Departamento;
import negocio.basica.Funcionario;
import negocio.controlador.ControladorDepartamento;

public class ApresentacaoDepartamento {

	public static void main (String[] args){
		ControladorDepartamento contdept = new ControladorDepartamento();
		Departamento dept = new Departamento();
		
		Funcionario func = new Funcionario();
		func.setId(1);
		
		dept.setId(1);
		dept.setNome("FC");
		dept.setDescricao("Contabilidde");
		dept.setFuncionarios(func);
		contdept.incluir(dept);

	}
	
}
