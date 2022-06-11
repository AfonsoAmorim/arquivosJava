package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerTexto {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream entradaArquivo = new FileInputStream(
				new File("C:\\DEV\\Java-jdev\\Jdev\\ArquivosJava\\arquivo2.txt"));

		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

		while (lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();

			System.out.println(linha);
		}

	}
}
