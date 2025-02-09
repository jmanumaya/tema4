package parte1.ejercicio3;

/**
 * La clase Rectangulo representa un rectángulo en un plano cartesiano, 
 * definido por dos puntos opuestos (x1, y1) y (x2, y2).
 */
public class Rectangulo {
    // Atributos privados
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    /**
     * Constructor de la clase Rectangulo.
     * @param x1 Coordenada X del primer punto.
     * @param y1 Coordenada Y del primer punto.
     * @param x2 Coordenada X del segundo punto.
     * @param y2 Coordenada Y del segundo punto.
     */
    public Rectangulo(int x1, int y1, int x2, int y2) {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
    }

    // Getters y Setters

    /**
     * Obtiene la coordenada X del primer punto.
     * @return Valor de x1.
     */
    public int getX1() {
        return x1;
    }

    /**
     * Establece la coordenada X del primer punto si es menor que x2.
     * @param x1 Nueva coordenada X del primer punto.
     */
    public void setX1(int x1) {
        if (x1 < x2) {
            this.x1 = x1;
        }
    }

    /**
     * Obtiene la coordenada Y del primer punto.
     * @return Valor de y1.
     */
    public int getY1() {
        return y1;
    }

    /**
     * Establece la coordenada Y del primer punto si es menor que y2.
     * @param y1 Nueva coordenada Y del primer punto.
     */
    public void setY1(int y1) {
        if (y1 < y2) {
            this.y1 = y1;
        }
    }

    /**
     * Obtiene la coordenada X del segundo punto.
     * @return Valor de x2.
     */
    public int getX2() {
        return x2;
    }

    /**
     * Establece la coordenada X del segundo punto si es mayor que x1.
     * @param x2 Nueva coordenada X del segundo punto.
     */
    public void setX2(int x2) {
        if (x1 < x2) {
            this.x2 = x2;
        }
    }

    /**
     * Obtiene la coordenada Y del segundo punto.
     * @return Valor de y2.
     */
    public int getY2() {
        return y2;
    }

    /**
     * Establece la coordenada Y del segundo punto si es mayor que y1.
     * @param y2 Nueva coordenada Y del segundo punto.
     */
    public void setY2(int y2) {
        if (y1 < y2) {
            this.y2 = y2;
        }
    }

    /**
     * Calcula y devuelve el área del rectángulo.
     * @return Área del rectángulo.
     */
    public int getArea() {
        int ancho = Math.abs(x2 - x1);  // Ancho = diferencia en x
        int alto = Math.abs(y2 - y1);   // Alto = diferencia en y
        return ancho * alto;
    }

    /**
     * Calcula y devuelve el perímetro del rectángulo.
     * @return Perímetro del rectángulo.
     */
    public int getPerimetro() {
        int ancho = Math.abs(x2 - x1);
        int alto = Math.abs(y2 - y1);
        return 2 * (ancho + alto);  // Perímetro = 2 * (ancho + alto)
    }

    /**
     * Muestra las coordenadas actuales del rectángulo en la consola.
     */
    public void mostrarCoordenadas() {
        System.out.println("Coordenadas: (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")");
    }

    /**
     * Modifica las coordenadas x1 e y1 si los valores son menores que x2 e y2 respectivamente.
     * @param x1 Nueva coordenada X del primer punto.
     * @param y1 Nueva coordenada Y del primer punto.
     */
    public void setX1Y1(int x1, int y1) {
        if (y1 < y2 && x1 < x2) {
            this.y1 = y1;
            this.x1 = x1;
        }
    }

    /**
     * Modifica las coordenadas x2 e y2 si los valores son mayores que x1 e y1 respectivamente.
     * @param x2 Nueva coordenada X del segundo punto.
     * @param y2 Nueva coordenada Y del segundo punto.
     */
    public void setX2Y2(int x2, int y2) {
        if (y1 > y2 && x1 > x2) {
            this.y2 = y2;
            this.x2 = x2;
        }
    }

    /**
     * Modifica todas las coordenadas del rectángulo si se cumplen las condiciones de orden.
     * @param x1 Nueva coordenada X del primer punto.
     * @param y1 Nueva coordenada Y del primer punto.
     * @param x2 Nueva coordenada X del segundo punto.
     * @param y2 Nueva coordenada Y del segundo punto.
     */
    public void setAll(int x1, int y1, int x2, int y2) {
        if (y1 < y2 && x1 < x2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    /**
     * Devuelve una representación en cadena del rectángulo con sus coordenadas.
     * @return Cadena con la información del rectángulo.
     */
    @Override
    public String toString() {
        return "x1 = " + x1 + ", y1 = " + y1 + ", x2 = " + x2 + ", y2 = " + y2;
    }
}
