package test;

public class Operadores {

	public static void main(String[] args) {
		int edad = 18;
		
		//	== 	!=	>	<	<=	>=
		boolean comprobacion = edad == 18;
		if(comprobacion) {
			System.out.println("Justo tienes 18 años");
		}else {
			System.out.println("No tienes 18 años");
		}
	}
}
