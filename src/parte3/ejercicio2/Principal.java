package parte3.ejercicio2;

public class Principal {

	public static void main(String[] args) {
		
	    Ejercicio2 ejercicio = new Ejercicio2();

	    // Pruebas con dos números
	    System.out.println("Media de 4 y 6: " + ejercicio.media(4, 6)); // 5.0
	    System.out.println("Media de 10 y 15: " + ejercicio.media(10, 15)); // 12.5
	    System.out.println("Media de 5 y 8: " + ejercicio.media(5, 8)); // 6.5

	    // Pruebas con tres números
	    System.out.println("Media de 3, 6 y 9: " + ejercicio.media(3, 6, 9)); // 6.0
	    System.out.println("Media de 1, 2 y 3: " + ejercicio.media(1, 2, 3)); // 2.0
	    System.out.println("Media de 10, 20 y 30: " + ejercicio.media(10, 20, 30)); // 20.0

	}

}
