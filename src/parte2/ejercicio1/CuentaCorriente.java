package parte2.ejercicio1;

/**
 * La clase CuentaCorriente va a permitir poder crear distintos objetos con atributos como Nacionalidad, DNI, nombre y saldo 
 * correspondientes a datos básicos de una persona en una cuenta corriente.
 */
public class CuentaCorriente {
	
	/**
	 * Enum para definir la nacionalidad de la cuenta corriente.
	 */
	private enum Nacionalidad {ESPAÑOLA, EXTRANJERA};
	private final String DNI;
	private String nombre;
	private double saldo;
	private Nacionalidad nacionalidad;
	
	/**
	 * Constructor de la clase CuentaCorriente que va a permitir crear un objeto en base a los siguientes parámetros dados.
	 * @param DNI dni de la persona.
	 * @param saldo saldo que tiene la persona en la cuenta.
	 */
	public CuentaCorriente(String DNI, double saldo) {
		this.DNI = validarDNI(DNI);
		// Entiendo que como saldo inicial va a ser siempre al menos 0. 
		this.saldo = Math.max(0, saldo);
	}

	/**
	 * Constructor de la clase CuentaCorriente con nombre incluido.
	 * @param DNI dni de la persona.
	 * @param nombre nombre de la persona.
	 * @param saldo saldo que tiene la persona en la cuenta.
	 */
	public CuentaCorriente(String DNI, String nombre, double saldo) {
		this.DNI = validarDNI(DNI);
		this.nombre = (nombre != null && !nombre.isBlank()) ? nombre : "Sin nombre";
		// Entiendo que como saldo inicial va a ser siempre al menos 0. 
		this.saldo = Math.max(0, saldo);
	}

	/**
	 * Constructor de la clase CuentaCorriente con nombre y nacionalidad.
	 * @param DNI dni de la persona.
	 * @param nombre nombre de la persona.
	 * @param saldo saldo que tiene la persona en la cuenta.
	 * @param nacionalidad nacionalidad de la persona que crea la cuenta.
	 */
	public CuentaCorriente(String DNI, String nombre, double saldo, String nacionalidad) {
		this.DNI = validarDNI(DNI);
		this.nombre = (nombre != null && !nombre.isBlank()) ? nombre : "Sin nombre";
		// Entiendo que como saldo inicial va a ser siempre al menos 0. 
		this.saldo = Math.max(0, saldo);
		// Compruebo si la nacionalidad es válida y la asigno correctamente.
		this.nacionalidad = switch (nacionalidad.toUpperCase()) {
			case "ESPAÑOLA" -> Nacionalidad.ESPAÑOLA;
			case "EXTRANJERA" -> Nacionalidad.EXTRANJERA;
			default -> Nacionalidad.ESPAÑOLA;
		};
	}

	/**
	 * Obtiene el nombre del titular de la cuenta.
	 * @return nombre de la persona.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Actualiza el nombre del titular de la cuenta.
	 * @param nombre nuevo nombre del titular.
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Obtiene el saldo disponible en la cuenta corriente.
	 * @return saldo de la cuenta.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Actualiza el saldo de la cuenta corriente.
	 * @param saldo nuevo saldo que se quiere establecer en la cuenta.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Obtiene la nacionalidad de la cuenta corriente.
	 * @return nacionalidad de la cuenta.
	 */
	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * Actualiza la nacionalidad de la cuenta corriente.
	 * @param nacionalidad nueva nacionalidad que queremos asignar a la cuenta.
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = switch (nacionalidad.toUpperCase()) {
			case "ESPAÑOLA" -> Nacionalidad.ESPAÑOLA;
			case "EXTRANJERA" -> Nacionalidad.EXTRANJERA;
			default -> Nacionalidad.ESPAÑOLA;
		};
	}

	/**
	 * Valida el DNI introducido.
	 * @param DNI dni introducido para referenciar a una persona en una cuenta.
	 * @return DNI validado para aplicarlo en el constructor o donde sea necesario.
	 * @throws IllegalArgumentException si el DNI no es válido.
	 */
	private String validarDNI(String DNI) {
		if (DNI == null || DNI.isBlank() || DNI.length() != 9) {
			throw new IllegalArgumentException("DNI no válido");
		}
		return DNI;
	}
	
	/**
	 * Permite retirar dinero de la cuenta si hay suficiente saldo.
	 * @param dinero cantidad que se quiere retirar.
	 * @return true si la operación se realizó con éxito, false si no hay suficiente saldo.
	 */
	public boolean sacarDinero(double dinero) {
		
		boolean estado = false;
		
		if (dinero > 0 && this.saldo >= dinero) {
			this.saldo -= dinero;
			estado = true;
		}
		return estado;
	}
	
	/**
	 * Permite ingresar dinero en la cuenta corriente.
	 * @param dinero cantidad que se quiere ingresar.
	 * @return true si el ingreso se realizó con éxito, false si el monto es inválido.
	 */
	public boolean ingresarDinero(double dinero) {
		
		boolean estado = false;
		
		if (dinero > 0) {
			this.saldo += dinero;
			estado = true;
		}
		return estado;
	}
	
	/**
	 * Devuelve una representación en texto de la cuenta corriente.
	 * @return cadena con la información de la cuenta.
	 */
	@Override
	public String toString() {
		return "Titular: " + this.nombre + "\n" +
			   "DNI del Titular: " + this.DNI + "\n" +
			   "Saldo: " + this.saldo + "\n" +
			   "Nacionalidad: " + this.nacionalidad;
	}
	
	/**
	 * Compara dos cuentas corrientes y determina si son iguales.
	 * @param cC objeto a comparar.
	 * @return true si las cuentas son iguales (mismo nombre y DNI), false en caso contrario.
	 */
	@Override
	public boolean equals(Object cC) {
		CuentaCorriente cuenta2 = (CuentaCorriente) cC;
		
		return this.nombre.equals(cuenta2.nombre) && this.DNI.equals(cuenta2.DNI);
	}
}
