package parte4.ejercicio4;

public class Principal {

	public static void main(String[] args) {
		
		Fraccion f1 = new Fraccion(1, 2);
        Fraccion f2 = new Fraccion(1, 4);

        System.out.println("Fracción 1: " + f1);
        System.out.println("Fracción 2: " + f2);

        Fraccion suma = f1.suma(f2);
        System.out.println("Suma: " + suma);

        Fraccion resta = f1.resta(f2);
        System.out.println("Resta: " + resta);

        Fraccion multiplicacion = f1.multiplica(f2);
        System.out.println("Multiplicación: " + multiplicacion);

        Fraccion division = f1.divide(f2);
        System.out.println("División: " + division);

        Fraccion f3 = new Fraccion(12, 18);
        System.out.println("Fracción 3 (antes de simplificar): " + f3);
        f3.simplifica();
        System.out.println("Fracción 3 (después de simplificar): " + f3);

        try {
            Fraccion f4 = new Fraccion(1, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        try {
            Fraccion f5 = new Fraccion(1, 2);
            Fraccion f6 = new Fraccion(0, 1);
            f5.divide(f6);
        } catch (ArithmeticException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

	}

}
