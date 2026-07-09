package associacao;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private String codigo;
	private String nome;

	private ArrayList<Aluno> alunos;

	List<String> alunosList = new ArrayList<>();

	public Turma(String codigo, String nome) {

		this.codigo = codigo;
		this.nome = nome;

		alunos = new ArrayList<>();

	}

	public void adicionarAlunos(Aluno aluno) {

		alunos.add(aluno);
	}

	public void removerAluno(Aluno aluno) {
		alunos.remove(0);

	}

	public void listarAluno() {

		for (Aluno aluno : alunos) {

			System.out.println(aluno.getNome());

		}
	}

	public void exibirDadosTurma() {
		System.out.println("Turma" + nome);

		System.out.println("Codigo da turma:" + codigo);
		
		for (Aluno aluno : alunos) {

			System.out.println(aluno.getNome());

		}

	}

}
