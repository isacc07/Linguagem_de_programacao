package mercado;

public class App {

	public static void main(String[] args) {

		Fornecedor fornecedor1 = new Fornecedor();

		fornecedor1.setNome("Isac");
		fornecedor1.setTelefone("21998393918");
		fornecedor1.setCidade("Valença");

		System.out.println("Nome do Fornecedor: " + fornecedor1.getNome());
		System.out.println("Numero do fornecedor: " + fornecedor1.getTelefone());
		System.out.println("Nome da cidade: " + fornecedor1.getcidade());

		System.out.println();

		Item item1 = new Item();

		item1.setDescricao("IPHONE 11");
		item1.setPreco(2000);
		item1.setQuantidade(1);

		System.out.println("Descricao: " + item1.getDescricao());
		System.out.println("Preço: " + item1.getPreco());
		System.out.println("Quantidade: " + item1.getQuantidade());
		
		

	}

}
