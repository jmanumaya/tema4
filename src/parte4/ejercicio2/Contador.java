package parte4.ejercicio2;

/**
 * Representa un contador entero no negativo.
 */
public class Contador {
    
    /**
     * El valor actual del contador.
     */
    private int cont;

    /**
     * Construye un objeto Contador con el valor inicial especificado.
     *
     * @param cont El valor inicial del contador (debe ser no negativo).
     * @throws IllegalArgumentException Si el valor inicial es negativo.
     */
    public Contador(int cont) {
        
        if(cont >= 0) {
            this.cont = cont;
        }
        else {
            throw new IllegalArgumentException("Error: El contador debe empezar almenos desde 0.");
        }
    }

    /**
     * Establece el valor del contador.
     *
     * @param cont El nuevo valor del contador (debe ser no negativo).
     * @throws IllegalArgumentException Si el nuevo valor es negativo.
     */
    public void setCont(int cont) {
        if(cont >= 0) {
            this.cont = cont;
        }
        else {
            throw new IllegalArgumentException("Error: El contador debe empezar almenos desde 0.");
        }
    }
    
    /**
     * Incrementa el valor del contador en uno.
     */
    public void incrementar() {
        ++cont;
    }
    
    /**
     * Decrementa el valor del contador en uno, asegurando que no sea negativo.
     */
    public void decrementar() {
        --cont;
        if(cont < 0) {
            cont = 0;
        }
    }

    /**
     * Devuelve una representación en cadena del contador.
     *
     * @return La representación en cadena del contador.
     */
    @Override
    public String toString() {
        return "Contador: " + cont;
    }

}