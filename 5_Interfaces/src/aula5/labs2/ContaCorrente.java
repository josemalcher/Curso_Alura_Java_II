package aula5.labs2;

public class ContaCorrente extends Conta implements Tributavel{

/*	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}*/

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.1;
	}

}