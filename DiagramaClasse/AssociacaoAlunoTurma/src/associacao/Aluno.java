package associacao;

public class Aluno {

	private String matricula;
	private String nome;
	
	public Aluno(String matricula, String nome) {
		
		this.matricula = matricula;
		this.nome = nome;
		
	}

	public String getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void AtualizarNome(String novoNome) {
		nome = novoNome;
		
	}
	
	public void exibirDados() {

		
		System.out.println("Aluno:" + nome);
		System.out.println("Matricula:" + matricula);
		
	}
	
}
