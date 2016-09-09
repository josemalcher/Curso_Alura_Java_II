package aula5.labs;

public class TesteAreaCalculavel {

	public static void main(String[] args) {
		
		AreaCalculavel area1 = new Retangulo(10, 20);
		
		System.out.println(area1.calculaArea());
		
		AreaCalculavel circulo = new Circulo(10);
		
		System.out.println(circulo.calculaArea());

	}

}
