package organizacao;

public class App {

	public static void main(String[] args) {

		Professor professor1 = new Professor();
		
		professor1.setNome("Lukaku");
		professor1.setFormacao("Doutorado");
		
		Disciplina discplina1 = new Disciplina();
		
		discplina1.setCargaHoraria("Manha");
		discplina1.setNome("Matematica");
		
		discplina1.exibirProfessor(professor1);

	}

}
