package vetores;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// Declaraçao da lista
		List<String> alunosList = new ArrayList<>();

		// Inserçao de elementos

		alunosList.add("Ana");
		alunosList.add("Bruno");
		alunosList.add("Carlos");

		System.out.println("\nLIST APOS AS INSERÇOES");

		// Percorrendo a lista com for tradicional

		for (int i = 0; i < alunosList.size(); i++) {
			System.out.println(i + " - " + alunosList.get(i));
		}

		// Inserçao em uma posiçao especifica

		alunosList.add(1, "Beatriz");

		System.out.println("\nLIST APOS INSERIR BEATRIZ NA POSICAO 1:");

		// Percorrendo com for-each

		for (String aluno : alunosList) {
			System.out.println(aluno);

		}

		// remoccao pelo conteudo

		alunosList.remove("Bruno");

		// remoçao pelo indice

		alunosList.remove(0);

		System.out.println("\nLIST APOS AS REMOCOES:");

		for (String aluno : alunosList) {
			System.out.println(aluno);

		}
	}

}
