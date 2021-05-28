package entities;

public class Funcionario extends Pessoa {

	private String cpf;
	private String matricula;
	private Double salario;
	private Funcao funcao;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(Integer id, String nome, String cpf, String matricula, Double salario) {
		super(id, nome);
		this.cpf = cpf;
		this.matricula = matricula;
		this.salario = salario;
	}

	public Funcionario(Integer id, String nome, String cpf, String matricula, Double salario, Funcao funcao) {
		super(id, nome);
		this.cpf = cpf;
		this.matricula = matricula;
		this.salario = salario;
		this.funcao = funcao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + getId() + ", nome=" + getNome() + ", cpf=" + cpf + ", matricula=" + matricula
				+ ", salario=" + salario + ",função:"+ funcao +"]";
	}

}
