package associacao;

public class App {

	public static void main(String[] args) {
		
		Turma turma1 = new Turma (" 3928273 ", " Desenvolvimentos De Sistemas");
		
		Aluno aluno1 = new Aluno("3921", "Isac");
		
		Aluno aluno2 = new Aluno ("3921", "Pedro");
		
		turma1.adicionarAlunos(aluno1);
		turma1.adicionarAlunos(aluno2);
		
		
		turma1.exibirDadosTurma();
		
	}

}
