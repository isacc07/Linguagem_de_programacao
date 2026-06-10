package redeSocial;

public class Comentario {
	
	String autor;
	String mensagens;
	int likes;
	
	void mostrarComentario() {
		System.out.println("Autor:" + autor);
		System.out.println("Comentarios: "+ mensagens );
		System.out.println("likes: " + likes);
		
	}

}
