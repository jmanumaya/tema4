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

		System.out.println(per1);
		
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
	        
	        System.out.println(per1);
	        
	        System.out.println(per1.getNombre() + " ¿Deseas cambiar algún dato más? (si, no)");
			opcionLetra = sc.nextLine().toLowerCase();
		}

		System.out.println(per2);
		
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
	        
	        System.out.println(per1);
	        
	        System.out.println(per2.getNombre() + " ¿Deseas cambiar algún dato más? (si, no)");
			opcionLetra = sc.nextLine().toLowerCase();
		}
		
		if (per1.esMayorEdad()) {
			System.out.println(per1.getNombre() + " " + per1.getApellidos() + " con DNI " + per1.getDni() + " es menor de edad");
		} else {
			System.out.println(per1.getNombre() + " " + per1.getApellidos() + " con DNI " + per1.getDni() + " es mayor de edad");
		}
		
		if (per2.esMayorEdad()) {
			System.out.println(per2.getNombre() + " " + per2.getApellidos() + " con DNI " + per2.getDni() + " es menor de edad");
		} else {
			System.out.println(per2.getNombre() + " " + per2.getApellidos() + " con DNI " + per2.getDni() + " es mayor de edad");
		}

		System.out.println("Diferencia de edad de ambas personas: " + per1.diferenciaEdad(per2));

		sc.close();
	}

}
