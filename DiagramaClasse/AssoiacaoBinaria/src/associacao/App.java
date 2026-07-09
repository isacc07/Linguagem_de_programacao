package associacao;

public class App {
	public static void main(String[] args) {
		
		Socio socio = new Socio ("Carlos", "Rua das Flores", "99999-9999", "04/08/2008");
		
		Dependente dependente1 = new Dependente ("A na", "15/08/2012");
		
		Dependente dependente2 = new Dependente ("Pedro", "20/03/2015");
		
		socio.adicionarDependentes(dependente1);
		socio.adicionarDependentes(dependente2);
		
		socio.exibirDados();
	}

}
