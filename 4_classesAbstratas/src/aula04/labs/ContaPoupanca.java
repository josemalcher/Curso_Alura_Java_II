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
	 * Se voc� usou o recurso de sobrescrever o m�todo automaticamente pelo
	 * Eclipse, ele adicionou a anota��o @Override. Ela ajuda o compilador a
	 * dizer se voc� errou o nome do m�todo, par�metros etc, uma vez que se o
	 * m�todo n�o sobrescrever o m�todo (abstrato ou n�o) de sua classe pai, ele
	 * reclama. Em outras palavas, digamos que voc� queira sobrescrever o m�todo
	 * toString() de uma classe, mas por acidente voc� escreva tostring (Tudo
	 * minusculo). Caso voc� esteja utilizando a anota��o @Override, ser�
	 * acusado um erro, pois n�o existe esse m�todo para sobrescrever s� existe
	 * o toString. Assim, voc� perceber� seu erro e poder� conserta-lo. Caso
	 * voc� n�o usasse a anota��o o c�digo iria compilar normalmente, no entanto
	 * o m�todo toString n�o estaria sobrescrito e caberia a voc� perceber esse
	 * erro. Assim, a anota��o @Override facilita, em caso de erros com a
	 * declara��o do m�todo.
	 */
}
