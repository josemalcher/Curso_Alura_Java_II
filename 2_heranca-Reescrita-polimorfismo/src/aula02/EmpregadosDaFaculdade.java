package aula02;

public class EmpregadosDaFaculdade {
	private String nome;
	private double salario;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	double getGastos(){
		return this.salario;
	}
	
	String getInfo(){
		return "nome: " + this.nome + " com salário " + this.salario;
	}
	
	
}
