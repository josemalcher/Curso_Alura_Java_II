package aula5;

public abstract class Funcionario {

	protected String nome;
	protected String cpf;
	protected double salario;
	private int senha;
	
	public abstract double getBonus();
	//public abstract double getBonificacao();

	public boolean autentica(int senha) {
		
		return this.senha == senha;
	}
	
	//get e sets
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
	
}
