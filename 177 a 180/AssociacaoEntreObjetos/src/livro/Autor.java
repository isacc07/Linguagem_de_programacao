package livro;

public class Autor {

	private String nome;
	private String nacionalidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		} else {
			System.out.println(" Nome nao pode ser vazio:");
		}
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		if (nome != null && !nome.isBlank()) {

			this.nacionalidade = nacionalidade;
		} else {
			System.out.println("Nacionaldade nao pode ser vazia: ");
		}
	}

}
