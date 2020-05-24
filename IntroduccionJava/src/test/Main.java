package test;

public class Main {

	public static void main(String[] args) {

		double numero;
		numero = 214.5;
		
		System.out.println(numero);
		
		//int, float, double -> numero
		//char, string
		char letra = 'A';
		boolean luz = false;
		
		int paginas[] = new int[6];
		paginas[0] = 20;
		paginas[5] = 30;
		
		String cadena = "holaaaa";
		
		System.out.println(cadena + " " + luz + letra);
		
		String tablero[][] = new String[8][8];
		tablero[5][4] = "rey negro";
		tablero[2][3] = "caballo blanco";
		System.out.println(tablero[5][4]);
		
	}

}
