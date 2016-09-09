package aula5.labs3;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {
		
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		
		gerenciador.adicionar(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciador.adicionar(cc);
		
		System.out.println(gerenciador.getTotal());
		System.out.printf("O saldo é: %.2f", cc.getSaldo());

	}

}
