package parte2.ejercicio1;


/**
 * La clase CuentaCorriente va a permitir poder crear distintos objetos con atributos como Nacionalidad, DNI, nombre y saldo 
 * correspondientes a datos básicos de una persona en una cuenta corriente.
 */
public class CuentaCorriente {
	
	/**
	 * 
	 */
	private enum Nacionalidad {ESPAÑOLA, EXTRANJERA};
	private final String DNI;
	private String nombre;
	private double saldo;
	private Nacionalidad nacionalidad;
	
	/**
	 * Constructor de la clase CuentaCorriente que va a permitir crear un objeto en base a los siguientes parámetros dados.
	 * @param DNI dni de la persona.
	 * @param saldo saldo que tiene la persona en la cuenta
	 */
	public CuentaCorriente(String DNI, double saldo) {
		this.DNI = validarDNI(DNI);
		
		// Entiendo que como saldo inicial va a ser siempre almenos 0. 
		this.saldo = Math.max(0, saldo);
	}

	/**
	 * Constructor de la clase CuentaCorriente que va a permitir crear un objeto en base a los siguientes parámetros dados.
	 * @param DNI dni de la persona.
	 * @param nombre nombre de la persona.
	 * @param saldo saldo que tiene la persona en la cuenta
	 */
	public CuentaCorriente(String DNI, String nombre, double saldo) {
		this.DNI = validarDNI(DNI);
		this.nombre = (nombre != null && !nombre.isBlank()) ? nombre : "Sin nombre";
		
		// Entiendo que como saldo inicial va a ser siempre almenos 0. 
		this.saldo = Math.max(0, saldo);
	}

	/**
	 * Constructor de la clase CuentaCorriente que va a permitir crear un objeto en base a los siguientes parámetros dados.
	 * @param DNI dni de la persona.
	 * @param nombre nombre de la persona.
	 * @param saldo saldo que tiene la persona en la cuenta
	 * @param nacionalidad nacionalidad de la persona que crea la cuenta.
	 */
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

	/**
	 * Metodo de la clase CuentaCorriente donde obtengo el valor de nombre
	 * @return nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo con el cual puedo actualizar el nombre de una persona de su cuenta corriente
	 * @param nombre de la persona de la cuenta
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Metodo para obtener el saldo de una Cuenta Corriente.
	 * @return saldo de una cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Metodo para actualizar el saldo de una cuenta corriente.
	 * @param saldo nuevo saldo con el que se quiera actualizar en la cuenta
	 */
	public void setSaldo(double saldo) {
		
	    this.saldo = saldo;
	}

	/**
	 * Metodo para obtener la nacionalidad de una cuenta corriente
	 * @return nacionalidad de la cuenta
	 */
	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * Metodo para actualizar la nacionalidad de una cuenta corriente.
	 * @param nacionalidad nueva nacionalidad que queremos actualizar de una cuenta
	 */
	public void setNacionalidad(String nacionalidad) {
		// Compruebo si la nacionalidad es valida llamando a la siguiente funcion y le doy el valor que me devuelva a this.nacionalidad si este ha sido valido.
		switch (nacionalidad.toUpperCase()) {
		case "ESPAÑOLA" -> this.nacionalidad = Nacionalidad.ESPAÑOLA;
		case "EXTRANJERA" -> this.nacionalidad = Nacionalidad.EXTRANJERA;
		default -> this.nacionalidad = Nacionalidad.ESPAÑOLA;
		};
	}

	/**
	 * Funcion para validad el DNI que introducen en el constructor
	 * @param DNI dni introducido para referenciar a una persona en una cuenta
	 * @return DNI dni validado para poder aplicarlo en el constructor o de donde queramos validar el dni introducido.
	 */
	private String validarDNI(String DNI) {
		if (DNI == null || DNI.isBlank() || DNI.length() != 9) {
			throw new IllegalArgumentException("DNI no válido");
		}
		// Si no se lanza la exception devuelvo DNI para asignarselo a this.DNI en el constructor.
		return DNI;
	}
	
	/**
	 * Metodo donde se puede sacar dinero usando una resta entre el dinero que se quiere sacar y el que ya se tiene en la cuenta (si se puede).
	 * @param dinero Cantidad indicada por el titular que quiere sacar 
	 * @return estado Devuelve true o false dependiendo si se puede realizar la acción o no.
	 */
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
