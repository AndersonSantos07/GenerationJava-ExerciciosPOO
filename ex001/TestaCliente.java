package ex001;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente[] clientes = new Cliente[2];
		
		clientes[0] = new Cliente("Anderson Santos",21,"masculino","SP","andy@gmail.com");
		clientes[1] = new Cliente("Maria Silva",34,"Feminino","RJ","maria@gmail.com");
		
		for(Cliente pessoas:clientes) {
			pessoas.vizualizar();
		}
		
	}

}
