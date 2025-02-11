package parte2.ejercicio1;

public class CuentaCorriente {
	
	private final String DNI;
	private String nombre;
	private double saldo;
	private enum Nacionalidad {ESPAÑOLA, EXTRANJERA};
	private Nacionalidad nacionalidad;
	
//	 Constructor 1: Solo DNI y saldo
	public CuentaCorriente(String DNI, double saldo) {
		this.DNI = validarDNI(DNI);
		
		// Entiendo que como saldo inicial va a ser siempre almenos 0. 
		this.saldo = Math.max(0, saldo);
	}

	// Constructor 2: DNI, nombre y saldo
	public CuentaCorriente(String DNI, String nombre, double saldo) {
		this.DNI = validarDNI(DNI);
		this.nombre = (nombre != null && !nombre.isBlank()) ? nombre : "Sin nombre";
		
		// Entiendo que como saldo inicial va a ser siempre almenos 0. 
		this.saldo = Math.max(0, saldo);
	}

	// Constructor 3: DNI, nombre, saldo y nacionalidad
	public CuentaCorriente(String DNI, String nombre, double saldo, String nacionalidad) {
		this.DNI = validarDNI(DNI);
		this.nombre = (nombre != null && !nombre.isBlank()) ? nombre : "Sin nombre";
		
		// Entiendo que como saldo inicial va a ser siempre almenos 0. 
		this.saldo = Math.max(0, saldo);
		
		// Compruebo si la nacionalidad es valida llamando a la siguiente funcion y le doy el valor que me devuelva a this.nacionalidad si este ha sido valido.
		this.nacionalidad = switch (nacionalidad.toUpperCase()) {
			case "ESPAÑOLA" -> this.nacionalidad = Nacionalidad.ESPAÑOLA;
			case "EXTRANJERA" -> this.nacionalidad = Nacionalidad.EXTRANJERA;
			default -> this.nacionalidad = Nacionalidad.ESPAÑOLA;
		};
	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		
	    this.saldo = saldo;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		// Compruebo si la nacionalidad es valida llamando a la siguiente funcion y le doy el valor que me devuelva a this.nacionalidad si este ha sido valido.
		this.nacionalidad = switch (nacionalidad.toUpperCase()) {
		case "ESPAÑOLA" -> this.nacionalidad = Nacionalidad.ESPAÑOLA;
		case "EXTRANJERA" -> this.nacionalidad = Nacionalidad.EXTRANJERA;
		default -> this.nacionalidad = Nacionalidad.ESPAÑOLA;
		};
	}

	// Métodos privados para validaciones
	private String validarDNI(String DNI) {
		if (DNI == null || DNI.isBlank() || DNI.length() != 9) {
			throw new IllegalArgumentException("DNI no válido");
		}
		// Si no se lanza la exception devuelvo DNI para asignarselo a this.DNI en el constructor.
		return DNI;
	}
	
	public boolean sacarDinero(double dinero) {
		
		boolean estado = false;
		
		
		if (dinero > 0 && this.saldo >= dinero) {
		    this.saldo -= dinero;
		    estado = true;
		}
		
		return estado;
	}
	
	public boolean ingresarDinero(double dinero) {
		
		boolean estado = false;
		
		// 0 no voy a poder ingresar porque no tiene sentido y almenos debe ser positivo.
		if (dinero > 0) {
			estado = true;
			this.saldo += dinero;
		}
		
		return estado;
		
	}
	
	@Override
	public String toString() {
		String informacion = "Titular: " + this.nombre;
		informacion += "\nDNI del Titular: " + this.DNI;
		informacion += "\nSaldo: " + this.saldo;
		informacion += "\nNacionalidad: " + this.nacionalidad;
		
		return informacion;
	}
	
	@Override
	public boolean equals(Object cC) {
		
		CuentaCorriente cuenta2 = (CuentaCorriente) cC;
		
		boolean iguales = false;
		
		if (this.nombre.equals(cuenta2.nombre) && this.DNI.equals(cuenta2.DNI)) {
			iguales = true;
		}
		
		return iguales;
		
	}
}
