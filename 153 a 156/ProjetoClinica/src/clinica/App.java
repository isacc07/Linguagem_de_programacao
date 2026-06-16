package clinica;

public class App {

	public static void main(String[] args) {

		Medico medico1 = new Medico();

		medico1.setNome("Isac Souza");
		medico1.setEspecialidade("Neurologista");
		medico1.setValorConsulta(700.00);

		System.out.println("Nome do médico: " + medico1.getNome());
		System.out.println("Especialidade: " + medico1.getEspecialidade());
		System.out.println("Valor da consulta: R$" + medico1.getValorConsulta());

	}

}
