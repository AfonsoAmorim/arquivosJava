package arquivos.teste;

import arquivos.entity.Aluno;
import arquivos.entity.Cantina;
import arquivos.entity.Pessoa;
import arquivos.entity.Professor;
import arquivos.functions.Acoes;

public class TesteEscola extends Acoes{

	public static void main(String[] args) {
		Pessoa professorTitular = new Professor("Leandro pereira", 50, 55640, 8855546);
		Pessoa alunoAds = new Aluno("Ricardo", 25, 556487614, 778540);
		Cantina cantinaEscola = new Cantina("Cantina da Tia Luz", 55666214);
	
		
		TesteEscola testeFunctions = new TesteEscola();
	
		
		System.out.println(professorTitular);
		System.out.println(alunoAds);
		System.out.println(testeFunctions.soma(10)); // teste de função 
		
		
		
	
	}
}