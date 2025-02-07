package parte1.ejercicio2;

public class Persona {
	
	private final String DNI;
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona(String dni, String nombre, String apellidos, int edad) {
		this.DNI = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public String getDni(){
		return DNI;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getApellidos(){
		return apellidos;
	}
	
	public int getEdad(){
		return edad;
	}
	
	public void setNombre(String nombre) {
		
		if(nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

	}
	
	public void setApellidos(String apellidos) {
		
		if(apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}

	}
	
	public void setEdad(int edad) {
		
		if(edad >= 0 && edad > this.edad) {
			this.edad = edad;
		}

	}
	
	public boolean esMayorEdad() {
		
		boolean resultado = false;
		
		if(this.edad > 18) {
			resultado = true;
		}
		
		return resultado;
		
	}
	
	public boolean esJubilado(){
		
		boolean resultado = false;
		
		if(this.edad >= 65) {
			resultado = true;
		}
		
		return resultado;
	}
	
	public int diferenciaEdad(Persona p) {
		int diferencia;
		
		diferencia = Math.abs(this.edad-p.edad);

		return diferencia;
	}
	
	public String toString() {
		String resultado = "DNI: " + this.DNI + "\n";
		resultado += "Nombre: " + this.nombre + "\n";
		resultado += "Apellidos: " + this.apellidos + "\n";
		resultado += "Edad: " + this.edad + "\n";
		return resultado;
	}
	
}
