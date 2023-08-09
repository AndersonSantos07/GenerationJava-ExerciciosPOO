package ex006;

public class TestaCurso {

	public static void main(String[] args) {
		//nome,genero,certificado,tcc,valorMensalidade
		
		Curso[] cursos = new Curso[2];
		
		cursos[0] = new Curso("Ciencia da Computacao","Tecnologia","Bacharelado",true,350f);
		cursos[1] = new Curso("Enfermagem","Medicina","Tecnologo",false,150f);
		
		for(Curso curse:cursos) {
			curse.vizualizar();
		}

	}

}
