package parte1.ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Persona per1 = new Persona("12345678K", "Jose Manuel", "Maya Hidalgo", 19);
		Persona per2 = new Persona("87654321P", "Julián", "lorente Marroco", 18);
		
		String nombre = "";
		String apellido = "";
		int edad;
		
		String opcionLetra = "";
		int opcionNumber;
		int turno = 1;
		
		pintarDatos(per1, per2, turno);
		
		System.out.println("Hola " + per1.getNombre() + " ¿Deseas Cambiar alguno de tus datos? (si, no)");
		opcionLetra = sc.nextLine().toLowerCase();
		
		while (opcionLetra.equals("si")) {
		
			System.out.println("\n--- ¿Que dato quieres cambiar? ---");
	        System.out.println("1. Nombre");
	        System.out.println("2. Apellidos");
	        System.out.println("3. Edad");
	        System.out.print("Selecciona una opción: ");
	        opcionNumber = sc.nextInt();
	        sc.nextLine();
	        
	        switch (opcionNumber) {
	        	
	            case 1 -> {
	        		System.out.println("Introduce tu nombre: ");
					nombre = sc.nextLine();
					per1.setNombre(nombre);
	            }
	            case 2 -> {
	    			System.out.println("Introduce tus apellidos: ");
					apellido = sc.nextLine();
					per1.setApellidos(apellido);
				}
	            
	            case 3 -> {
	            	System.out.println("Introduce tu edad: ");
					edad = sc.nextInt();
					sc.nextLine();
					per1.setEdad(edad);
	            }
	
	            default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
	        }
	        
	        pintarDatos(per1, per2, turno);
	        
	        System.out.println(per1.getNombre() + " ¿Deseas cambiar algún dato más? (si, no)");
			opcionLetra = sc.nextLine().toLowerCase();
		}
		
		++turno;
		
		pintarDatos(per1, per2, turno);
		
		System.out.println("Hola " + per2.getNombre() + " ¿Deseas Cambiar alguno de tus datos? (si, no)");
		opcionLetra = sc.nextLine().toLowerCase();
		
		while (opcionLetra.equals("si")) {
			
			System.out.println("\n--- ¿Que dato quieres cambiar? ---");
	        System.out.println("1. Nombre");
	        System.out.println("2. Apellidos");
	        System.out.println("3. Edad");
	        System.out.print("Selecciona una opción: ");
	        opcionNumber = sc.nextInt();
	        sc.nextLine();
	        
	        switch (opcionNumber) {
	        	
	            case 1 -> {
	        		System.out.println("Introduce tu nombre: ");
					nombre = sc.nextLine();
					per2.setNombre(nombre);
	            }
	            case 2 -> {
	    			System.out.println("Introduce tus apellidos: ");
					apellido = sc.nextLine();
					per2.setApellidos(apellido);
				}
	            
	            case 3 -> {
	            	System.out.println("Introduce tu edad: ");
					edad = sc.nextInt();
					sc.nextLine();
					per2.setEdad(edad);
	            }
	
	            default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
	        }
	        
	        pintarDatos(per1, per2, turno);
	        
	        System.out.println(per2.getNombre() + " ¿Deseas cambiar algún dato más? (si, no)");
			opcionLetra = sc.nextLine().toLowerCase();
		}
		
		if (per1.getEdad() < 18) {
			System.out.println(per1.getNombre() + " " + per1.getApellidos() + " con DNI " + per1.getDni() + " es menor de edad");
		} else {
			System.out.println(per1.getNombre() + " " + per1.getApellidos() + " con DNI " + per1.getDni() + " es mayor de edad");
		}
		
		if (per2.getEdad() < 18) {
			System.out.println(per2.getNombre() + " " + per2.getApellidos() + " con DNI " + per2.getDni() + " es menor de edad");
		} else {
			System.out.println(per2.getNombre() + " " + per2.getApellidos() + " con DNI " + per2.getDni() + " es mayor de edad");
		}

		sc.close();
	}
	
	private static void pintarDatos(Persona per1, Persona per2, int turno) {
		
		if (turno == 1) {
			System.out.println("--- Datos de " + per1.getNombre() + " ---");
			System.out.println("Nombre: " + per1.getNombre());
			System.out.println("Apellidos: " + per1.getApellidos());
			System.out.println("Edad: " + per1.getEdad());
			System.out.println("DNI: " + per1.getDni());
		} else {
			System.out.println("--- Datos de " + per2.getNombre() + " ---");
			System.out.println("Nombre: " + per2.getNombre());
			System.out.println("Apellidos: " + per2.getApellidos());
			System.out.println("Edad: " + per2.getEdad());
			System.out.println("DNI: " + per2.getDni());
		}
	}

}
