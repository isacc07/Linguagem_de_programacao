package mercado;

public class Item {
	private String descricao;
	private double preco;
	private int quantidade;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String novaDescricao) {
		this.descricao = novaDescricao;

	}

	public double getPreco() {
		return preco;

	}

	public void setPreco(double novoPreco) {
		if (novoPreco > 0) {
			this.preco = novoPreco;
		} else {
			System.out.println("Preco invalido!!");
		}

	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int novaQuantidade) {
		if (novaQuantidade >= 0) {
			this.quantidade = novaQuantidade;
		} else {
			System.out.println("Quantidade Invalida!!");
		}

	}
}
