package parte3.ejercicio5;

import java.util.Random;

/**
 * Clase que proporciona métodos para generar números aleatorios.
 */
public class Ejercicio5 {
    
    /**
     * Genera y muestra por pantalla una cantidad dada de números aleatorios entre 0 y 1.
     * 
     * @param cantidad Cantidad de números aleatorios a generar.
     */
    public void numerosAleatorios(int cantidad) {
        Random rd = new Random();
        for (int i = 0; i < cantidad; i++) {
            System.out.println(rd.nextDouble());
        }
    }
    
    /**
     * Genera y muestra por pantalla una cantidad dada de números aleatorios enteros entre 0 y un valor máximo.
     * 
     * @param cantidad Cantidad de números aleatorios a generar.
     * @param valorMaximo Valor máximo (exclusivo) que pueden tomar los números generados.
     */
    public void numerosAleatorios(int cantidad, int valorMaximo) {
        Random rd = new Random();
        for (int i = 0; i < cantidad; i++) {
            System.out.println(rd.nextInt(valorMaximo));
        }
    }
    
    /**
     * Genera y muestra por pantalla una cantidad dada de números aleatorios enteros entre un valor mínimo y un valor máximo.
     * 
     * @param cantidad Cantidad de números aleatorios a generar.
     * @param valorMinimo Valor mínimo (inclusive) que pueden tomar los números generados.
     * @param valorMaximo Valor máximo (exclusivo) que pueden tomar los números generados.
     * @throws IllegalArgumentException Si el valor mínimo es mayor o igual al valor máximo.
     */
    public void numerosAleatorios(int cantidad, int valorMinimo, int valorMaximo) {
        if (valorMinimo >= valorMaximo) {
            throw new IllegalArgumentException("El valor mínimo debe ser menor que el valor máximo.");
        }
        Random rd = new Random();
        for (int i = 0; i < cantidad; i++) {
            System.out.println(rd.nextInt(valorMaximo - valorMinimo) + valorMinimo);
        }
    }
}
