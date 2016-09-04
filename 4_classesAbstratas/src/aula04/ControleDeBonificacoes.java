package aula04;

public class ControleDeBonificacoes {

	private double totalDeBonificacoes = 0;
	
	public void registra(Funcionario f){
		System.out.println("Adiciona bonifica��o ao funcionario " + f.nome);
		this.totalDeBonificacoes += f.getBonificacao();
	}
	
	public double getTotalDeBonificacoes(){
		return this.totalDeBonificacoes;
	}

	/*public void setTotalDeBonificacoes(double totalDeBonificacoes) {
		this.totalDeBonificacoes = totalDeBonificacoes;
	}
	*/
	
	
	
	
}
