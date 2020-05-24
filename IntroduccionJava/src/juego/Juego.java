package juego;

public class Juego {

	public static void main(String[] args) {

		int tablero[][] = new int[5][5];

		int fila;
		int columna;
		for (fila = 0; fila <= 4; fila++) {
			for (columna = 0; columna <= 4; columna++) {
				tablero[fila][columna] = 0;
			}
		}
		
		tablero[3][0] = 1;
		tablero[2][2] = 2;
		tablero[2][3] = 2;
		
		for (fila = 0; fila <= 4; fila++) {
			for (columna = 0; columna <= 4; columna++) {
				
				if(tablero[fila][columna] == 1) {
					System.out.println("Jugador 2 hallado en la casilla " + fila + "/" + columna);
				}
			}
		}
		
	}

}
