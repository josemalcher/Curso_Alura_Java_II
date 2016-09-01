package aula02;

public class Reitor extends EmpregadosDaFaculdade{
	// informações extras
    String getInfo() {
        return super.getInfo() + " e ele é um reitor";
    }
     // não sobrescrevemos o getGastos!!!
}
