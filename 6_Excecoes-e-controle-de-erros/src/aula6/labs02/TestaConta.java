package aula6.labs02;

public class TestaConta {

	public static void main(String[] args) {

		Conta joao = new Conta();
		joao.deposita(50.0);
		try {
			joao.deposita(-10);
		} catch (IllegalArgumentException e) {
			System.out.println("ALERTA "+ e.getMessage());
		}
		try {
			joao.saca(300.0);
		} catch (SaldoInsuficienteException e) {
			System.out.println("ALERTA "+ e.getMessage());
		}

		catch (Exception e) {
			// System.out.println("Não há SALDO!");
			System.out.println("Um outro ERRO QUALQUER");
		}
		System.out.println(joao.getSaldo());

	}

}
