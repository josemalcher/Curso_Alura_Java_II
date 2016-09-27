package aula6.labs04;

public class SaldoInsuficienteException extends Exception {
	
	private final double saldoAtual;

	public SaldoInsuficienteException(double saldoAtual){
		super("Saldo insuficiente (class) " + saldoAtual);
		this.saldoAtual = saldoAtual;
		
	}
	
	public double getSaldoAtual() {
		return saldoAtual;
	}
	
}
