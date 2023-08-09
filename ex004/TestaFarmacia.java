package ex004;

public class TestaFarmacia {

	public static void main(String[] args) {
		// nome,tipo,peso,quantidade,preco
		
		Farmacia dipirona = new Farmacia("Dipirona","Dor e Febre",500,10,7.50f);
		Farmacia paracetamol = new Farmacia("Paracetamol","Dor e Febre",750,20,10.50f);
		
		dipirona.vizualizar();
		paracetamol.vizualizar();

	}

}
