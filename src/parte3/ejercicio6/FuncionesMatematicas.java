package parte3.ejercicio6;

/**
 * Clase que proporciona funciones matemáticas recursivas.
 */
public class FuncionesMatematicas {
    /**
     * Calcula el sumatorio de un número de forma recursiva.
     * 
     * @param numero Número hasta el cual se desea calcular el sumatorio.
     * @return La suma de todos los números desde 1 hasta el número dado.
     */
    public static int sumatorio(int numero) {
        int resultado;
        if (numero <= 1) {
            resultado = numero;
        } else {
            resultado = numero + sumatorio(numero - 1);
        }
        return resultado;
    }

    /**
     * Calcula la potencia de un número de forma recursiva.
     * 
     * @param a Base de la potencia.
     * @param n Exponente de la potencia.
     * @return El resultado de elevar la base al exponente dado.
     */
    public static double potencia(double a, int n) {
        double resultado;
        if (n == 0) {
            resultado = 1;
        } else if (n < 0) {
            resultado = 1 / potencia(a, -n);
        } else {
            resultado = a * potencia(a, n - 1);
        }
        return resultado;
    }

    /**
     * Calcula el enésimo número de la serie de Fibonacci de forma recursiva.
     * 
     * @param numero Índice del número de Fibonacci a calcular.
     * @return El número de Fibonacci correspondiente al índice dado.
     */
    public static int serieFibonacci(int numero) {
        int resultado;
        if (numero == 0 || numero == 1) {
            resultado = 1;
        } else {
            resultado = serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
        }
        return resultado;
    }

    /**
     * Método principal para probar las funciones matemáticas.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        System.out.println("Sumatorio de 5: " + sumatorio(5)); // 15
        System.out.println("Potencia 2^3: " + potencia(2, 3)); // 8.0
        System.out.println("Fibonacci de 5: " + serieFibonacci(5)); // 8
    }
}

