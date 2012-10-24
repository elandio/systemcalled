package negocio.basica;

// Generated 24/09/2012 21:42:02 by Hibernate Tools 3.2.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Funcionario generated by hbm2java
 */
public class Funcionario implements java.io.Serializable {

	private int id;
	private Departamento departamento;
	private Privilegio privilegio;
	private String nome;
	private String email;
	private String cpf;
	private String rg;
	private Date dtnascimento;
	private String endereco;
	private String bairro;
	private String cidade;
	private String cep;
	private String telefone;
	private String login;
	private String senha;
	private String cargo;
	private String estado;
	private Set chamados = new HashSet(0);

	public Funcionario() {
	}

	public Funcionario(int id, Departamento departamento, Privilegio privilegio) {
		this.id = id;
		this.departamento = departamento;
		this.privilegio = privilegio;
	}

	public Funcionario(int id, Departamento departamento,
			Privilegio privilegio, String nome, String email, String cpf,
			String rg, Date dtnascimento, String endereco, String bairro,
			String cidade, String cep, String telefone, String login,
			String senha, String cargo, String estado, Set chamados) {
		this.id = id;
		this.departamento = departamento;
		this.privilegio = privilegio;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.rg = rg;
		this.dtnascimento = dtnascimento;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.telefone = telefone;
		this.login = login;
		this.senha = senha;
		this.cargo = cargo;
		this.estado = estado;
		this.chamados = chamados;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Departamento getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Privilegio getPrivilegio() {
		return this.privilegio;
	}

	public void setPrivilegio(Privilegio privilegio) {
		this.privilegio = privilegio;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDtnascimento() {
		return this.dtnascimento;
	}

	public void setDtnascimento(Date dtnascimento) {
		this.dtnascimento = dtnascimento;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Set getChamados() {
		return this.chamados;
	}

	public void setChamados(Set chamados) {
		this.chamados = chamados;
	}
}
