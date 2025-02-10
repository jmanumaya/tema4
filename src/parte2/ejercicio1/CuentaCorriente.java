package parte2.ejercicio1;

public class CuentaCorriente {
	
	private final String DNI;
	private String nombre;
	private double saldo;
	private enum Nacionalidad {ESPAÑOLA, EXTRANJERA};
	private Nacionalidad nacionalidad;
	
	// Constructor 1: Solo DNI y saldo
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
		this.nacionalidad = validarNacionalidad(nacionalidad);
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
		/* ¿Tengo ya un saldo inicializado? (Si) puedo asignar el saldo que me den idependientemente si es negativo o no.
		   (No) (quiere decir que no tengo saldo almacenado) ¿el saldo introducido es 0 o positivo? (Si) puedo introducir el saldo (No) Salta exepción*/
		
//	    if (saldoInicializado || saldo >= 0) {
//	        this.saldo = saldo;
//	        saldoInicializado = true;
//	    } else {
//	        throw new IllegalArgumentException("No se puede asignar saldo negativo sin fondos previos.");
//	    }
		
		if (this.saldo == 0 && saldo < 0) {
	        throw new IllegalArgumentException("No se puede asignar saldo negativo sin fondos previos.");
	    }
	    this.saldo = saldo;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		// Compruebo si la nacionalidad es valida llamando a la siguiente funcion y le doy el valor que me devuelva a this.nacionalidad si este ha sido valido.
		this.nacionalidad = validarNacionalidad(nacionalidad);
	}

	// Métodos privados para validaciones
	private String validarDNI(String DNI) {
		if (DNI == null || DNI.isBlank() || DNI.length() != 9) {
			throw new IllegalArgumentException("DNI no válido");
		}
		// Si no se lanza la exception devuelvo DNI para asignarselo a this.DNI en el constructor.
		return DNI;
	}

	private Nacionalidad validarNacionalidad(String nacionalidad) {
		// Si se ha introducido una nacionalidad valida la devuelvo para darle valor a this.nacionalidad si no salta una exepcion ya que no la encuentra.
		return Nacionalidad.valueOf(nacionalidad.toUpperCase());
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
	
	public boolean equals(CuentaCorriente CC) {
		
		boolean iguales = false;
		
		if (this.nombre.equals(CC.nombre) && this.DNI.equals(CC.DNI)) {
			iguales = true;
		}
		
		return iguales;
		
	}
}
