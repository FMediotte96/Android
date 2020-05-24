package objetos;

public class Tren {
	
	int vagones[][] = new int[5][2];
	String maquinista;
	int antiguedad;

	public Tren() {
		for(int i = 0; i<=4; i++) {
			vagones[i][0] = (i+1)*10;
			vagones[i][1] = 0;
		}
		maquinista = "Anónimo";
		antiguedad = 0;
	}
	
	public Tren(String nombre, int anios) {
		for(int i = 0; i<= 4; i++) {
			vagones[i][0] = (i+1)*10;
			vagones[i][1] = 0;
		}
		maquinista = nombre;
		antiguedad = anios;
	}

	public int[][] getVagones() {
		return vagones;
	}

	public void setVagones(int[][] vagones) {
		this.vagones = vagones;
	}

	public String getMaquinista() {
		return maquinista;
	}

	public void setMaquinista(String maquinista) {
		this.maquinista = maquinista;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	//Funciones
	public void completarVagon(int vagon) {
		vagones[vagon][1] = vagones[vagon][0];
		System.out.println("El vagon " + (vagon+1) + " ha sido completado");
	}
	
	public void agregarPasajero(int vagon, int pasajeros) {
		if(vagones[vagon][1] + pasajeros > vagones[vagon][0]) {
			System.out.println("No hay tantas asientos libres en el vagon " + (vagon+1));
		}else {
			vagones[vagon][1] = vagones[vagon][1] + pasajeros;
			System.out.println("La reserva se ha completado");
		}
	}
}
