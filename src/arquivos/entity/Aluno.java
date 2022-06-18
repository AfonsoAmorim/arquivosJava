package arquivos.entity;

public class Aluno extends Pessoa{
	private int registroAluno;
	
	public Aluno(String _nome, int _idade,  int _rg ,int registroAluno) {
		super(_nome,_idade, _rg);
		this.registroAluno=registroAluno;
	}
	
	
	
}
