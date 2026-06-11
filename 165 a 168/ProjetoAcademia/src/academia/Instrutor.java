package academia;

public class Instrutor extends Pessoa {

	private String especialidade;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		if (especialidade != null && !especialidade.isBlank()) {
			this.especialidade = especialidade;
		} else {
			System.out.println("Especialidade inválida.");
		}
	}

	public void exibirInstrutor() {
		System.out.println();
		System.out.println("Instrutor: ");
		System.out.println();
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Especialidade: " + getEspecialidade());
	}
	

}