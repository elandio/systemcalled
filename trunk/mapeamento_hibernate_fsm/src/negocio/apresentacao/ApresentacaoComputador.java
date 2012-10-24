package negocio.apresentacao;

import negocio.basica.Chamado;
import negocio.basica.Computador;
import negocio.basica.Hardware;
import negocio.basica.Monitor;
import negocio.basica.Software;
import negocio.controlador.ControladorComputador;

public class ApresentacaoComputador {

	public static void main(String[] args) {
		ControladorComputador contComput = new ControladorComputador();
		Computador comp = new Computador();
		Chamado cham = new Chamado();
		Monitor monitors = new Monitor();
		Software softwares = new Software();
		Hardware hardwares = new Hardware();
		
		cham.setId(1);
		monitors.setId(1);
		softwares.setId(1);
		hardwares.setId(1);
		
		comp.setId(1);
		comp.setChamado(cham);
		comp.setDescricao("Computdor localizado no setor Financeiro");
		comp.setTipo("Desktop");
		comp.setMonitors(null);
		comp.setSoftwares(null);
		comp.setHardwares(null);
		
		contComput.incluir(comp);

	}

}
