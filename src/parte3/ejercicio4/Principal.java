package parte3.ejercicio4;

public class Principal {

	public static void main(String[] args) {
		
	    Ejercicio4 ejercicio = new Ejercicio4();

	    // Pruebas con enteros
	    System.out.println("parseToBoolean(1): " + ejercicio.parseToBoolean(1)); // true
	    System.out.println("parseToBoolean(0): " + ejercicio.parseToBoolean(0)); // false
	    System.out.println("parseToBoolean(2): " + ejercicio.parseToBoolean(2)); // false (no está definido en el enunciado)

	    // Pruebas con Strings
	    System.out.println("parseToBoolean(\"true\"): " + ejercicio.parseToBoolean("true")); // true
	    System.out.println("parseToBoolean(\"false\"): " + ejercicio.parseToBoolean("false")); // false
	    System.out.println("parseToBoolean(\"TrUe\"): " + ejercicio.parseToBoolean("TrUe")); // true (prueba con mayúsculas)
	    System.out.println("parseToBoolean(\"FALSE\"): " + ejercicio.parseToBoolean("FALSE")); // false (prueba con mayúsculas)
	    System.out.println("parseToBoolean(\"hello\"): " + ejercicio.parseToBoolean("hello")); // false (cualquier otra cadena)
	    System.out.println("parseToBoolean(null): " + ejercicio.parseToBoolean(null)); // false (manejo de null)

	}

}
