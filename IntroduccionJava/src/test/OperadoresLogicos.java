package test;

public class OperadoresLogicos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//los números premiados son 4, 5, 20
		/*int numero = 5;
		
		if(numero == 4 || numero == 5 || numero == 20) {
			System.out.println("Felicidades, has sido premiado");
		}else {
			System.out.println("Sigue participando");
		}*/
		
		//el pnúmero premiado es el 4 para mayores de edad
		int premio = 5;
		int edad = 14;
		
		if(premio == 5 && edad >= 18) {
			System.out.println("Felicidades mayor de edad, has sido premiado");
		}else {
			System.out.println("Sigue participando");
		}
		
		//true && true = true
		//true && false = false
		//false && false = false
		
		//true || true = true
		//true || false = true
		//false || false = false
	}
}
