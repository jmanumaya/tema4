package parte3.ejercicio6;

public class FuncionesMatematicas {

    // Función recursiva para calcular el sumatorio de los números entre 1 y n
    public static int sumatorio(int numero) {
    	
    	int suma = 0;
    	
        if (numero <= 1) {
            suma = numero;
        } else {
        	suma = numero + sumatorio(numero - 1);
        }
        
        return suma;
    }

    // Función recursiva para calcular la potencia de un número
    public static double potencia(double a, int n) {
    	
    	double potencia;
    	
        if (n == 0) {
            potencia = 1;
        } else {
        	potencia = a * potencia(a, n - 1);
        }
        return potencia;
    }

    // Función recursiva para calcular el término n de la serie de Fibonacci
    public static int serieFibonacci(int numero) {
    	
        if (numero == 0 || numero == 1) {
            return 1;  // Caso base: fibonacci(0) = 1, fibonacci(1) = 1
        }
        return serieFibonacci(numero - 1) + serieFibonacci(numero - 2);  // Caso recursivo
    }

    // Método main para probar las funciones
    public static void main(String[] args) {
        // Probar sumatorio
        int num1 = 5;
        System.out.println("Sumatorio de " + num1 + " es: " + sumatorio(num1));

        // Probar potencia
        double base = 2.0;
        int exponente = 3;
        System.out.println(base + " elevado a la " + exponente + " es: " + potencia(base, exponente));

        // Probar serie Fibonacci
        int fibonacciTerm = 6;
        System.out.println("El término " + fibonacciTerm + " de la serie Fibonacci es: " + serieFibonacci(fibonacciTerm));
    }
}

