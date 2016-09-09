package aula5;

public class Diretor extends Funcionario implements Autenticavel{
	
	public double getBonus(){
		return this.salario * 0.35;
	}
	public void cobraRelatorios(){
		System.out.println("Preciso dos relatorios");
	}
	
	@Override
	public boolean autentica(int senha) {
		// regras
		return super.autentica(senha);
	}
	
	
}
