package aula6;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta joao = new Conta();
		joao.deposita(50.0);
		//try{
		joao.saca(300.0);
		//}catch(Exception e){
			System.out.println("Não há SALDO!");
		//}
		System.out.println(joao.getSaldo());
		
		

	}

}
