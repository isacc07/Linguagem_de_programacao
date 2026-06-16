package livro;

public class Editora {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if ((nome != null && !nome.isBlank())) {
			this.nome = nome;

		} else {
			System.out.println("Nome invalido");
		}
	}

}
