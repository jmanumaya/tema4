package parte3.ejercicio3;

public class Principal {

	public static void main(String[] args) {
		
	    Ejercicio3 ejercicio = new Ejercicio3();

	    // Pruebas con un solo número
	    System.out.println("Suma hasta 5: " + ejercicio.sumaEnteros(5)); // 15
	    System.out.println("Suma hasta 10: " + ejercicio.sumaEnteros(10)); // 55
	    System.out.println("Suma hasta 0: " + ejercicio.sumaEnteros(0)); // 0
	    System.out.println("Suma hasta -3: " + ejercicio.sumaEnteros(-3)); // 0

	    // Pruebas con un rango
	    System.out.println("Suma entre 3 y 6: " + ejercicio.sumaEnteros(3, 6)); // 18
	    System.out.println("Suma entre 1 y 10: " + ejercicio.sumaEnteros(1, 10)); // 55
	    System.out.println("Suma entre 10 y 5: " + ejercicio.sumaEnteros(10, 5)); // 45 (invierte el orden)
	    System.out.println("Suma entre -3 y 3: " + ejercicio.sumaEnteros(-3, 3)); // 0

	}

}
