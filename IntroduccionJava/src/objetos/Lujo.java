package objetos;

public class Lujo extends Tren {
	
	private String camarero;
	private boolean bar;
	
	public Lujo() {
		camarero = "Anónimo";
		bar = false;
	}
	
	public Lujo(String nombre, boolean estado) {
		camarero = nombre;
		bar = estado;
	}
	
	public String getCamarero() {
		return camarero;
	}
	public void setCamarero(String camarero) {
		this.camarero = camarero;
	}
	public boolean isBar() {
		return bar;
	}
	public void setBar(boolean bar) {
		this.bar = bar;
	}
	
	public void statusBar(boolean estado) {
		bar = estado;
		if(bar) {
			System.out.println("El bar esta abierto");
		}else {
			System.out.println("El bar esta cerrado");
		}
	}
	
}
