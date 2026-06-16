package comercio;

public class Produto {

	private String nome;
	private Double preco;
	private int estoque;

	public Produto() {
		this.nome = "Produto padrao";
		this.preco = 0.0;
		this.estoque = 0;

	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;

	}

	public Produto(String nome, double preco, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public void exibirProdutos() {
		System.out.println("Produto:" + getNome());
		System.out.println("Preco:" + getPreco());
		System.out.println("Estoque:" + getEstoque());

	}

}
