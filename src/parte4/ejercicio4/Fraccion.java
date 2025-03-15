package parte4.ejercicio4;

/**
 * La clase {@code Fraccion} representa una fracción con numerador y denominador.
 * Permite realizar operaciones aritméticas con fracciones y simplificarlas.
 */
public class Fraccion {

    private int numerador;
    private int denominador;

    /**
     * Constructor de la clase Fraccion.
     *
     * @param numerador   El numerador de la fracción.
     * @param denominador El denominador de la fracción.
     * @throws IllegalArgumentException Si el denominador es cero.
     */
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * Constructor de la clase Fraccion.
     * Crea una fracción con el numerador dado y denominador 1.
     *
     * @param numerador El numerador de la fracción.
     */
    public Fraccion(int numerador) {
        this(numerador, 1);
    }

    /**
     * Constructor por defecto de la clase Fraccion.
     * Crea una fracción 0/1.
     */
    public Fraccion() {
        this(0, 1);
    }

    /**
     * Obtiene el numerador de la fracción.
     *
     * @return El numerador de la fracción.
     */
    public int getNumerador() {
        return numerador;
    }

    /**
     * Establece el numerador de la fracción.
     *
     * @param numerador El nuevo numerador de la fracción.
     */
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    /**
     * Obtiene el denominador de la fracción.
     *
     * @return El denominador de la fracción.
     */
    public int getDenominador() {
        return denominador;
    }

    /**
     * Establece el denominador de la fracción.
     *
     * @param denominador El nuevo denominador de la fracción.
     * @throws IllegalArgumentException Si el denominador es cero.
     */
    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.denominador = denominador;
    }

    /**
     * Suma la fracción actual con otra fracción.
     *
     * @param otra La fracción a sumar.
     * @return Una nueva fracción que representa la suma.
     */
    public Fraccion suma(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.denominador + otra.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otra.denominador;
        Fraccion resultado = new Fraccion(nuevoNumerador, nuevoDenominador);
        resultado.simplifica();
        return resultado;
    }

    /**
     * Resta otra fracción de la fracción actual.
     *
     * @param otra La fracción a restar.
     * @return Una nueva fracción que representa la resta.
     */
    public Fraccion resta(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.denominador - otra.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otra.denominador;
        Fraccion resultado = new Fraccion(nuevoNumerador, nuevoDenominador);
        resultado.simplifica();
        return resultado;
    }

    /**
     * Multiplica la fracción actual por otra fracción.
     *
     * @param otra La fracción a multiplicar.
     * @return Una nueva fracción que representa la multiplicación.
     */
    public Fraccion multiplica(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.numerador;
        int nuevoDenominador = this.denominador * otra.denominador;
        Fraccion resultado = new Fraccion(nuevoNumerador, nuevoDenominador);
        resultado.simplifica();
        return resultado;
    }

    /**
     * Divide la fracción actual por otra fracción.
     *
     * @param otra La fracción por la cual dividir.
     * @return Una nueva fracción que representa la división.
     * @throws ArithmeticException Si la fracción pasada tiene numerador cero.
     */
    public Fraccion divide(Fraccion otra) {
        if (otra.numerador == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        int nuevoNumerador = this.numerador * otra.denominador;
        int nuevoDenominador = this.denominador * otra.numerador;
        Fraccion resultado = new Fraccion(nuevoNumerador, nuevoDenominador);
        resultado.simplifica();
        return resultado;
    }

    /**
     * Simplifica la fracción actual dividiendo numerador y denominador por su MCD.
     */
    public void simplifica() {
        int mcd = mcd(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
    }

    /**
     * Calcula el máximo común divisor de dos números.
     *
     * @param a El primer número.
     * @param b El segundo número.
     * @return El máximo común divisor de a y b.
     */
    private int mcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Devuelve una representación en cadena de la fracción en formato "numerador/denominador".
     *
     * @return Una cadena que representa la fracción.
     */
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}