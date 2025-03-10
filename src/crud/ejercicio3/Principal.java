package crud.ejercicio3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        Crud crud = new Crud();
        
        String opcion = "";
        
        int codigo = 1;
        
        String tamano = "";
        
        String tipo = "";

        do {
            System.out.println("\n======================\n"
                    + "    MENÚ DE OPCIONES\n"
                    + "======================\n"
                    + "A. Listado.\r\n"
                    + "B. Nuevo Pedido.\r\n"
                    + "C. Pizza Servida.\r\n"
                    + "D. Salir.\r\n"
                    + "----------------------\n");
            System.out.print("Opción: ");
            opcion = sc.next().toUpperCase();
            sc.nextLine();

            switch (opcion) {
                case "A":
                    if (crud.listadoPizzas().isEmpty()) {
                        System.err.println("❌ No hay pizzas registradas ❌");
                    } else {
                        System.out.println("\n===========================");
                        System.out.println(" Listado de Pizzas ");
                        System.out.println("===========================");
                        for (Pizza pizza : crud.listadoPizzas()) {
                            System.out.println(" " + pizza);
                            System.out.println("---------------------");
                        }
                    }
                    break;
                case "B":
                        System.out.println("Nuevo Pedido");
                        System.out.print("Elige Tamaño (MEDIANA - FAMILIAR): ");
                        tamano = sc.next();
                        sc.nextLine();
                        System.out.print("Elige Tipo (MARGARITA, CUATROQUESOS, FUNGHI): ");
                        tipo = sc.next();
                        sc.nextLine();
                        
                        Pizza p = new Pizza(codigo, tamano, tipo);

                        if (crud.nuevoPedido(p)) {
                            codigo++;
                            System.out.println("Pedido Registrado Correctamente");
                        } else {
                            System.err.println("Error: Revisa que el Tamaño y Tipo Elegido se Correspondan con los Indicados.");
                        }   
                    break;
                    
                case "C":
                    System.out.print("Introduce el código de la pizza servida: ");
                    int codigoServido = sc.nextInt();
                    if (crud.pizzaServida(codigoServido)) {
                        System.out.println("Pizza servida correctamente.");
                    } else {
                        System.err.println("No se encontró ninguna pizza con ese código.");
                    }
                    break;
                    
                case "D":
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.err.println("Opción no válida.");
            }
        } while (!opcion.equals("D"));
        
        sc.close();
    }
}