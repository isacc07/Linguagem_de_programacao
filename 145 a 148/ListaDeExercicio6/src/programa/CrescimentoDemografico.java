package programa;

public class CrescimentoDemografico {

	public static void main(String[] args) {
		long populacao = 8300000000L;
		
		double taxaDeCrescimento = 0.033;
		
		short anos = 0;
		
		for (int i = 1; i <= 5; i++)
		{
		
		System.out.printf("A população aproximadada do ano %d é de: %f%n", i, populacao * (Math.pow(1 + taxaDeCrescimento, anos++)));
		
		}
		

	}

}