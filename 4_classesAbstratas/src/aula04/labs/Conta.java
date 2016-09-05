package aula04.labs;

public abstract class Conta {
	protected double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//métodos
	public void deposita(double valorDeposito){
		this.saldo += valorDeposito;
	}
	
	public void saca(double valorSacar){
		this.saldo -= valorSacar;
	}
	
	public abstract void atualiza(double taxa);
}
