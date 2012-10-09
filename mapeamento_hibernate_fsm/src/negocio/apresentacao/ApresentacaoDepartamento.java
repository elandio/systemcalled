package negocio.apresentacao;

import negocio.basica.Departamento;
import negocio.controlador.ControladorDepartamento;
import negocio.repositorio.RepositorioDepartamento;

public class ApresentacaoDepartamento {

	public static void main (String[] args){
		ControladorDepartamento con = new ControladorDepartamento();
		Departamento dep = new Departamento();
		dep.setId(1);
		dep.setNome("FC");
		dep.setDescricao("Financeiro");
		con.incluir(dep);

	}
	
}
