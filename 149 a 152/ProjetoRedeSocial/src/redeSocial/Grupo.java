package redeSocial;

public class Grupo {
	
	String nomeGrupo;
	String tema;
	int quantidadeDeMembros;
	
	void mostrarGrupo() {
		
		System.out.println();
		System.out.println("Grupo:");
		System.out.println();
		
		System.out.println("Nome do grupo:"+ nomeGrupo);
		System.out.println("Tema:" + tema);
		System.out.println("Quantidade de membros:" + quantidadeDeMembros);
	}

}
