package parte1.ejercicio1;

public class Punto {

    private int x;
    private int y;

    // Constructor
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Método para modificar ambas coordenadas
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Método para desplazar el punto
    public void desplaza(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    // Método para calcular la distancia entre dos puntos
    public double distancia(Punto p) {
        // Usamos la fórmula de la distancia entre dos puntos (x1 - x2)^2 + (y1 - y2)^2
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }

    // Método toString para representar el punto como una cadena
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
