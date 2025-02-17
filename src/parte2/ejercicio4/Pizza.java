package parte2.ejercicio4;

/**
 * Clase que representa una Pizza con código único, tamaño, tipo y estado.
 */
public class Pizza {

    /**
     * Enumeración para los tamaños de la pizza.
     */
    public enum Tamaño { MEDIANA, FAMILIAR }

    /**
     * Enumeración para los tipos de pizza.
     */
    public enum Tipo { MARGARITA, CUATROQUESOS, FUNGHI }

    /**
     * Enumeración para los estados de la pizza.
     */
    public enum Estado { PEDIDA, SERVIDA }

    private final int codigo;
    private Tamaño tamaño;
    private Tipo tipo;
    private Estado estado;

    /**
     * Constructor de la clase Pizza.
     * El estado siempre será "PEDIDA" al crear una nueva pizza.
     * 
     * @param codigo Código único de la pizza.
     * @param tamaño Tamaño de la pizza (Mediana o Familiar).
     * @param tipo   Tipo de la pizza (Margarita, CuatroQuesos o Funghi).
     */
    public Pizza(int codigo, String tamaño, String tipo) {
        this.codigo = codigo;
        this.tamaño = Tamaño.valueOf(tamaño.toUpperCase());
        this.tipo = Tipo.valueOf(tipo.toUpperCase());
        this.estado = Estado.PEDIDA; // Siempre inicia como "Pedida"
    }

    /**
     * Devuelve el código de la pizza.
     * @return Código de la pizza.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Devuelve el tamaño de la pizza.
     * @return Tamaño de la pizza.
     */
    public Tamaño getTamaño() {
        return tamaño;
    }

    /**
     * Devuelve el tipo de la pizza.
     * @return Tipo de la pizza.
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Devuelve el estado actual de la pizza.
     * @return Estado de la pizza.
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Permite cambiar el estado de la pizza a "Servida".
     */
    public void servir() {
        this.estado = Estado.SERVIDA;
    }

    /**
     * Devuelve una representación en texto de la pizza.
     * @return Cadena con los detalles de la pizza.
     */
    @Override
    public String toString() {
        return codigo + ": " + tamaño + " - " + tipo + " - " + estado;
    }

    /**
     * Compara dos pizzas para determinar si son iguales.
     * Son iguales si tienen el mismo código.
     * 
     * @param obj Objeto a comparar.
     * @return true si las pizzas tienen el mismo código, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {

        Pizza otraPizza = (Pizza) obj;
        
        return this.codigo == otraPizza.codigo;
    }
}

