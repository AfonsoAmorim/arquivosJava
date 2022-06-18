package arquivos.teste;

import arquivos.entity.Aluno;
import arquivos.entity.Pessoa;
import arquivos.entity.Professor;

public class TesteEscola {

	public static void main(String[] args) {
		Pessoa professorTitular = new Professor("Leandro pereira", 50, 55640, 8855546);
		Pessoa alunoAds = new Aluno("Ricardo", 25, 556487614, 778540);
		
		System.out.println(professorTitular);
		System.out.println(alunoAds);
	
	
	
	}
}