package crud.ejercicio3;

import java.util.ArrayList;

/**
 * Clase que gestiona las operaciones CRUD (Crear, Leer, Actualizar, Borrar) para las pizzas.
 */
public class Crud {
    private ArrayList<Pizza> pizzas = new ArrayList<>();

    /**
     * Obtiene la lista de todas las pizzas registradas.
     *
     * @return Una lista de objetos Pizza.
     */
    public ArrayList<Pizza> listadoPizzas() {
        return pizzas;
    }

    /**
     * Agrega una nueva pizza al registro.
     *
     * @param p La pizza a agregar.
     * @return true si la pizza se agregó correctamente, false en caso contrario.
     */
    public boolean nuevoPedido(Pizza p) {
        return pizzas.add(p);
    }

    /**
     * Marca una pizza como servida, eliminándola del registro.
     *
     * @param codigo El código de la pizza a marcar como servida.
     * @return true si la pizza se encontró y se marcó como servida, false en caso contrario.
     */
    public boolean pizzaServida(int codigo) {
    	
    	boolean estado = false;
    	
        for (int i = 0; i < pizzas.size(); i++) {
            if (pizzas.get(i).getCodigo() == codigo) {
                pizzas.remove(i);
                estado = true;
            }
        }
        return estado;
    }
}