package parte1.ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Persona per1 = new Persona();
		Persona per2 = new Persona();
		

		System.out.println("Introduce tu nombre: ");
		per1.nombre = sc.nextLine();
		System.out.println("Introduce tus apellidos: ");
		per1.apellidos = sc.nextLine();
		System.out.println("Introduce tu DNI: ");
		per1.dni = sc.next();
		System.out.println("Introduce tu edad: ");
		per1.edad = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce tu nombre: ");
		per2.nombre = sc.nextLine();
		System.out.println("Introduce tus apellidos: ");
		per2.apellidos = sc.nextLine();
		System.out.println("Introduce tu DNI: ");
		per2.dni = sc.next();
		System.out.println("Introduce tu edad: ");
		per2.edad = sc.nextInt();
		sc.nextLine();
		
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


	}

}
