package programa;

import java.util.Scanner;

public class Aritmetica {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, resultado;
		
		System.out.print("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		
		System.out.print("Digite o primeiro número: ");
		num2 = entrada.nextInt();
		
		System.out.printf("A soma é: %d%n", num1 + num2 );
		System.out.printf("A multiplição é: %d%n", num1 * num2 );
		System.out.printf("A difença é: %d%n", num1 - num2 );
		
	
		if ( num2 > 0) {
			System.out.printf("A quociente é: %d%n", num1 / num2 );
		}
		
	}

}
