package programa;

import java.util.Scanner;

public class CalculadoraDeEconomiaDaFaixaSolidaria {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

        double kmDia;
        double precoGasolina;
        double kmPorLitro;
        double estacionamento;
        double pedagio;
        

        System.out.print("Quilometros dirigidos por dia: ");
        kmDia = entrada.nextInt();

        System.out.print("Preco da gasolina por litro: ");
        precoGasolina = entrada.nextInt();

        System.out.print("Quilometros medios por litro: ");
        kmPorLitro = entrada.nextInt();

        System.out.print("Taxa de estacionamento por dia: ");
        estacionamento = entrada.nextInt();

        System.out.print("Pedagio por dia: ");
        pedagio = entrada.nextInt();
        

        double litrosGastos;
        
        double gastoCombustivel;
        
        double custoTotal;
        
        
        System.out.println("\nResultado:");
        
        System.out.printf("Litros gastos por dia: %f%n", litrosGastos = kmDia / kmPorLitro);
        
        System.out.printf("gasto com combustivel: %f%n", gastoCombustivel = litrosGastos * precoGasolina);
        
        System.out.printf("Custo total: %f%n", custoTotal = gastoCombustivel + estacionamento + pedagio);
        
        
        entrada.close();
		
	}

}