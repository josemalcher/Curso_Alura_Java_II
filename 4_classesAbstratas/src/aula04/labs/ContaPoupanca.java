package aula04.labs;

public class ContaPoupanca extends Conta {

	@Override
	public void atualiza(double taxa) {

		this.saldo += this.saldo * taxa * 3;

	}

	@Override
	public void deposita(double valorDeposito) {
		this.saldo += valorDeposito - 0.10;
	}

	/*
	 * Se você usou o recurso de sobrescrever o método automaticamente pelo
	 * Eclipse, ele adicionou a anotação @Override. Ela ajuda o compilador a
	 * dizer se você errou o nome do método, parâmetros etc, uma vez que se o
	 * método não sobrescrever o método (abstrato ou não) de sua classe pai, ele
	 * reclama. Em outras palavas, digamos que você queira sobrescrever o método
	 * toString() de uma classe, mas por acidente você escreva tostring (Tudo
	 * minusculo). Caso você esteja utilizando a anotação @Override, será
	 * acusado um erro, pois não existe esse método para sobrescrever só existe
	 * o toString. Assim, você perceberá seu erro e poderá conserta-lo. Caso
	 * você não usasse a anotação o código iria compilar normalmente, no entanto
	 * o método toString não estaria sobrescrito e caberia a você perceber esse
	 * erro. Assim, a anotação @Override facilita, em caso de erros com a
	 * declaração do método.
	 */
}
