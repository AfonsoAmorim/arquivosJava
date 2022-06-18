package arquivos.functions;

public class Acoes {

	public static int soma(int a) {
		return 10*a;
	}
	
	public static int pastelDecarne(int tipoPastel) {
		if (tipoPastel >= 3) {
			int valorPastelCarne = tipoPastel*5;
			System.out.println("O pastel é de carne, seu valor é: " + valorPastelCarne);
		}
		return tipoPastel;
		
	}
	
}
