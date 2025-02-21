package parte4.ejercicio1;

public class Alumnos {
	
	private String nombre;
	
	private double notaMedia;
	
	public Alumnos(String nombre, double notaMedia) {
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		
		if (notaMedia >= 0){
			this.notaMedia = notaMedia;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public double getNotaMedia() {
		return notaMedia;
	}
	
	public void setNotaMedia(double notaMedia) {
		if (notaMedia >= 0){
			this.notaMedia = notaMedia;
		}
	}

}
