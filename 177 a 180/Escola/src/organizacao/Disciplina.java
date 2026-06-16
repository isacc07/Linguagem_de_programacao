package organizacao;

public class Disciplina {
	private String nome;
	private String cargaHoraria;
	Professor professor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		} else {
			System.out.println("Nome invalido");
		}
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		if (cargaHoraria != null && !cargaHoraria.isBlank()) {
			this.cargaHoraria = cargaHoraria;

		} else {
			System.out.println("Carga horaria invalida:");
		}
	}

	public Professor getProfesssor() {
		return professor;
	}

	public void setProfesssor(Professor professor) {
		if (professor != null) {
			this.professor = professor;

		} else {
			System.out.println("Professor invalido: ");
		}

	}

	public void exibirProfessor(Professor professor) {
		if (professor != null) {
			this.professor = professor;
			System.out.println("A discplina " + nome + " é ministrada por " + professor.getNome());
			System.out.println();

		} else {
			System.out.println("Professor invalido");
		}

	}
}
