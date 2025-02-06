package parte1.ejercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		double precio;
		int cuantosQuedan;
		
		double pvp;
		
		// Obtengo los valores para el objeto art1.
		System.out.println("Nombre del Artículo:");
		nombre = sc.nextLine();
		System.out.println("Precio del Artículo:");
		precio = sc.nextDouble();
		System.out.println("Cuántos Quedan:");
		cuantosQuedan = sc.nextInt();
		
		// Creo el objeto usando el constructor con valores iniciales
		Articulo art1 = new Articulo(nombre, precio, cuantosQuedan);
		
		// Modifico los valores con los setters
		System.out.println("\nModificando los valores...");
		System.out.println("Nuevo nombre:");
		art1.setNombre(sc.next());
		System.out.println("Nuevo precio:");
		art1.setPrecio(sc.nextDouble());
		System.out.println("Nuevos cuantos quedan:");
		art1.setCuantosQuedan(sc.nextInt());
		
		// Calculo el PVP, incluyendo el IVA en el precio
		pvp = art1.getPrecio() + (art1.getPrecio() * art1.getIVA() / 100);
		
		// Muestro la información
		System.out.println("\nArtículo modificado:");
		System.out.println(art1.getNombre() + " - Precio: " + art1.getPrecio() + "€ - IVA: " + art1.getIVA() + "% - PVP: " + pvp + "€");
		
		sc.close();
	}
}
