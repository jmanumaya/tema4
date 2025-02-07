package parte1.ejercicio3;

public class Rectangulo {
    // Atributos privados
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    // Constructor
    public Rectangulo(int x1, int y1, int x2, int y2) {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
    }

    // Getters y Setters
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        if (x1 < x2) {
            this.x1 = x1;
        }
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        if (y1 < y2) {
            this.y1 = y1;
        }
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        if (x1 < x2) {
            this.x2 = x2;
        }
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        if (y1 < y2) {
            this.y2 = y2;
        }
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
    
    public void setX1Y1(int x1, int y1) {
    	if (y1 < y2 && x1 < x2) {
            this.y1 = y1;
            this.x1 = x1;
        }
    }
    
    public void setX2Y2(int x2, int y2) {
    	if (y1 > y2 && x1 > x2) {
            this.y2 = y2;
            this.x2 = x2;
        }
    }
    
    public void setAll(int x1, int y1, int x2, int y2) {
    	
    	if (y1 < y2 && x1 < x2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
    	}
    	
    }
}
