package crud.ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		// Me creo un objero crud para poder trabajar con sus metodos
		Crud crud = new Crud(); // ¿? <-- Preguntar en clase ¿Lo dejo asi y así no tengo que poner static en cada metodo de la clase para acceder a el o alreves?
		
		// Variable que va a contener la opcion del menu elegida
		int opcion;
		
		// Variable para almacenar el nombre dado en cada caso del alumno.
		String nombre = "";
		
		// Variable estado que va a servir para controlar la modificacion de la nota de algun alumno
		boolean estado = false;
		
		// Variable que va a ir conteniendo la nota media de cada alumno en cada caso
		double notaMedia;
		
		// Do-While para hacer hasta que se introduzca 5 en el menú.
		do {
			
			// Menu de opciones...
			System.out.println("\n---------------------\n"
							 + "1. Listado.\r\n"
							 + "2. Nuevo Alumno.\r\n"
							 + "3. Modificar.\r\n"
							 + "4. Borrar.\r\n"
							 + "5. Salir.\r\n");
			opcion = sc.nextInt();
			sc.nextLine();
			
			// Switch para hacer lo que el usuario haya indicado en cada caso.
			switch (opcion) {
			
				// Si indica 1 se va a mostrar la lista de alumnos registrados.
				case 1 -> {
					// Si la lista que se devuelve al llamar a la funcion está vacía, se informa por pantalla de ello
				    if (crud.listadoAlumnos().isEmpty()) {
				        System.err.println("❌ No hay alumnos registrados ❌");
				    } else {
				    	// si no estaba vacía pues se realiza un for-each donde se va a ir mostrando cada alumno registrado con su información (nota media)
				    	System.out.println("🗂 Listado de Alumnos 🗂");
				        for (Alumno alumno : crud.listadoAlumnos()) {
				            System.out.println("🔸 " + alumno);
				        }
				    }
				}
				
				// Si indica 2, se va a proceder con el registro de un nuevo alumno, donde se le pide un nombre y su nota media y se comprueba que sea valido.
				case 2 -> {
					System.out.println("💠 Nuevo Alumno 💠");
					System.out.print("Indica el Nombre del Alumno: ");
					nombre = sc.nextLine();
					System.out.println("Indica la nota media del Alumno: ");
					notaMedia = sc.nextDouble();
					sc.nextLine();
					/* Se imprime por consola si el proceso ha sido realizado correctamente o no lo ha sido. 
					(para que se realize correctamente, el alumno no debe existir aún en la lista).
					
					Para realizar este proceso llamamos al metodo nuevoAlumno del objeto crud y le pasamos los datos (nombre y nota media).
					*/
					System.out.println(crud.nuevoAlumno(nombre, notaMedia) ? "✅ Se ha creado Correctamente ✅" : "❌ No se ha creado correctamente ❌") ;
				}
				
				// Si indica 3, se va a proceder a la modificación de algún alumno (se modifica unicamente la nota media)
				case 3 -> {
					System.out.println("Modifica Alumno");
					// Primero se le pide al usuario el nombre del alumno a modificar donde se comprueba si este existe en la lista llamando a buscaAlumno.
					System.out.print("Indica el Nombre del Alumno: ");
					nombre = sc.nextLine();
					estado = crud.buscaAlumno(nombre);
					// Si existe, procedemos a pedir la nueva nota a actualizar a dicho alumno, en caso de que no exista se informa por pantalla.
					if(estado) {
						System.out.println("Indica la nueva nota media del Alumno: ");
						notaMedia = sc.nextDouble();
						sc.nextLine();
						/* Para modificar la nota llamamos al metodo modificaAlumno, este devolvera true (si se ha modificado Correctamente) 
						 * y false (si no se ha modificado correctamente) 
						 * 
						 * Según lo que nos devuelva informamos al usuario en cada caso.
						 * 
						 * Devolvera false en caso de que la nota introducida no sea valida (menor que 0 o mayor que 10).
						 * */
						System.out.println(crud.modificaAlumno(nombre, notaMedia) ? "✅ Nota Actualizada Correctamente ✅" : "❌ Nota introducida no valida ❌");
					} else {
						System.err.println("El alumno " + nombre + " no existe.");
					}
				}
				
				// Si indica 4, se va a proceder a borrar un alumno de la lista.
				case 4 -> {
					System.out.println("Borrar Alumno");
					// Se le pide al usuario el nombre del alumno a borrar.
					System.out.print("Indica el Nombre del Alumno: ");
					nombre = sc.nextLine();
					/* Llamamos al metodo borraAlumno y le pasamos el nombre, e informamos en pantalla segun si se ha podido borrar correctamente 
					 * o no se ha podido borrar correctamente. 
					 * 
					 * El alumno indicado debe existir para que éste se borre correctamente.
					 * */
					System.out.println(crud.borraAlumno(nombre) ? "✅ Alumno Eliminado Correctamente ✅" : "❌ El alumno " + nombre + " no existe. ❌");
				}
				
				// Si indica 5, se le informa previamente que se está procediendo a salir del programa.
				case 5 -> {System.out.println("Saliendo del Programa...");}
				
				// Default por si indica una opción no valida (se informa por pantalla)
				default -> {
					System.err.println("⚠ Opción Introducida no Válida ⚠");
				}
			}
			
		}while (opcion != 5);
		
		// Informamos por pantalla que se ha finalizado el programa.
		System.err.println("⛔ Programa Cerrado ⛔");
		
		// Cierro uso de escaner.
		sc.close();
	}
}
