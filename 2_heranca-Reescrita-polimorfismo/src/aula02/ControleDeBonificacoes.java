package aula02;

public class ControleDeBonificacoes {
	private double totaldebonificacoes = 0;

	public void registra(Funcionario funcionario) {
		this.totaldebonificacoes += funcionario.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totaldebonificacoes;
	}
}
