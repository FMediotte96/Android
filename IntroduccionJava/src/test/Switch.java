package test;

public class Switch {
	
	public static void main(String[] args) {
		int mes = 12;
		
		switch(mes) {
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: System.out.println("Tiene 31 días");
					 break;
			case 4:
			case 6:
			case 9:
			case 11: System.out.println("Tiene 30 días");
					 break;
			case 2: System.out.println("Tiene 28 días");
					break;
			default: System.out.println("No tiene sentido!");
		}
		System.out.println("fin");
	}

}
