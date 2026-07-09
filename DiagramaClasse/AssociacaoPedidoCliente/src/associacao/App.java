package associacao;

public class App {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente(" Isac", " 218-395-287-37");
		
		Pedido pedido1 = new Pedido(10, 30, cliente1);
		
		
		System.out.println();
		pedido1.exibirDados();
			
		
		
		
	}

}
