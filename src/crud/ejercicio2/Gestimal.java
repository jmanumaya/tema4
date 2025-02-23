package crud.ejercicio2;

import java.util.ArrayList;

public class Gestimal {
	
	private ArrayList<Articulo> articulos = new ArrayList<>();
	
	public ArrayList<Articulo> listadoArticulos(){
		return articulos;
	}
	
	
	public boolean altaArticulo(String nombre, double precio, int stock) {
		
		boolean estado = false;
		
		boolean existe = false;
		
		if (nombre != null && !nombre.isEmpty() && precio > 0 && stock >= 0) {
			
			existe = buscaArticulo(nombre);
			
			if(!existe){
				Articulo art = new Articulo(nombre, precio, stock);
				articulos.add(art);
				estado = true;
			}
		}
		
		return estado;
		
	}
	
	public boolean bajaArticulo(String nombre){
		
		boolean estado = false;
		
		if (nombre != null && !nombre.isEmpty()) {
			
			for (Articulo a : articulos) {
				if (a.getNombre().equalsIgnoreCase(nombre)) {
					estado = true;
					articulos.remove(a);
					break;
				}
			}
		}
		
		return estado;
	}
	
	public boolean modificaArticulo(String nombre, double nuevoPrecio) {
		
		boolean estado = false;
		
		for (Articulo a : articulos) {
			if (a.getNombre().equalsIgnoreCase(nombre)) {
				estado = a.setPrecio(nuevoPrecio);
				break;
			}
		}
		
		return estado;
	}
	
	public boolean entradaMercancia(String nombre, int entradaMerca) {
		
		boolean estado = false;
		
		for (Articulo a : articulos) {
			if (a.getNombre().equalsIgnoreCase(nombre)) {
				estado = a.almacenar(entradaMerca);
				break;
			}
		}
		
		return estado;
	}
	
	public boolean buscaArticulo(String nombre) {
		
		boolean estado = false;
		
		for (Articulo a : articulos) {
			if (a.getNombre().equalsIgnoreCase(nombre)) {
				estado = true;
				break;
			}
		}
		
		return estado;
	}

}
