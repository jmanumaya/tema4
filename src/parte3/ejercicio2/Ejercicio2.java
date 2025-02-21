package parte3.ejercicio2;

/**
 * Clase que proporciona métodos para calcular la media de números enteros.
 */
public class Ejercicio2 {

    /**
     * Calcula la media de dos números enteros.
     *
     * @param num1 El primer número.
     * @param num2 El segundo número.
     * @return La media de los dos números como un valor de tipo double.
     */
    public double media(int num1, int num2) {
        double resultado = (num1 + num2) / 2.0;
        return resultado;
    }

    /**
     * Calcula la media de tres números enteros.
     *
     * @param num1 El primer número.
     * @param num2 El segundo número.
     * @param num3 El tercer número.
     * @return La media de los tres números como un valor de tipo double.
     */
    public double media(int num1, int num2, int num3) {
        double resultado = (num1 + num2 + num3) / 3.0;
        return resultado;
    }
}
