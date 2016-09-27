package aula6.labs02;

public class Conta {
	protected double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//métodos
	public void deposita(double valorDeposito){
		if(valorDeposito >= 0){
			this.saldo += valorDeposito;
		}else{
			throw new IllegalArgumentException("Não pode Depositar Valor Negativo");
		}
		
	}
	

	public void saca(double valorSacar) throws Exception{
		if(saldo >= valorSacar){
			this.saldo -= valorSacar;
			
		}else{
			throw new SaldoInsuficienteException(saldo);
		}
	}
	
	
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa;
	}
}
