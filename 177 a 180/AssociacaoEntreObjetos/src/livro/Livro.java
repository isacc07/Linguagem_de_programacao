package livro;

public class Livro {

	private String titulo;
	private int anoLancamento;
	private Autor autor;
	private Editora editora;

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		if (editora != null) {
			this.editora = editora;
		} else {
			System.out.println("Editora invalida:");
		}

	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		if (autor != null) {
			this.autor = autor;
		} else {
			System.out.println("Erro: o autor nao pode ser nulo");
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;

		} else {
			System.out.println("Titulo nao pode ser vazio");

		}
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		if (anoLancamento > 0) {
			this.anoLancamento = anoLancamento;
		} else {
			System.out.println("Ano de lançamento nao pode ser negativo");

		}

	}

	public void mostrarAutor(Autor autor) {
		if (autor != null) {
			this.autor = autor;
			System.out.println("Livro " + titulo + " foi escrito por: " + autor.getNome());

		} else {
			System.out.println("Erro o autor nao pode ser nulo:");
		}

	}

	public void mostrarEditora(Editora editora) {
		if (editora != null) {
			this.editora = editora;
			System.out.println("Editora: " + editora.getNome());

		} else {
			System.out.println("Editora invalida");
		}

	}

}
