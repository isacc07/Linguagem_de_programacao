package redeSocial;

public class MensagemPrivada {
	
	String remetente;
	String destinario;
	String conteudo;
	
	void MostrarMensagem() {
		
		System.out.println("Remetente: "+ remetente);
		System.out.println("Destinario: "+ destinario);
		System.out.println("Conteudo: "+ conteudo);
	}

}
