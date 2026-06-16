package clinica;

public class Medico {

	private String nome;
	private String especialidade;
	private double valorConsulta;

	public String getNome() {
		return nome;
	}

	public void setNome(String novoNome) {
		if (novoNome != null && !novoNome.isBlank()) {
			this.nome = novoNome;
		} else {
			System.out.println("Nome vazio.");
		}
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String novaEspecialidade) {
		if (novaEspecialidade != null && !novaEspecialidade.isBlank()) {
			this.especialidade = novaEspecialidade;
		} else {
			System.out.println("Especialidade vazia.");
		}
	}

	public double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(double novoValorConsulta) {
		if (novoValorConsulta >= 0) {
			this.valorConsulta = novoValorConsulta;
		} else {
			System.out.println("Valor da consulta inválida");
		}
	}

}