package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverExcel {
public static void main(String[] args) throws IOException {
	File entradaArquivo = new File("C:\\DEV\\Java-jdev\\Jdev\\ArquivosJava\\arquivo2.csv");
	
	if(!entradaArquivo.exists()) {
		entradaArquivo.createNewFile();
	}
	
	FileWriter escrever_arquivo = new FileWriter(entradaArquivo);
	escrever_arquivo.write("set");
	escrever_arquivo.write("texto teste 2 ");
	
	for(int i=0;i<5;i++) {
		escrever_arquivo .write("Adicionando quebra de linha" + "\n");
	}
	
	
	escrever_arquivo.flush();
	escrever_arquivo.close();
}
}
