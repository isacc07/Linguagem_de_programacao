package clinica;

public class Paciente {
	private String nome;
	private int idade;
	private double peso;

	public String getNome() {
		return nome;

	}

	public void setNome(String novoNome) {
		if (novoNome != null && !novoNome.isBlank()) {
			this.nome = novoNome;
		} else {
			System.out.println("Nome vazio:");
		}

	}

	public int getIdade() {
		return idade;

	}

	public void setIdade(int novaIdade) {
		if (novaIdade >= 0) {
			this.idade = novaIdade;
		} else {
			System.out.println("Idade invalida");
		}

	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double novoPeso) {
		if (novoPeso > 0) {
			this.peso = novoPeso;
		} else {
			System.out.println("Peso invalido:");
		}
	}

}
