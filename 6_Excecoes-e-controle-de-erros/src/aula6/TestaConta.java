package aula6;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta joao = new Conta();
		joao.deposita(50.0);
		
		joao.saca(300.0);
		
		System.out.println(joao.getSaldo());
		
		

	}

}
