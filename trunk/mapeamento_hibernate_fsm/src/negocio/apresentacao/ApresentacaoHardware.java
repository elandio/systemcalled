package negocio.apresentacao;

import java.util.Date;

import negocio.basica.Computador;
import negocio.basica.Hardware;
import negocio.controlador.ControladorHardware;

public class ApresentacaoHardware {

public static void main (String [] args){
	ControladorHardware conthard = new ControladorHardware();
	Hardware hard = new Hardware();
	Computador computador = new Computador();
	computador.setId(1);
		
	hard.setId(1);
	hard.setMarca("seagate");
	hard.setModelo("st001");
	hard.setGarantia("1 ano");
	hard.setDtcompra(new Date());
	hard.setComputador(computador);
	
	}
}
