package lista;

import java.util.Scanner;

public class ProdutotresInteiros {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x,y,z, resultado;
		
		System.out.print("Digite o primeiro inteiro: ");
		x = entrada.nextInt();
		
		System.out.print("Digite o segundo inteiro: ");
		y = entrada.nextInt();
		
		System.out.print("Digite o terceiro inteiro: ");
		z = entrada.nextInt();
		
		System.out.printf("O produto é: %d%n", x * y * z);

	}

}