package test;

public class BuclesWhile {

	public static void main(String[] args) {
		
		int num = 3;
		int i = 1;
		while(i<=10) {
			System.out.println(num + " * " + i + " = " + num*i);
			i++;
		}
		
		i=1;
		do {
			System.out.println(num + " * " + i + " = " + num*i);
			i++;
		}while(i <= 10);
	}
}
