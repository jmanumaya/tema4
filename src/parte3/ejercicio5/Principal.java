package parte3.ejercicio5;

public class Principal {

	public static void main(String[] args) {
		
        Ejercicio5 ejercicio = new Ejercicio5();
        
        System.out.println("Generando 5 números aleatorios entre 0 y 1:");
        ejercicio.numerosAleatorios(5);
        
        System.out.println("\nGenerando 5 números aleatorios entre 0 y 10:");
        ejercicio.numerosAleatorios(5, 10);
        
        System.out.println("\nGenerando 5 números aleatorios entre 5 y 15:");
        ejercicio.numerosAleatorios(5, 5, 15);

	}

}
