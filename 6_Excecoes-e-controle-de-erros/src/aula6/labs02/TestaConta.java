package aula6.labs02;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta joao = new Conta();
		joao.deposita(50.0);
		
		joao.deposita(-10);
		
		try{
		joao.saca(300.0);
		}
		catch(SaldoInsuficienteException e){
			System.out.println("SALDO INSUFICIENTE "+ e.getSaldoAtual());
		}
		
		catch(Exception e){
			//System.out.println("Não há SALDO!");
			System.out.println("Um outro ERRO QUALQUER");
		}
		System.out.println(joao.getSaldo());
		
		

	}

}
