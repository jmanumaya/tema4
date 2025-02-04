package parte1.ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Persona per1;
		Persona per2;
		
		String nombre = "";
		String apellido = "";
		String dni = "";
		int edad;

		System.out.println("Introduce tu nombre: ");
		nombre = sc.nextLine();
		System.out.println("Introduce tus apellidos: ");
		apellido = sc.nextLine();
		System.out.println("Introduce tu DNI: ");
		dni = sc.next();
		System.out.println("Introduce tu edad: ");
		edad = sc.nextInt();
		sc.nextLine();
		
		per1 = new Persona(dni, nombre, apellido, edad);
		
		System.out.println("Introduce tu nombre: ");
		nombre = sc.nextLine();
		System.out.println("Introduce tus apellidos: ");
		apellido = sc.nextLine();
		System.out.println("Introduce tu DNI: ");
		dni = sc.next();
		System.out.println("Introduce tu edad: ");
		edad = sc.nextInt();
		sc.nextLine();
		
		per2 = new Persona(dni, nombre, apellido, edad);
		
		if (per1.edad < 18) {
			System.out.println(per1.nombre + " " + per1.apellidos + " con DNI " + per1.dni + " es menor de edad");
		} else {
			System.out.println(per1.nombre + " " + per1.apellidos + " con DNI " + per1.dni + " es mayor de edad");
		}
		
		if (per2.edad < 18) {
			System.out.println(per2.nombre + " " + per2.apellidos + " con DNI " + per2.dni + " es menor de edad");
		} else {
			System.out.println(per2.nombre + " " + per2.apellidos + " con DNI " + per2.dni + " es mayor de edad");
		}

		sc.close();
	}

}
