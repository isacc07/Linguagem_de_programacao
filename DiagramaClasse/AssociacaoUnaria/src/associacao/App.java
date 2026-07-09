package associacao;

public class App {

	public static void main(String[] args) {
		
		Funcionario gerente = new Funcionario("Mariana", "Gerente de TI");
		
		Funcionario tecnico1 = new Funcionario ("Carlos", "Tecnico de suporte");
		
		Funcionario tecnico2 = new Funcionario ("Fernanda", "Tecnica de rede");
		
		gerente.adicionarSubordinado(tecnico1);
		gerente.adicionarSubordinado(tecnico2);
		
		gerente.exibirInformacoes();
		gerente.exibirSubordinados();
		
		System.out.println();
		
		tecnico1.exibirInformacoes();
		
		System.out.println();
		
		tecnico2.exibirInformacoes();
		
		
		
	}

}
