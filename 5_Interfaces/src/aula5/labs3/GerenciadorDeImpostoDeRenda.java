package aula5.labs3;

public class GerenciadorDeImpostoDeRenda {

	private double total;
	
	public void adicionar(Tributavel t){
		System.out.println("Adicionando Tributavel " + t);
		this.total += t.calculaTributos();
	}
	
	public double getTotal(){
		return this.total;
	}
	
}
