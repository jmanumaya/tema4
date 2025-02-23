package crud.ejercicio2;

import java.util.Scanner;

import crud.ejercicio1.Alumno;
import crud.ejercicio1.Crud;

public class Principal {

	public static void main(String[] args) {
		
		// Creo el escaner
		Scanner sc = new Scanner(System.in);
				
		// Me creo un objero Gestimal para poder trabajar con sus metodos
		Gestimal gestimal = new Gestimal(); // ¿? <-- Preguntar en clase ¿Lo dejo asi y así no tengo que poner static en cada metodo de la clase para acceder a el o alreves?
		
		// Variable que va a contener la opcion del menu elegida
		String opcion = "";
		
		// Variable para almacenar el nombre dado en cada caso del articulo.
		String nombre = "";
		
		// Variable estado que va a servir para controlar la modificacion de algun articulo
		boolean estado = false;
		
		// Variable que va a ir conteniendo el precio de cada articulo en cada caso
		double precio;
		
		// Variable que va a ir conteniendo la entrada de mercancia
		int entradaMercancia;
		
		// Variable que va a ir conteniendo la salida de mercancia
		int salidaMercancia;
		
		// Do-While para hacer hasta que se introduzca 5 en el menú.
		do {
			
			// Menu de opciones...
			System.out.println("\n======================\n"
							 + "   MENÚ DE OPCIONES"
							 + "\n======================\n"
							 + "A. Listado.\r\n"
							 + "B. Alta.\r\n"
							 + "C. Baja.\r\n"
							 + "D. Modificación.\r\n"
							 + "E. Entrada de Mercancía.\r\n"
							 + "F. Salida de Mercancía.\r\n"
							 + "G. Salir.\r\n"
							 + "----------------------\n");
			System.out.print("Opción: ");
			opcion = sc.next().toUpperCase();
			sc.nextLine();
			
			switch (opcion) {
			
				case "A" -> {
					
					if(gestimal.listadoArticulos().isEmpty()) {
				        System.err.println("❌ No hay artículos registrados ❌");
				        
					} else {
						System.out.println("\n===========================");
						System.out.println("🗂 Listado de Artículos 🗂");
						System.out.println("===========================");
				        for (Articulo articulo : gestimal.listadoArticulos()) {
				            System.out.println("🔸 " + articulo);
				            System.out.println("---------------------");
				        }
					}
				}
				
				case "B" -> {
					
					System.out.println("Alta de Artículo.");
					System.out.print("Introduce el Nombre: ");
					nombre = sc.nextLine();
					System.out.print("Introduce el Precio: ");
					precio = sc.nextDouble();
					System.out.print("Introduce el Stock Inicial: ");
					entradaMercancia = sc.nextInt();
					sc.nextLine();
					
					System.out.println(gestimal.altaArticulo(nombre, precio, entradaMercancia) ? "Alta Completada Correctamente" : "No se ha Podido Realizar el Proceso");
				}
				
				case "C" -> {
					
					System.out.println("Baja de Artículo");
					System.out.print("Indica el nombre del Artículo: ");
					nombre = sc.nextLine();
					System.out.println(gestimal.bajaArticulo(nombre) ? "Baja Realizada Correctamente" : "El Artículo " + nombre + " no Existe");
				}
				
				case "D" -> {
					
					System.out.println("Modificación de Artículo");
					System.out.print("Indica el nombre del Artículo a Modificar: ");
					nombre = sc.nextLine();
					
					if(gestimal.buscaArticulo(nombre)) {
						
						System.out.print("Indica el nuevo Precio del Artículo: ");
						precio = sc.nextDouble();
						sc.nextLine();
						System.out.println(gestimal.modificaArticulo(nombre, precio) ? "Artículo Modificado Correctamente" : "Error: Precio no Válido");
					} else {
						System.out.println("El Artículo " + nombre + " no Existe");
					}
				}
				
			}
			
		} while (!opcion.equals("G"));
		
		sc.close();
	}

}
