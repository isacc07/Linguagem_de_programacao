package redeSocial;

public class Postagem {
	
	String texto;
	int curtidas;
	String autor;
	
	void MostrarPostagem() {
		
		System.out.println("Texto: " + texto);
		System.out.println("Curtidas: " + curtidas);
		System.out.println("Autor: " + autor);
	}

}
