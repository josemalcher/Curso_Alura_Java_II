package aula6;

public class TestaExcecao {

	public static void main(String[] args) {
		
		System.out.println("inicio do main");
				
		m1();
		
		System.out.println("Fim do Main");

	}

	private static void m1() {
		
		System.out.println("inicio de m1");
		
		m2();
		
		System.out.println("Fim de m1");
		
	}

	private static void m2() {
		
		System.out.println("inicio de m2");
		
		int[] nums = new int[5];
		for (int i = 0; i < 6; i++) {
			nums[i] = i * 2;
			System.out.println(nums[i]);
			
		}
		
		System.out.println("fim de m2");
		
	}

}
