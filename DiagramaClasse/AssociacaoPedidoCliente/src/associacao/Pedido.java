package associacao;

public class Pedido {

	private int numero;
	private double valorTotal;
	private Cliente cliente;

	public Pedido(int numero, double valorTotal, Cliente cliente) {

		this.numero = numero;
		this.valorTotal = valorTotal;
		this.cliente = cliente;

	}

	public void CalcularTotal(double ValorTotal) {

		System.out.println(ValorTotal);

	}

	public void exibirDados() {

		System.out.println("numero: " + numero);
		System.out.println("Valor total: " + valorTotal);
		System.out.println("Cliente:" + cliente.getNome());

	}
}
