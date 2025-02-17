package parte2.ejercicio3;

/**
 * Clase Alumno que almacena el nombre y la nota media de un estudiante.
 */
public class Alumno {
    
    private String nombre;
    private double notaMedia;

    /**
     * Constructor de la clase Alumno.
     * @param nombre Nombre del alumno.
     * @param notaMedia Nota media del alumno.
     */
    public Alumno(String nombre, double notaMedia) {
        this.nombre = (nombre != null && !nombre.isBlank()) ? nombre : "Sin nombre";
        this.notaMedia = (notaMedia >= 0 && notaMedia <= 10) ? notaMedia : 0;
    }

    /**
     * Obtiene el nombre del alumno.
     * @return Nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del alumno.
     * @param nombre Nuevo nombre del alumno.
     */
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        }
    }

    /**
     * Obtiene la nota media del alumno.
     * @return Nota media del alumno.
     */
    public double getNotaMedia() {
        return notaMedia;
    }

    /**
     * Modifica la nota media del alumno.
     * @param notaMedia Nueva nota media del alumno.
     */
    public void setNotaMedia(double notaMedia) {
        if (notaMedia >= 0 && notaMedia <= 10) {
            this.notaMedia = notaMedia;
        }
    }

    /**
     * Devuelve una cadena con el nombre del alumno y su nota media.
     * @return Representación en cadena del alumno.
     */
    @Override
    public String toString() {
        return nombre + " " + notaMedia;
    }

    /**
     * Compara dos objetos Alumno basándose en el nombre.
     * @param obj Objeto a comparar.
     * @return true si los alumnos tienen el mismo nombre, false en caso contrario.
     */
    @Override
    public boolean equals(Object alum2) {
    	
        Alumno otroAlumno = (Alumno) alum2;
        
        return this.nombre.equalsIgnoreCase(otroAlumno.nombre);
    }
}

