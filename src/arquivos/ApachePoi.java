package arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws IOException {
		File filepoi = new File("C:\\DEV\\Java-jdev\\Jdev\\ArquivosJava\\src\\arquivos_excel.xls");
	
		if(!filepoi.exists()) {
			filepoi.createNewFile();
		}
	
		Pessoa pessoa1 = new Pessoa("Aline", "aline1@gmail.com", 10);
		Pessoa pessoa2 = new Pessoa("Jonas", "jonas2@gmail.com", 22);
		Pessoa pessoa3 = new Pessoa("Morais", "marais10@hotmail.com",33);
		
		List<Pessoa> incluirPessoas = new ArrayList<Pessoa>();
		incluirPessoas.add(pessoa1);
		incluirPessoas.add(pessoa2);
		incluirPessoas.add(pessoa3);
		
		HSSFWorkbook hss = new HSSFWorkbook();
		HSSFSheet linhaPessoa = hss.createSheet("Curso Jdev");
		
		int numeroLinha = 0;
		for (Pessoa p: incluirPessoas) {
			Row linha = linhaPessoa.createRow(numeroLinha++);
			
			int celula = 0;
			Cell celNome = linha.createCell(celula++);
			celNome.setCellValue(p.getNome());
			
			Cell celEmail = linha.createCell(celula++);
			celEmail.setCellValue(p.getEmail());
			
			Cell celIdade = linha.createCell(celula++);
			celIdade.setCellValue(p.getIdade());
			
			
		
		
		}//fim da planilha
	
		FileOutputStream saida = new FileOutputStream(filepoi);
		hss.write(saida);
		saida.flush();
		saida.close();
		System.out.println("Fim do projeto, planilha preenchida com dados");
	}
	
}
