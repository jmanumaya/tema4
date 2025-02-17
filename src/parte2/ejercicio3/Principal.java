package parte2.ejercicio3;

public class Principal {

    public static void main(String[] args) {
        // Creo los alumnos con distintas notas
        Alumno alumno1 = new Alumno("Pepe Martínez Pérez", 8.5);
        Alumno alumno2 = new Alumno("Ana López García", 9.2);
        Alumno alumno3 = new Alumno("Pepe Martínez Pérez", 7.3); // Mismo nombre que alumno1
        Alumno alumno4 = new Alumno("Carlos Fernández", 10.0);
        
        // Muestro información de los alumnos
        System.out.println("Alumnos creados:");
        System.out.println(alumno1);
        System.out.println(alumno2);
        System.out.println(alumno3);
        System.out.println(alumno4);
        
        // Comparo los alumnos
        System.out.println("\n¿Alumno1 y Alumno3 son iguales? " + alumno1.equals(alumno3));
        System.out.println("¿Alumno1 y Alumno2 son iguales? " + alumno1.equals(alumno2));
        
        // Modifico la nota media de un alumno
        alumno1.setNotaMedia(9.0);
        System.out.println("\nNota de " + alumno1.getNombre() + " actualizada a: " + alumno1.getNotaMedia());
        
        // Modifico el nombre de un alumno
        alumno4.setNombre("María González");
        System.out.println("Nuevo nombre de alumno4: " + alumno4.getNombre());
        
        System.out.println();
        
        // Muestro información de los alumnos almacenadas
        System.out.println("Almacén de Alumnos:");
        System.out.println(alumno1);
        System.out.println(alumno2);
        System.out.println(alumno3);
        System.out.println(alumno4);
    }
}
