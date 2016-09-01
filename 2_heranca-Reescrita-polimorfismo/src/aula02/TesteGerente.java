package aula02;

public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gerente01 = new Gerente();
		
		gerente01.setNome("José Malcher JR");
		
		gerente01.setSenha(123);
		gerente01.setSalario(5000);
		//System.out.println(gerente01.getBonificacao());
		
		
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		Gerente funcionario01 = new Gerente();
		funcionario01.setSalario(5000);
		controle.registra(funcionario01);
		
		Funcionario funcionario02 = new Funcionario();
		funcionario02.setSalario(2000);
		controle.registra(funcionario02);
		
		System.out.println(controle.getTotalDeBonificacoes());
		
		

	}

}
