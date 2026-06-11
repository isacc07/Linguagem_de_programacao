package hospital;

public class Profissional {

	private String nome;
	private String registro;
	private String turno;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		} else {
			System.out.println("Nome invalido:");
		}
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		if (registro != null && !registro.isBlank()) {
			this.registro = registro;
		} else {
			System.out.println("Registro invalido!");
		}

	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		if (turno != null && !turno.isBlank()) {
			this.turno = turno;
		} else {
			System.out.println("Turno invalido:");
		}
	}

	public void exibirDados() {
		
		System.out.println();
		System.out.println("Nome:" + getNome());
		System.out.println("Registro:" + getRegistro());
		System.out.println("Turno:" + getTurno());

	}

}
