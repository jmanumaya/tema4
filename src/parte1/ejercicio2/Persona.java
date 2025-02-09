package parte1.ejercicio2;

/**
 * La clase Persona representa a una persona con atributos básicos como DNI, nombre, apellidos y edad.
 */
public class Persona {

    private final String DNI;
    private String nombre;
    private String apellidos;
    private int edad;

    /**
     * Constructor de la clase Persona.
     * @param dni DNI de la persona (número de identificación).
     * @param nombre Nombre de la persona.
     * @param apellidos Apellidos de la persona.
     * @param edad Edad de la persona.
     */
    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.DNI = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    /**
     * Obtiene el DNI de la persona.
     * @return DNI de la persona.
     */
    public String getDni() {
        return DNI;
    }

    /**
     * Obtiene el nombre de la persona.
     * @return Nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene los apellidos de la persona.
     * @return Apellidos de la persona.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Obtiene la edad de la persona.
     * @return Edad de la persona.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece un nuevo nombre para la persona, si no está vacío o nulo.
     * @param nombre Nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        }
    }

    /**
     * Establece nuevos apellidos para la persona, si no están vacíos o son nulos.
     * @param apellidos Nuevos apellidos de la persona.
     */
    public void setApellidos(String apellidos) {
        if (apellidos != null && !apellidos.isBlank()) {
            this.apellidos = apellidos;
        }
    }

    /**
     * Establece una nueva edad para la persona si es mayor que la actual y no es negativa.
     * @param edad Nueva edad de la persona.
     */
    public void setEdad(int edad) {
        if (edad >= 0 && edad > this.edad) {
            this.edad = edad;
        }
    }

    /**
     * Verifica si la persona es mayor de edad (más de 18 años).
     * @return true si la persona es mayor de edad, false en caso contrario.
     */
    public boolean esMayorEdad() {
        return this.edad > 18;
    }

    /**
     * Verifica si la persona está en edad de jubilación (65 años o más).
     * @return true si la persona es jubilada, false en caso contrario.
     */
    public boolean esJubilado() {
        return this.edad >= 65;
    }

    /**
     * Calcula la diferencia de edad entre la persona actual y otra persona.
     * @param p Otra persona con la que se comparará la edad.
     * @return Diferencia de edad en años.
     */
    public int diferenciaEdad(Persona p) {
        return Math.abs(this.edad - p.edad);
    }

    /**
     * Devuelve una representación en cadena de la persona con sus datos.
     * @return Cadena con la información de la persona.
     */
    @Override
    public String toString() {
        return "DNI: " + this.DNI + "\n" +
               "Nombre: " + this.nombre + "\n" +
               "Apellidos: " + this.apellidos + "\n" +
               "Edad: " + this.edad + "\n";
    }
}
