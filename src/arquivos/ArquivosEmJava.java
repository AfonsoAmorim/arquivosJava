package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivosEmJava {

	public static void main(String[] args) throws IOException {
		File arquivo = new File("C:\\DEV\\Java-jdev\\Jdev\\ArquivosJava\\arquivo.txt");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escrever_arquivo = new FileWriter(arquivo);
		
		escrever_arquivo.write("texto teste");
		escrever_arquivo.write("texto teste 2 ");
		
		for(int i=0;i<5;i++) {
			escrever_arquivo .write("Adicionando quebra de linha" + "\n");
		}
		
		
		
		
		
		escrever_arquivo.flush();
		escrever_arquivo.close();
		
		
	}
	
	
}
