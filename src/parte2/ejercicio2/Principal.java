package parte2.ejercicio2;

public class Principal {
    public static void main(String[] args) {
        // Prueba del constructor con título y autor
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        System.out.println(libro1);

        // Prueba del constructor con título, autor y ejemplares
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 10, 2);
        System.out.println(libro2);

        // Prueba del constructor con título, autor, ejemplares y género
        Libro libro3 = new Libro("Hamlet", "William Shakespeare", 5, 1, "DRAMATICO");
        System.out.println(libro3);

        // Prueba de setters
        libro1.setNumEjemplares(7);
        libro1.setNumEjemplaresPrestados(3);
        libro1.setGenero("DIDÁCTICO");

        System.out.println("\nLibro 1 actualizado:");
        System.out.println(libro1);

        // Prueba de préstamo
        System.out.println("\nIntentando prestar un ejemplar de 'Don Quijote de la Mancha'...");
        if (libro2.prestamo()) {
            System.out.println("Préstamo exitoso. Estado actual:");
        } else {
            System.out.println("No se pudo realizar el préstamo.");
        }
        System.out.println(libro2);

        // Prueba de devolución
        System.out.println("\nIntentando devolver un ejemplar de 'Hamlet'...");
        if (libro3.devolucion()) {
            System.out.println("Devolución exitosa. Estado actual:");
        } else {
            System.out.println("No se pudo realizar la devolución.");
        }
        System.out.println(libro3);

        // Prueba de igualdad
        Libro libro4 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        System.out.println("\nComparando 'Cien años de soledad' con otro libro de mismo título y autor:");
        if (libro1.equals(libro4)) {
            System.out.println("Los libros son iguales.");
        } else {
            System.out.println("Los libros son diferentes.");
        }
    }
}
