package crud.ejercicio3;

/**
 * Representa una pizza con su código, tamaño y tipo.
 */
public class Pizza {

    /**
     * Enumeración para los posibles tamaños de la pizza.
     */
    public enum Tamaño {
        MEDIANA, FAMILIAR
    }

    /**
     * Enumeración para los posibles tipos de pizza.
     */
    public enum TipoPizza {
        MARGARITA, CUATROQUESOS, FUNGHI
    }

    private int codigo;
    private Tamaño tamaño;
    private TipoPizza tipo;

    /**
     * Constructor para crear una nueva pizza.
     *
     * @param codigo El código único de la pizza.
     * @param tamaño El tamaño de la pizza (MEDIANA o FAMILIAR).
     * @param tipo   El tipo de pizza (MARGARITA, CUATROQUESOS o FUNGHI).
     * @throws IllegalArgumentException si el código es negativo o si el tamaño o el tipo son nulos.
     */
    public Pizza(int codigo, String tamaño, String tipo) {
        if (codigo < 0) {
            throw new IllegalArgumentException("El código de la pizza no puede ser negativo.");
        }
        if (tamaño == null) {
            throw new IllegalArgumentException("El tamaño de la pizza no puede ser nulo.");
        }
        if (tipo == null) {
            throw new IllegalArgumentException("El tipo de la pizza no puede ser nulo.");
        }

        try {
            this.tamaño = Tamaño.valueOf(tamaño.toUpperCase());
            this.tipo = TipoPizza.valueOf(tipo.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Tamaño o tipo de pizza no válido.");
        }

        this.codigo = codigo;
    }
    
    /**
     * Obtiene el código de la pizza.
     *
     * @return El código de la pizza.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Obtiene el tamaño de la pizza.
     *
     * @return El tamaño de la pizza.
     */
    public Tamaño getTamaño() {
        return tamaño;
    }

    /**
     * Obtiene el tipo de la pizza.
     *
     * @return El tipo de la pizza.
     */
    public TipoPizza getTipo() {
        return tipo;
    }

    /**
     * Devuelve una representación en cadena de la pizza.
     *
     * @return Una cadena que representa la pizza.
     */
    @Override
    public String toString() {
        return "Código: " + codigo + ", Tamaño: " + tamaño + ", Tipo: " + tipo;
    }
}

