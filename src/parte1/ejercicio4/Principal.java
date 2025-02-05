package parte1.ejercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Articulo art1 = new Articulo();
		
		String nombre;
		double precio;
		int iva;
		int cuantosQuedan;
		
		double pvp;
		
		System.out.println("Nombre del Articulo");
		nombre = sc.nextLine();
		System.out.println("Precio del Articulo");
		precio = sc.nextDouble();
		System.out.println("IVA del Articulo");
		iva = sc.nextInt();
		System.out.println("Cuantos Quedan");
		cuantosQuedan = sc.nextInt();
		
		art1.setNombre(nombre);
		art1.setPrecio(precio);
		art1.setCuantosQuedan(cuantosQuedan);
		art1.setNombre(nombre);
		
		pvp = precio * iva / 100;
		
		System.out.println(art1.getNombre() + " - Precio:" + art1.getPrecio() + "€ - IVA:" + art1.getIVA() + "% - PVP:" + pvp + "€");

	}

}
