package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestePessoa {

	public static void main(String[] args) throws IOException {
		
		Pessoa pessoaA = new Pessoa();
		pessoaA.setNome("Alonso");
		pessoaA.setEmail("alonso@gmail.com");
		pessoaA.setIdade(10);
	
	
		Pessoa pessoaB = new Pessoa();
		pessoaB.setNome("Alves");
		pessoaB.setEmail("alonso1010@gmail.com");
		pessoaB.setIdade(55);
		
		Pessoa pessoaC = new Pessoa("Aline", "jovem10@hotmail.com", 22);
	
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoaA);
		pessoas.add(pessoaB);
		pessoas.add(pessoaC);
		
		File arquivo2 = new File("C:\\DEV\\Java-jdev\\Jdev\\ArquivosJava\\arquivo2.txt");
		
		FileWriter arquivoT = new FileWriter(arquivo2);
		
		if(!arquivo2.exists()) {
			arquivo2.createNewFile();
		}
		
		for(Pessoa p : pessoas) {
			arquivoT.write("\n"+p.getNome()+",\n"+p.getEmail()+",\n"+p.getIdade()+"\n"+"+++++-----+++++"+"\n");
		}
		
		arquivoT.write("Sexta-feira!!");
	
	

		arquivoT.flush();
		arquivoT.close();
	}
	
	
}
