package aula5;

public class Cliente implements Autenticavel {
	private String nome;
	private String endereco;
	
	@Override
	public boolean autentica(int senha) {
		// implementa��o das regras de autentica��o	
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
