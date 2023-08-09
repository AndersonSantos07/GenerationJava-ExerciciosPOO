package ex005;

public class TestaIngresso {

	public static void main(String[] args) {
		
		//nome, genero,assento,duracao,classificacao
		
		Ingresso[] filmes = new Ingresso[2];
		
		filmes[0] = new Ingresso("Velozes e Furiosos 10","Acao","J12",133,"14 Anos");
		filmes[1] = new Ingresso("Mega Tubarão 2","Suspense","A2",94,"16 Anos");
		
		for(Ingresso filme:filmes) {
			filme.vizualizar();
		}

	}

}
