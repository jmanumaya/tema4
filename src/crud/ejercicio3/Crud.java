package crud.ejercicio3;

import java.util.ArrayList;

public class Crud {

	ArrayList<Pizza> pizzas = new ArrayList<>();
	
	public ArrayList<Pizza> listadoPizzas(){
		
		return pizzas;
	}
	
	public boolean nuevoPedido(Pizza p) {
		return pizzas.add(p);
	}
}
