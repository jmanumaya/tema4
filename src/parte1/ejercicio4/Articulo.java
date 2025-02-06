package parte1.ejercicio4;

public class Articulo {
	
	private String nombre = "";
	private double precio;
	private final int IVA = 21;
	private int cuantosQuedan;
	
	// Constructor
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		this.nombre = nombre;
		this.precio = precio;
		this.cuantosQuedan = cuantosQuedan;
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public int getIVA() {
		return IVA;
	}
	
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}
	
	public void setNombre(String nombre){
		if(nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}
	
	public void setPrecio(double precio){
		if(precio > 0) {
			this.precio = precio;
		}
	}
	
	public void setCuantosQuedan(int cuantosQuedan){
		if(cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}
}
