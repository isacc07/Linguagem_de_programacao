package academia;

public class App {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Isac");
		aluno1.setIdade(17);
		aluno1.setPlano("Anual");
		
		
		aluno1.exibirAluno();
		
		Instrutor instrutor1 = new Instrutor();
		instrutor1.setNome("Rodrigo");
		instrutor1.setIdade(30);
		instrutor1.setEspecialidade("Engenharia");
		
		instrutor1.exibirInstrutor();

	}

}
