package aula02;

public class ProfessorDaFaculdade extends EmpregadosDaFaculdade {
	private int horasDeAula;

	@Override
	double getGastos() {

		return super.getSalario() + this.horasDeAula * 10;
	}

	@Override
	String getInfo() {
		String informacaoBasica = super.getInfo();
		String informacao = informacaoBasica + " horas de aula: " + this.horasDeAula;
		return informacao;
	}

	public int getHorasDeAula() {
		return horasDeAula;
	}

	public void setHorasDeAula(int horasDeAula) {
		this.horasDeAula = horasDeAula;
	}
	

}
