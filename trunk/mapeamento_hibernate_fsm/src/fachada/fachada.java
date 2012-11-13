package fachada;

import java.util.List;

import negocio.basica.Chamado;
import negocio.basica.Computador;
import negocio.basica.Departamento;
import negocio.basica.Funcionario;
import negocio.basica.Hardware;
import negocio.basica.Monitor;
import negocio.basica.Orcamento;
import negocio.basica.Privilegio;
import negocio.basica.Software;
import negocio.basica.Tipochamado;
import negocio.controlador.ControladorChamado;
import negocio.controlador.ControladorComputador;
import negocio.controlador.ControladorDepartamento;
import negocio.controlador.ControladorFuncionario;
import negocio.controlador.ControladorHardware;
import negocio.controlador.ControladorMonitor;
import negocio.controlador.ControladorOrcamento;
import negocio.controlador.ControladorPrivilegio;
import negocio.controlador.ControladorSoftware;
import negocio.controlador.ControladorTipochamado;

public class fachada {
	private ControladorChamado contChamado = null;
	private ControladorComputador contComputador =null;
	private ControladorDepartamento contDepartamento =null;
	private ControladorFuncionario contFuncionario = null;
	private ControladorHardware contHardware = null;
	private ControladorMonitor contMonitor = null;
	private ControladorOrcamento contOrcamento = null;
	private ControladorPrivilegio contPrivilegio = null;
	private ControladorSoftware contSoftware = null;
	private ControladorTipochamado contTipoChamado = null;
		
	
	public void incluirComputador(Computador pComputador) {
		contComputador.incluir(pComputador);
	}

	public void alterarComputador(Computador pComputador) {
		contComputador.alterar(pComputador);
	}

	public void removerComputador(Computador pComputador) {
		contComputador.remover(pComputador);
	}

	public Computador consultarComputadorPorChavePrimaria(Computador pComputador) {
		return contComputador.consultarPorChavePrimaria(pComputador);
	}

	public void incluirDepartamento(Departamento pDepartamento) {
		contDepartamento.incluir(pDepartamento);
	}

	public void alterarDepartamento(Departamento pDepartamento) {
		contDepartamento.alterar(pDepartamento);
	}

	public void removerDepartamento(Departamento pDepartamento) {
		contDepartamento.remover(pDepartamento);
	}

	public Departamento consultarDepartamentoPorChavePrimaria(Departamento pDepartamento) {
		return contDepartamento.consultarPorChavePrimaria(pDepartamento);
	}

	public void incluirFuncionario(Funcionario pFuncionario) {
		contFuncionario.incluir(pFuncionario);
	}

	public void alterarFuncionario(Funcionario pFuncionario) {
		contFuncionario.alterar(pFuncionario);
	}

	public void removerFuncionario(Funcionario pFuncionario) {
		contFuncionario.remover(pFuncionario);
	}

	public Funcionario consultarFuncionarioPorChavePrimaria(Funcionario pFuncionario) {
		return contFuncionario.consultarPorChavePrimaria(pFuncionario);
	}

	public void incluirHardware(Hardware pHardware) {
		contHardware.incluir(pHardware);
	}

	public void alterarHardware(Hardware pHardware) {
		contHardware.alterar(pHardware);
	}

	public void remover(Hardware pHardware) {
		contHardware.remover(pHardware);
	}

	public Hardware consultarHardwarePorChavePrimaria(Hardware pHardware) {
		return contHardware.consultarPorChavePrimaria(pHardware);
	}

	public void incluirMonitor(Monitor pMonitor) {
		contMonitor.incluir(pMonitor);
	}

	public void alterarMonitor(Monitor pMonitor) {
		contMonitor.alterar(pMonitor);
	}

	public void removerMonitor(Monitor pMonitor) {
		contMonitor.remover(pMonitor);
	}

	public Monitor consultarMonitorPorChavePrimaria(Monitor pMonitor) {
		return contMonitor.consultarPorChavePrimaria(pMonitor);
	}

	public void incluirOrcamento(Orcamento pOrcamento) {
		contOrcamento.incluir(pOrcamento);
	}

	public void alterarOrcamento(Orcamento pOrcamento) {
		contOrcamento.alterar(pOrcamento);
	}

	public void removerOrcamento(Orcamento pOrcamento) {
		contOrcamento.remover(pOrcamento);
	}

	public Orcamento consultarOrcamentoPorChavePrimaria(Orcamento pOrcamento) {
		return contOrcamento.consultarPorChavePrimaria(pOrcamento);
	}

	public void incluirPrivilegio(Privilegio pPrivilegio) {
		contPrivilegio.incluir(pPrivilegio);
	}

	public void alterarPrivilegio(Privilegio pPrivilegio) {
		contPrivilegio.alterar(pPrivilegio);
	}

	public void removerPrivilegio(Privilegio pPrivilegio) {
		contPrivilegio.remover(pPrivilegio);
	}

	public Privilegio consultarPrivilegioPorChavePrimaria(Privilegio pPrivilegio) {
		return contPrivilegio.consultarPorChavePrimaria(pPrivilegio);
	}

	public void incluirSoftware(Software pSoftware) {
		contSoftware.incluir(pSoftware);
	}

	public void alterarSoftware(Software pSoftware) {
		contSoftware.alterar(pSoftware);
	}

	public void removerSoftware(Software pSoftware) {
		contSoftware.remover(pSoftware);
	}

	public Software consultarSoftwarePorChavePrimaria(Software pSoftware) {
		return contSoftware.consultarPorChavePrimaria(pSoftware);
	}

	public void incluirTipochamado(Tipochamado pTipochamado) {
		contTipoChamado.incluir(pTipochamado);
	}

	public void alterarTipochamado(Tipochamado pTipochamado) {
		contTipoChamado.alterar(pTipochamado);
	}

	public void removerTipochamado(Tipochamado pTipochamado) {
		contTipoChamado.remover(pTipochamado);
	}

	public Tipochamado consultarTipochamadoPorChavePrimaria(Tipochamado pTipochamado) {
		return contTipoChamado.consultarPorChavePrimaria(pTipochamado);
	}

	public void incluirChamado(Chamado pChamado) {
		contChamado.incluir(pChamado);
	}

	public void alterarChamado(Chamado pChamado) {
		contChamado.alterar(pChamado);
	}

	public int hashCode() {
		return contChamado.hashCode();
	}

	public void removerChamado(Chamado pChamado) {
		contChamado.remover(pChamado);
	}

	public Chamado consultarChamadoPorChavePrimaria(Chamado pChamado) {
		return contChamado.consultarPorChavePrimaria(pChamado);
	}

	public List<Chamado> listar() {
		return contChamado.listar();
	}

	public boolean equals(Object obj) {
		return contChamado.equals(obj);
	}

	public String toString() {
		return contChamado.toString();
	}
	

}
