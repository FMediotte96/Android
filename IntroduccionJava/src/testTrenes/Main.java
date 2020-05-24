package testTrenes;

import objetos.Lujo;
import objetos.Tren;

public class Main {
	
	public static void main(String[] args) {
		
		Tren primero = new Tren();
		Tren segundo = new Tren("Juan Perez", 25);
		Lujo tercero = new Lujo("Felipe",true);
		
		System.out.println(primero.getMaquinista());
		System.out.println(segundo.getMaquinista());
		
		primero.setMaquinista("Luis Garcia");
		System.out.println(primero.getMaquinista());
		
		//Consultar cuanto pasajeros hay en el vagon N°1
		primero.completarVagon(2);
		System.out.println(primero.getVagones()[2][1]);
		
		primero.agregarPasajero(1, 5);
		primero.agregarPasajero(1, 3);
		System.out.println(primero.getVagones()[1][1]);
		
		//Lujo
		System.out.println("\nTercero:");
		System.out.println(tercero.getCamarero());
		tercero.agregarPasajero(1, 5);
		System.out.println(tercero.getVagones()[1][1]);
		tercero.statusBar(false);

	}

}
