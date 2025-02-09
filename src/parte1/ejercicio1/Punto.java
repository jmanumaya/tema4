package parte1.ejercicio1;

/**
 * La clase Punto representa un punto en un sistema de coordenadas cartesianas (x, y).
 */
public class Punto {

    private int x;
    private int y;

    /**
     * Constructor de la clase Punto.
     * @param x Coordenada X del punto.
     * @param y Coordenada Y del punto.
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Obtiene la coordenada X del punto.
     * @return Coordenada X.
     */
    public int getX() {
        return x;
    }

    /**
     * Obtiene la coordenada Y del punto.
     * @return Coordenada Y.
     */
    public int getY() {
        return y;
    }

    /**
     * Establece un nuevo valor para la coordenada X.
     * @param x Nueva coordenada X.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Establece un nuevo valor para la coordenada Y.
     * @param y Nueva coordenada Y.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Modifica ambas coordenadas del punto.
     * @param x Nueva coordenada X.
     * @param y Nueva coordenada Y.
     */
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Desplaza el punto en el plano sumando valores a sus coordenadas.
     * @param dx Cantidad a sumar a la coordenada X.
     * @param dy Cantidad a sumar a la coordenada Y.
     */
    public void desplaza(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Calcula la distancia entre el punto actual y otro punto dado.
     * @param p Otro punto con el que calcular la distancia.
     * @return Distancia euclidiana entre los dos puntos.
     */
    public double distancia(Punto p) {
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }

    /**
     * Representa el punto como una cadena de texto en formato (x, y).
     * @return Cadena con la representación del punto.
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
