package ex003;

public class TestaGame {

	public static void main(String[] args) {
		
		Produto[] games = new Produto[2];
		//nome,genero,plataforma,tipoMidia,desenvolvedora);
		games[0] = new Produto("FIFA","Esportes","PC","Digital","EA SPORTS");
		games[1] = new Produto("GTA IV","Acao","PS4","Fisica","Rockstar Games");
		
		for(Produto jogo:games) {
			
			jogo.vizualizar();
			
		}
		
		
	}

}
