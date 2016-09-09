package aula5.labs;

public class Circulo implements AreaCalculavel {
	private double raio;

	@Override
	public double calculaArea() {
		return Math.PI * this.raio * this.raio;
	}

	public Circulo(int raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

}
