package crud.ejercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Crud crud = new Crud();
		
		int codigo = 1;
		
		int codigoAux;
		
		String autor = "";
		
		String titulo = "";
		
		String genero = "";
		
		int duracion;
		
		int opcion;
		
		System.out.println("Bienvenido al Gestor de Discos");
		
		do {
			
			System.out.println(generaMenu());
			System.out.print("Opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch(opcion) {
			
				case 1 -> {
					System.out.println("=================\n"
							+ "Listado de Discos"
							+ "\n-----------------");
					if(!crud.listado().isEmpty()) {
						for(Disco disco : crud.listado()) {
							System.out.println(disco);
						}
					} else {
						System.err.println("No Hay Discos Almacenados");
					}
				}
			
				case 2 -> {
					try {
						System.out.println("Apartado: Nuevo Disco.");
						System.out.print("Introduce el autor del disco: ");
						autor = sc.nextLine();
						System.out.print("Introduce el genero del disco: ");
						genero = sc.next();
						sc.nextLine();
						System.out.print("Introduce el titulo del disco: ");
						titulo = sc.nextLine();
						System.out.print("Introduce la duración del disco: ");
						duracion = sc.nextInt();
						
						Disco dsc = new Disco(codigo, autor, genero, titulo, duracion);
						
						if(crud.nuevoDisco(dsc)) {
							System.out.println("Disco Creado Correctamente");
							++codigo;		
						} else {
							System.out.println("No se ha podido crear el disco.");
						}
						
					} catch (Exception e) {
						System.err.println(e);
						sc.nextLine();
					}
					
				}
				
				case 3 -> {
					System.out.println("Apartado: Borrar Disco.");
					System.out.print("Introduce el Codigo del Disco a Borrar: ");
					codigoAux = sc.nextInt();
					Disco dsc = new Disco(codigoAux);
					System.out.println(crud.borrarDisco(dsc) ? "Disco Borrado Correctamente" : "El Codigo Introducido no Corresponde a Ningún Disco");
				}
				
				case 4 -> {
					System.out.println("Saliendo del Programa...");
				}
				
				default -> {
					System.out.println("Opción Introducida no Válida.");
				}
			
			}
			
			
		} while(opcion != 4);
		
		System.out.println("Programa Cerrado.");
		sc.close();
	}
	
	private static String generaMenu() {
		return "================\n"
				+ " Menú Principal"
				+ "\n================\n"
				+ "1. Listado.\n"
				+ "2. Nuevo Disco.\n"
				+ "3. Borrar Disco.\n"
				+ "4. Salir.\n"
				+ "----------------";
	}

}
