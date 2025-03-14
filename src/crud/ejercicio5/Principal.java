package crud.ejercicio5;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        Crud crud = new Crud();
        
        String nacionalidad = "";
        
        String dni = "";
        
        String nombre = "";
        
        double saldo;
        
        int opcion;
        
        System.out.println("Bienvenido al Programa de Gestión de Cuentas Corrientes");
        
        do{
        	
        	System.out.println(generaMenu());
			System.out.print("Opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
        	
        	switch (opcion) {
        	
        		case 1 -> {
        			System.out.println("Lista de Cuentas"
        					+ "---------------");
        			if(crud.listarCuentas().isEmpty()) {
        				System.err.println("No hay Cuentas Creadas");
        			} else {
        				for(CuentaCorriente cc : crud.listarCuentas()) {
        					System.out.println(cc);
        					System.out.println("===============");
        				}
        			}
        		}
        		
        		case 2 -> {
        			System.out.println("Apartado: Nueva Alta.");
        			System.out.println("Introduce el DNI Correspondiente al titular: ");
        			dni = sc.next();
        			sc.next();
        			System.out.println("Introduce el nombre del titular: ");
        			nombre = sc.nextLine();
        			System.out.println("Introduce la nacionalidad de la cuenta: ");
        			nacionalidad = sc.next();
        			sc.nextLine();
        			System.out.println("Introduce un saldo inicial: ");
        			saldo = sc.nextDouble();
        			
        			CuentaCorriente cc = new CuentaCorriente(dni, nombre, saldo, nacionalidad);
        			
        			System.out.println(crud.altaCuenta(cc) ? "Alta Realizada Correctamente." : "Error: Cuenta ya Existente.");
        		}
        		
        		case 3 -> {
        			System.out.println("Apartado: Baja de Cuenta");
        			System.out.print("Introduce el DNI correspondiente a la cuenta a dar de baja: ");
        			dni = sc.next();
        			sc.nextLine();
        			CuentaCorriente cc = new CuentaCorriente(dni);
        			System.out.println(crud.bajaCuenta(cc) ? "Baja Realizada Correctamente." : "Error: DNI Indicado no Asociado a Ninguna Cuenta");
        		}
        		
        		case 4 -> {
        			System.out.println("Apartado: Modificar Algún Dato de Cuenta.");
        			System.out.println(generaMenuModifica());
        			System.out.print("Opción: ");
        			opcion = sc.nextInt();
        			
        			switch (opcion){
        			
        				case 1 -> {
        					System.out.print("Indica el DNI de la cuenta: ");
        					dni = sc.next();
        					sc.nextLine();
        					System.out.print("Indica el Nuevo Nombre: ");
        					nombre = sc.nextLine();
        					System.out.println(crud.modificaNombre(dni, nombre) ? "Nombre Modificado Correctamente" : "Ha ocurrido un Error.");
        				}
        				
        				case 2 -> {
        					System.out.print("Indica el DNI de la cuenta: ");
        					dni = sc.next();
        					sc.nextLine();
        					System.out.print("Indica la Nueva Nacionalidad: ");
        					nacionalidad = sc.nextLine();
        					System.out.println(crud.modificaNacionalidad(dni, nacionalidad) ? "Nacionalidad Modificada Correctamente" : "Ha ocurrido un Error.");
        				}
        				
        				case 3 -> {
        					System.out.println("Saliendo del Apartado Modifica Cuenta...");
        				}
        				
        				default -> {
        					System.out.println("Opción Indicada no Válida. Saliendo del Apartado Modifica Cuenta...");
        				}
        			}
        		}
        		
        		case 5 -> {
        			System.out.println("Apartado: Nuevo Saldo");
        			System.out.print("Indica el DNI de la cuenta: ");
					dni = sc.next();
					sc.nextLine();
					System.out.print("Indica el nuevo Saldo de la cuenta: ");
					saldo = sc.nextDouble();
					System.out.println(crud.nuevoSaldo(dni, saldo) ? "Saldo Modificado Correctamente" : "Ha ocurrido un Error.");
        		}
        		
        		case 6 -> {
        			System.out.println("Saliendo del Programa...");
        		}
        		
        		default -> {
        			System.out.println("Opción Indicada No Válida.");
        		}
        	
        	}
        	
        } while(opcion != 5);
        
        System.out.println("Programa Cerrado.");
    	sc.close();
    }
    
    private static String generaMenu() {
		return "================\n"
				+ " Menú Principal"
				+ "\n================\n"
				+ "1. Listado de Cuentas.\n"
				+ "2. Nueva Alta.\n"
				+ "3. Dar de Baja.\n"
				+ "4. Modificar Algún Dato de Cuenta.\n"
				+ "5. Nuevo Saldo.\n"
				+ "6. Salir."
				+ "----------------";
	}
    
    private static String generaMenuModifica() {
		return "================\n"
				+ " Menú Modifica"
				+ "\n================\n"
				+ "1. Nombre Titular.\n"
				+ "2. Nacionalidad.\n"
				+ "3. Salir."
				+ "----------------";
	}
}