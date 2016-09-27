package aula6.labs03;

public class ValorInvalidoException extends RuntimeException{

	private double valorDeposito;

	public ValorInvalidoException(double ValorDeposito){
		super("(class ValorInvalidoException) \n "
				+ "N�o � PERMITIDO VALOR NEGATIVOS "+ ValorDeposito);
		valorDeposito = ValorDeposito;
		
	}
	
	public double getValorDeposito() {
		return valorDeposito;
	}
	
}
