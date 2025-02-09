package parte1.ejercicio4;

import java.util.Scanner;

/**
 * Clase principal para probar la funcionalidad de la clase Articulo.
 */
public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        double precio;
        int cuantosQuedan;
        
        // Obtengo los valores para el objeto art1.
        System.out.println("Nombre del Artículo:");
        nombre = sc.nextLine();
        System.out.println("Precio del Artículo:");
        precio = sc.nextDouble();
        System.out.println("Cuántos Quedan:");
        cuantosQuedan = sc.nextInt();
        
        // Creo el objeto usando el constructor con valores iniciales
        Articulo art1 = new Articulo(nombre, precio, cuantosQuedan);
        
        // Modifico los valores con los setters
        System.out.println("\nModificando los valores...");
        sc.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Nuevo nombre:");
        art1.setNombre(sc.nextLine());
        System.out.println("Nuevo precio:");
        art1.setPrecio(sc.nextDouble());
        System.out.println("Nuevos cuantos quedan:");
        art1.setCuantosQuedan(sc.nextInt());

        // Mostro la información actualizada del artículo
        System.out.println("\nInformación del artículo:");
        System.out.println(art1);

        // Parte donde calculo y muestro el PVP
        System.out.println("\nPVP (Precio con IVA incluido): " + String.format("%.2f", art1.getPVP()) + "€");

        // Parte donde aplico el descuento
        System.out.println("\nIntroduce un porcentaje de descuento:");
        double descuento = sc.nextDouble();
        System.out.println("PVP con descuento del " + descuento + "%: " + String.format("%.2f", art1.getPVPDescuento(descuento)) + "€");

        // Parte donde introduzco la venta de artículos
        System.out.println("\nIntroduce la cantidad a vender:");
        int cantidadVender = sc.nextInt();
        if (art1.vender(cantidadVender)) {
            System.out.println("Venta realizada con éxito. Stock restante: " + art1.getCuantosQuedan());
        } else {
            System.out.println("No hay suficiente stock para vender esa cantidad.");
        }

        // Parte donde almaceno artículos
        System.out.println("\nIntroduce la cantidad a almacenar:");
        int cantidadAlmacenar = sc.nextInt();
        art1.almacenar(cantidadAlmacenar);
        System.out.println("Nueva cantidad en stock: " + art1.getCuantosQuedan());

        sc.close();
    }
}
