package parte2.ejercicio1;

public class CuentaCorriente {
	
	private final String DNI;
	private String nombre;
	private double saldo;
	private enum nacionalidad {ESPAÑOLA, EXTRANJERA};
	nacionalidad nacionalidad;
	
	public CuentaCorriente(String DNI, double saldo) {
		
		if (DNI	!= null && !DNI.isBlank() && (DNI.length() == 9)) {
			this.DNI = DNI;
		}

		this.saldo = saldo;
	}
	
	public CuentaCorriente(String DNI, String nombre, double saldo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public CuentaCorriente(String DNI, String nombre, double saldo, nacionalidad nacionalidad) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
		this.nacionalidad = nacionalidad;
	}
}
