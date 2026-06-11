package hospital;

public class App {
	public static void main(String[] args) {

		Medico medico1 = new Medico();
		
		System.out.println("Profissional: ");
		medico1.setNome("Dr. Isac Newton ");
		medico1.setRegistro("CRD-9823 ");
		medico1.setTurno("Manhã");
		medico1.setEspecialidade("Neurologista ");
	
		
		medico1.exibirDados();
		
		Enfermeiro enfermeiro1 = new Enfermeiro();
		
		System.out.println();
		
		System.out.println("Profissional:");
		enfermeiro1.setNome("Camille "); 
		enfermeiro1.setRegistro("IDSA-3928 ");
		enfermeiro1.setTurno("Tarde ");
		enfermeiro1.setSetor("UTI ");
		
		enfermeiro1.exibirDados();
		
		
	}

}
