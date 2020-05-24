package test;

public class BuclesAnidados {

	public static void main(String[] args) {
		
		for(int num = 1; num<= 9; num = num + 2) {
			System.out.println("Tabla de multiplicar de " + num);
			
			for(int j = 1; j<=10; j++) {
				System.out.println(num + " * " + j + " = " + num *j);
			}
		}
	}
}
