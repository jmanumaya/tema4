package parte3.ejercicio3;

/**
 * Clase que proporciona métodos para calcular la suma de números enteros.
 */
public class Ejercicio3 {

    /**
     * Calcula la suma de todos los números desde 1 hasta el número dado.
     *
     * @param numero El número hasta el cual se sumarán los valores.
     * @return La suma de los números desde 1 hasta {@code numero}.
     */
    public int sumaEnteros(int numero) {
        int resultado;
        if (numero <= 0) {
            resultado = 0;
        } else {
            resultado = numero + sumaEnteros(numero - 1);
        }
        return resultado;
    }

    /**
     * Calcula la suma de todos los números comprendidos entre num1 y num2 (inclusive).
     *
     * @param num1 El primer número del rango.
     * @param num2 El segundo número del rango.
     * @return La suma de los números entre {@code num1} y {@code num2}.
     */
    public int sumaEnteros(int num1, int num2) {
        int resultado;
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        resultado = (num2 * (num2 + 1) / 2) - ((num1 - 1) * num1 / 2);
        return resultado;
    }
}
