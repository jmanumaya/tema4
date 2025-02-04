package parte1.ejercicio3;

public class Rectangulo {
    // Atributos
    int x1;
    int y1;
    int x2;
    int y2;

    // Constructor
    public Rectangulo(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Método para calcular el área
    public int area() {
        int ancho = Math.abs(x2 - x1);  // Ancho = diferencia en x
        int alto = Math.abs(y2 - y1);   // Alto = diferencia en y
        return ancho * alto;
    }

    // Método para calcular el perímetro
    public int perimetro() {
        int ancho = Math.abs(x2 - x1);
        int alto = Math.abs(y2 - y1);
        return 2 * (ancho + alto);  // Perímetro = 2 * (ancho + alto)
    }

    // Método para mostrar las coordenadas
    public void mostrarCoordenadas() {
        System.out.println("Coordenadas: (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")");
    }
}
