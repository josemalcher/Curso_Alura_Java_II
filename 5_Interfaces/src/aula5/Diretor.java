package aula5;

public class Diretor extends Funcionario {
	@Override
	public double getBonus(){
		return this.salario * 0.35;
	}
	public void cobraRelatorios(){
		System.out.println("Preciso dos relatorios");
	}
}
