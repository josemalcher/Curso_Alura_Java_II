package aula02;

public class Reitor extends EmpregadosDaFaculdade{
	// informa��es extras
    String getInfo() {
        return super.getInfo() + " e ele � um reitor";
    }
     // n�o sobrescrevemos o getGastos!!!
}
