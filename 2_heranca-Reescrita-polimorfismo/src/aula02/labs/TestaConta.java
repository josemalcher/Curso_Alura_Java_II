package aula02.labs;

public class TestaConta {

	public static void main(String[] args) {

		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		/*
		 * � extremamente importante perceber que n�o importa como nos referimos
		 * a um objeto, o m�todo que ser� invocado � sempre o mesmo! A JVM vai
		 * descobrir em tempo de execu��o qual deve ser invocado, dependendo de
		 * que tipo � aquele objeto, n�o importando como nos referimos a ele.
		 */

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);

		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		System.out.println("*******");
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.println("Saldo total R$" +adc.getSaldoTotal());

	}

}
