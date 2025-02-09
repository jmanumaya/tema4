package parte1.ejercicio4;

/**
 * Representa un artículo con nombre, precio, IVA y stock disponible.
 */
public class Articulo {
    
    private String nombre;
    private double precio;
    private final int IVA = 21;
    private int cuantosQuedan;
    
    /**
     * Constructor de la clase Articulo.
     * @param nombre Nombre del artículo.
     * @param precio Precio base del artículo sin IVA.
     * @param cuantosQuedan Cantidad disponible en stock.
     */
    public Articulo(String nombre, double precio, int cuantosQuedan) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        } else {
            this.nombre = "Artículo sin nombre";
        }

        if (precio > 0) {
            this.precio = precio;
        } else {
            this.precio = 1.0; // Precio mínimo por defecto
        }

        if (cuantosQuedan >= 0) {
            this.cuantosQuedan = cuantosQuedan;
        } else {
            this.cuantosQuedan = 0; // Stock mínimo por defecto
        }
    }
    
    /**
     * Obtiene el nombre del artículo.
     * @return Nombre del artículo.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Obtiene el precio base del artículo (sin IVA).
     * @return Precio base del artículo.
     */
    public double getPrecio() {
        return precio;
    }
    
    /**
     * Obtiene el porcentaje de IVA aplicado al artículo.
     * @return IVA aplicado (21%).
     */
    public int getIVA() {
        return IVA;
    }
    
    /**
     * Obtiene la cantidad de unidades disponibles en stock.
     * @return Cantidad disponible.
     */
    public int getCuantosQuedan() {
        return cuantosQuedan;
    }
    
    /**
     * Modifica el nombre del artículo.
     * @param nombre Nuevo nombre del artículo.
     */
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        }
    }
    
    /**
     * Modifica el precio base del artículo.
     * @param precio Nuevo precio base (sin IVA).
     */
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }
    }
    
    /**
     * Modifica la cantidad de stock disponible.
     * @param cuantosQuedan Nueva cantidad en stock.
     */
    public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan >= 0) {
            this.cuantosQuedan = cuantosQuedan;
        }
    }
    
    /**
     * Calcula el Precio de Venta al Público (PVP) con IVA incluido.
     * @return Precio con IVA aplicado.
     */
    public double getPVP() {
        return precio * (1 + IVA / 100.0);
    }
    
    /**
     * Calcula el PVP aplicando un descuento sobre el precio con IVA.
     * @param descuento Porcentaje de descuento (0-100).
     * @return PVP con el descuento aplicado.
     */
    public double getPVPDescuento(double descuento) {
        if (descuento < 0) {
            descuento = 0;
        } else if (descuento > 100) {
            descuento = 100;
        }
        return getPVP() * (1 - descuento / 100.0);
    }
    
    /**
     * Vende una cantidad de artículos si hay suficiente stock.
     * @param cantidad Cantidad a vender.
     * @return true si la venta se realizó con éxito, false si no hay suficiente stock.
     */
    public boolean vender(int cantidad) {
        if (cantidad > 0 && cantidad <= cuantosQuedan) {
            cuantosQuedan -= cantidad;
            return true;
        }
        return false;
    }
    
    /**
     * Almacena una cantidad adicional de artículos en stock.
     * @param cantidad Cantidad a agregar al stock.
     */
    public void almacenar(int cantidad) {
        if (cantidad > 0) {
            cuantosQuedan += cantidad;
        }
    }
    
    /**
     * Devuelve una representación en texto del artículo con su información.
     * @return Cadena con los datos del artículo.
     */
    @Override
    public String toString() {
        return "Artículo: " + nombre + "\n" +
               "Precio base: " + precio + "€\n" +
               "IVA: " + IVA + "%\n" +
               "PVP: " + String.format("%.2f", getPVP()) + "€\n" +
               "Stock: " + cuantosQuedan + " unidades";
    }
}
