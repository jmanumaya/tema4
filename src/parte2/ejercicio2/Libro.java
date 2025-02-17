package parte2.ejercicio2;

/**
 * La clase Libro representa un libro con atributos como título, autor,
 * número de ejemplares disponibles y prestados, y el género literario.
 */
public class Libro {

    /**
     * Enumeración de los distintos géneros que puede tener un libro.
     */
    private enum Genero {
        NARRATIVO, LÍRICO, DRAMÁTICO, DIDÁCTICO, POÉTICO, SIN_ASIGNAR
    }

    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;
    private Genero genero;

    /**
     * Constructor que permite crear un libro con título y autor, dejando el género sin asignar.
     * @param titulo Título del libro.
     * @param autor Autor del libro.
     */
    public Libro(String titulo, String autor) {
        this.titulo = compruebaTitulo(titulo);
        this.autor = compruebaAutor(autor);
        this.genero = Genero.SIN_ASIGNAR;
    }

    /**
     * Constructor que permite crear un libro con título, autor y cantidad de ejemplares.
     * @param titulo Título del libro.
     * @param autor Autor del libro.
     * @param numEjemplares Número total de ejemplares.
     * @param numEjemplaresPrestados Número de ejemplares actualmente prestados.
     */
    public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
        this.titulo = compruebaTitulo(titulo);
        this.autor = compruebaAutor(autor);
        this.numEjemplares = Math.max(numEjemplares, 0);
        this.numEjemplaresPrestados = Math.min(numEjemplaresPrestados, this.numEjemplares);
        this.genero = Genero.SIN_ASIGNAR;
    }

    /**
     * Constructor que permite crear un libro con título, autor, cantidad de ejemplares y género.
     * @param titulo Título del libro.
     * @param autor Autor del libro.
     * @param numEjemplares Número total de ejemplares.
     * @param numEjemplaresPrestados Número de ejemplares actualmente prestados.
     * @param genero Género del libro.
     */
    public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String genero) {
        this.titulo = compruebaTitulo(titulo);
        this.autor = compruebaAutor(autor);
        this.numEjemplares = Math.max(numEjemplares, 0);
        this.numEjemplaresPrestados = Math.min(numEjemplaresPrestados, this.numEjemplares);
        this.genero = asignaGenero(genero);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = compruebaTitulo(titulo);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = compruebaAutor(autor);
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        if (numEjemplares >= numEjemplaresPrestados) {
            this.numEjemplares = numEjemplares;
        }
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        if (numEjemplaresPrestados <= numEjemplares) {
            this.numEjemplaresPrestados = numEjemplaresPrestados;
        }
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = asignaGenero(genero);
    }

    /**
     * Método privado para validar el nombre del autor.
     * @param autor Nombre del autor a validar.
     * @return Autor validado.
     * @throws IllegalArgumentException Si el nombre del autor no es válido.
     */
    private String compruebaAutor(String autor) {
        if (autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("Autor introducido no válido");
        }
        return autor;
    }

    /**
     * Método privado para validar el título del libro.
     * @param titulo Título del libro a validar.
     * @return Título validado.
     * @throws IllegalArgumentException Si el título no es válido.
     */
    private String compruebaTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("Título introducido no válido");
        }
        return titulo;
    }

    /**
     * Método privado para asignar el género a un libro.
     * @param genero Nombre del género.
     * @return Género asignado.
     */
    private Genero asignaGenero(String genero) {
        Genero generoAsignado = Genero.SIN_ASIGNAR;
        try {
            generoAsignado = Genero.valueOf(genero.toUpperCase());
        } catch (IllegalArgumentException e) {
            // Se mantiene SIN_ASIGNAR
        }
        return generoAsignado;
    }

    /**
     * Método que permite prestar un ejemplar si hay disponibilidad.
     * @return true si se ha podido prestar el libro, false en caso contrario.
     */
    public boolean prestamo() {
        if (numEjemplaresPrestados < numEjemplares) {
            numEjemplaresPrestados++;
            return true;
        }
        return false;
    }

    /**
     * Método que permite devolver un ejemplar prestado.
     * @return true si se ha realizado la devolución, false en caso contrario.
     */
    public boolean devolucion() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Libro{ " +
                "Titulo='" + this.titulo + '\'' +
                ", Autor='" + this.autor + '\'' +
                ", Genero='" + this.genero + '\'' +
                ", Ejemplares Disponibles=" + (this.numEjemplares - this.numEjemplaresPrestados) +
                ", Ejemplares Prestados=" + this.numEjemplaresPrestados +
                " }";
    }

    @Override
    public boolean equals(Object ObjLibro) {

    	Libro libro = (Libro) ObjLibro;

        return this.titulo.equalsIgnoreCase(libro.titulo) && this.autor.equalsIgnoreCase(libro.autor);
    }
}

