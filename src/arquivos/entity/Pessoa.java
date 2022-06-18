package arquivos.entity;

public class Pessoa {

	public String nome;
	public int idade;
	public int  rg;
	
	public Pessoa(String _nome, int _idade, int _rg) {
		this.nome= _nome;
		this.idade= _idade;
		this.rg= _rg;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", rg=" + rg + "]";
	}
	
	
	
	
}
