package aula5.labs2;

public class TestaTributavel {

	public static void main(String[] args) {
			
		ContaCorrente cc  = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		
		//testando polimorfismo
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
		//System.out.println(t.getSaldo());
		
	}

}
