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
	
//	public void setDni(String dni) {
//		
//		if(dni != null && !dni.isBlank()) {
//			this.DNI = dni;
//		}
//
//	}
	
}
