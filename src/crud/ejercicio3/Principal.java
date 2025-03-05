package crud.ejercicio3;

import java.util.Scanner;

import crud.ejercicio2.Articulo;
import crud.ejercicio2.Gestimal;

public class Principal {

	public static void main(String[] args) {
		// Creo el escaner
		Scanner sc = new Scanner(System.in);
				
		// Me creo un objero Gestimal para poder trabajar con sus metodos
		Crud crud = new Crud(); // ¿? <-- Preguntar en clase ¿Lo dejo asi y así no tengo que poner static en cada metodo de la clase para acceder a el o alreves?
		
		// Variable que va a contener la opcion del menu elegida
		String opcion = "";
		
		// Variable para almacenar el nombre dado en cada caso del articulo.
		int codigo = 1;
		
		// Variable que va a ir conteniendo el precio de cada articulo en cada caso
		String tamaño = "";
		
		// Variable que va a ir conteniendo la entrada de mercancia
		String tipo = "";
		
		// Do-While para hacer hasta que se introduzca 5 en el menú.
		do {
			
			// Menu de opciones...
			System.out.println("\n======================\n"
							 + "   MENÚ DE OPCIONES"
							 + "\n======================\n"
							 + "A. Listado.\r\n"
							 + "B. Nuevo Pedido.\r\n"
							 + "C. Pizza Servida.\r\n"
							 + "D. Salir.\r\n"
							 + "----------------------\n");
			System.out.print("Opción: ");
			opcion = sc.next().toUpperCase();
			sc.nextLine();
			
			switch (opcion) {
			
				case "A" -> {
					
					if(crud.listadoPizzas().isEmpty()) {
				        System.err.println("❌ No hay artículos registrados ❌");
				        
					} else {
						System.out.println("\n===========================");
						System.out.println("🗂 Listado de Pizzas 🗂");
						System.out.println("===========================");
				        for (Pizza pizza : crud.listadoPizzas()) {
				            System.out.println("🔸 " + pizza);
				            System.out.println("---------------------");
				        }
					}
				}
				
				case "B" -> {
					
					System.out.println("Nuevo Pedido");
					System.out.print("Elige Tamaño (Mediana - Familiar): ");
					tamaño = sc.next();
					System.out.print("Elige Tipo (Margarita, CuatroQuesos, Funghi): ");
					tipo = sc.next();
					
					Pizza p = new Pizza(codigo, tamaño, tipo);
					
					if(crud.nuevoPedido(p)) {
						++codigo;
						System.out.println("Pedido Registrado Correctamente");
					} else {
						System.err.println("Error: Revisa que el Tamaño y Tipo Elegido se Correspondan con los Indicados.");
					}
					
				}
			}
			
		}while (!opcion.equals("D"));
	}

}
