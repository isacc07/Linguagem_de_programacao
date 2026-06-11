package hospital;

public class Enfermeiro extends Profissional {
	private String Setor;

	public String getSetor() {
		return Setor;
	}

	public void setSetor(String setor) {
		if (setor != null && !setor.isBlank()) {

			Setor = setor;
		} else {
			System.out.println("Digite um setor valido:");
		}
	}

	@Override

	public void exibirDados() {
		System.out.println();
		
		System.out.println("Nome:" + getNome());
		System.out.println("Registro:" + getRegistro());
		System.out.println("Turno:" + getTurno());
		System.out.println("Setor:" + getSetor());
	}

}
