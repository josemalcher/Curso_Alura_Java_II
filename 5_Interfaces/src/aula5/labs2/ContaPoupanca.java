package aula5.labs2;

public class ContaPoupanca extends Conta{

	@Override
	public void atualiza(double taxa) {
	
		this.saldo += this.saldo * taxa * 3;
	
	}

	@Override
	public void deposita(double valorDeposito) {
		this.saldo += valorDeposito - 0.10;
	}
	
	

}
