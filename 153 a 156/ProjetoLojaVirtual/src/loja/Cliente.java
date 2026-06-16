package loja;

public class Cliente {
	private String nome;
	private int idade;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String novoNome) {
		this.nome = "Isac";
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int novaIdade) {
		if (novaIdade > 0) {
			this.idade = novaIdade;

		} else {
			System.out.println("Idade invalida");
		}

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String novoEmail) {
		if (novoEmail != null && !novoEmail.isBlank()) {
			this.email = novoEmail;
		} else {
			System.out.println("Nome do paciente invalido");
		}

	}

}
