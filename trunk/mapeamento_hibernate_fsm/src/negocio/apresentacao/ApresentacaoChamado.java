package negocio.apresentacao;

import java.util.Date;

import negocio.basica.Chamado;
import negocio.basica.Funcionario;
import negocio.basica.Orcamento;
import negocio.basica.Tipochamado;
import negocio.controlador.ControladorChamado;

public class ApresentacaoChamado {

	public static void main(String[] args) {
		ControladorChamado contcha = new ControladorChamado();
		Chamado cha = new Chamado();
		
		Tipochamado tc = new Tipochamado();
		tc.setId(1);
		Orcamento orc = new Orcamento();
		orc.setId(1);
		Funcionario func = new Funcionario();
		func.setId(1);
		
		cha.setId(1);
		cha.setTipochamado(tc);
		cha.setOrcamento(orc);
		cha.setFuncionario(func);
		cha.setDescricao("Chamado 001");
		cha.setDtchamado(new Date());
		cha.setObservacao("nao funciona");
		
	}

}
