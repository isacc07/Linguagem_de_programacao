package loja;

public class Produto {
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setpreco(double novoPreco) {
		if(novoPreco > 0) {
			this.preco = novoPreco;
		} else {
			System.out.println("Preco invalido!!");
		}
	}
	
	public int getQuantidadeEstoque () {
		return quantidadeEstoque;
	}
	
	public void setQuantidadeEstoque(int NovaQuantidadeEstoque) {
		if(NovaQuantidadeEstoque >= 0) {
			this.quantidadeEstoque = NovaQuantidadeEstoque;
		} else {
			System.out.println("Quantidade de Estoque invalida!!");
		}
	}
		
		
}
