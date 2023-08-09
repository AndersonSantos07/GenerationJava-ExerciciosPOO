package ex002;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario[] funcionarios = new Funcionario[2];
		
		funcionarios[0] = new Funcionario("Anderson Santos",21,"FrontEnd",20000,"masculino");
		funcionarios[1] = new Funcionario("Maria Anjos",37,"BackEnd",35000,"feminino");
		
		for(Funcionario lista:funcionarios) {
			lista.vizualizar();
		}
		

	}

}
