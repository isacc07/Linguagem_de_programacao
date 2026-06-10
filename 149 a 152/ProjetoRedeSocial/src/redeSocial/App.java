package redeSocial;

public class App {

	public static void main(String[] args) {
		
		Usuario Usuario1 = new Usuario();
		
		Usuario1.nome = "Ana";
		Usuario1.idade = 17;
		Usuario1.cidade = "Valença";
		
		Usuario1.mostrarPerfil();
		
		Postagem post1 = new Postagem();
		
		System.out.println();
		
		post1.texto = "Estudando java hoje!";
		post1.curtidas = 15;
		post1.autor = "Ana";
		
		
		post1.MostrarPostagem();
		
		System.out.println();
	
		Comentario Coment1 = new Comentario ();
		
		Coment1.autor = "Bruno";
		Coment1.mensagens = "Muito bom esse post!";
		Coment1.likes = 4;
		
		Coment1.mostrarComentario();
		
		System.out.println();
		
		
		 MensagemPrivada Mensagem1 = new MensagemPrivada();
		 
		 
		 Mensagem1.remetente = "Ana";
		 Mensagem1.destinario = "Carlos";
		 Mensagem1.conteudo = "Oi, Tudo bem?";
		 
		 Mensagem1.MostrarMensagem();
		 
		 Grupo  Grupo1 = new Grupo();
		 
		 Grupo1.nomeGrupo = "Amigos do Java";
		 Grupo1.tema = "Programaçao";
		 Grupo1.quantidadeDeMembros = 28;
		 
		 Grupo1.mostrarGrupo();
		
		
		
		
		
	}

}
