package livro;

public class App {
	public static void main(String[] args) {
		Autor autor1 = new Autor();

		autor1.setNome("Davi lago");
		autor1.setNacionalidade("Brasileira");

		Livro livro1 = new Livro();

		livro1.setAnoLancamento(2021);
		livro1.setTitulo("Um Dia Sem Reclamar");

		livro1.mostrarAutor(autor1);

		Editora editora1 = new Editora();

		editora1.setNome("Brasil Edits");

		livro1.mostrarEditora(editora1);

	}

}
