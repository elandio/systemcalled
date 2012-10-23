package negocio.apresentacao;

import negocio.basica.Chamado;
import negocio.basica.Computador;
import negocio.basica.Hardware;
import negocio.basica.Software;
import negocio.controlador.ControladorChamado;
import negocio.controlador.ControladorComputador;
import negocio.controlador.ControladorSoftware;

public class ApresentacaoComputador {
	public static void main (String [] args){
		ControladorComputador contcomp = new ControladorComputador();
		Computador comp = new Computador();

		Chamado cha = new Chamado();
		cha.setId(1);
		
		Software soft = new Software();
		soft.setId(1);
				
		Hardware hard = new Hardware();
		hard.setId(1);
		
		comp.setId(1);
		comp.setDescricao("financeiro 01");
		comp.setTipo("desktop");
		comp.setChamado(cha);
		comp.setSoftwares(soft);
		comp.setHardwares(hard);
		
		
	}

}
