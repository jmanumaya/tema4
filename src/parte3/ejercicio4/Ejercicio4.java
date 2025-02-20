package parte3.ejercicio4;

/**
 * Clase que proporciona métodos para convertir valores enteros y cadenas en booleanos.
 */
public class Ejercicio4 {

    /**
     * Convierte un número entero en un valor booleano.
     * 
     * @param numero Un número entero (0 o 1).
     * @return {@code true} si el número es 1, {@code false} si es 0.
     */
    public boolean parseToBoolean(int numero) {
        return numero == 1;
    }

    /**
     * Convierte una cadena de texto en un valor booleano.
     * 
     * @param argumento Cadena de texto que debe ser "true" o "false" (sin distinción de mayúsculas o minúsculas).
     * @return {@code true} si la cadena es "true", {@code false} en caso contrario.
     */
    public boolean parseToBoolean(String argumento) {
        return argumento != null && argumento.equalsIgnoreCase("true");
    }
}
