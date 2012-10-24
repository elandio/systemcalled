package negocio.apresentacao;

import java.util.Date;

import negocio.basica.Chamado;
import negocio.basica.Funcionario;
import negocio.basica.Orcamento;
import negocio.basica.Tipochamado;
import negocio.controlador.ControladorChamado;

public class ApresentacaoChamado {

	public static void main(String[] args) {
		ControladorChamado contCham = new ControladorChamado();
		Chamado cham = new Chamado();
		Tipochamado tipoCham = new Tipochamado();
		Orcamento orc = new Orcamento();
		Funcionario func = new Funcionario();
		
		tipoCham.setId(1);
		orc.setId(1);
		func.setId(1);
		
		cham.setId(1);
		cham.setTipochamado(tipoCham);
		cham.setOrcamento(orc);
		cham.setFuncionario(func);
		cham.setNome("Thiago Lins");
		cham.setOrigem("Finanças");
		cham.setSituacao("Aberto");
		cham.setDescricao("Computador apresentando problema no carregamento do sistema");
		cham.setDtchamado(new Date());
		cham.setObservacao("Solicito urgência no atendimento");
		cham.setComputadors(null);
		
		contCham.incluir(cham);
	}
}
