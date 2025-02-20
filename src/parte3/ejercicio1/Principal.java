package parte3.ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
	    Ejercicio1 ejercicio = new Ejercicio1();

	    // Pruebas con enteros
	    System.out.println("Suma de 5 y 7: " + ejercicio.suma(5, 7)); // 12
	    System.out.println("Suma de -3 y 9: " + ejercicio.suma(-3, 9)); // 6

	    // Pruebas con doubles
	    System.out.println("Suma de 3.5 y 2.2: " + ejercicio.suma(3.5, 2.2)); // 5.7
	    System.out.println("Suma de -1.1 y 4.4: " + ejercicio.suma(-1.1, 4.4)); // 3.3

	}

}
