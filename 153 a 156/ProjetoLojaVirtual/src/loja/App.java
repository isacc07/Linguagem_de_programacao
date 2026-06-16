package loja;

public class App {
	public static void main(String[] args) {
		Produto produto1 = new Produto();
		
		produto1.setNome("Arroz");
		produto1.setpreco(20);
		produto1.setQuantidadeEstoque(10);
		
		System.out.println("Nome: "+ produto1.getNome());
		System.out.println("preco: "+ produto1.getPreco());
		System.out.println("Quantidade de estoque "+ produto1.getQuantidadeEstoque());
		
		System.out.println();
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Isac");
		cliente1.setIdade(17);
		cliente1.setEmail("isacpegoodesouza@gmail.com");
		
		System.out.println("Nome: "+ cliente1.getNome());
		System.out.println("Idade: "+ cliente1.getIdade());
		System.out.println("Email: "+ cliente1.getEmail());
		
		
		
		
		
	}

}
