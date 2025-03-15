package parte4.ejercicio3;

/**
 * La clase {@code Fecha} representa una fecha con día, mes y año.
 * Permite crear objetos Fecha y realizar operaciones como obtener el día siguiente.
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anno;

    /**
     * Constructor de la clase Fecha.
     *
     * @param dia  El día de la fecha.
     * @param mes  El mes de la fecha.
     * @param anno El año de la fecha.
     * @throws IllegalArgumentException Si la fecha introducida no es válida.
     */
    public Fecha(int dia, int mes, int anno) {
        if (fechaCorrecta(dia, mes, anno)) {
            this.mes = mes;
            this.anno = anno;
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("La fecha introducida no es válida.");
        }
    }

    /**
     * Verifica si el año es bisiesto.
     *
     * @return {@code true} si el año es bisiesto, {@code false} en caso contrario.
     */
    private boolean esBisiesto() {
        boolean estado = false;
        if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
            estado = true;
        }
        return estado;
    }

    /**
     * Verifica si la fecha es válida.
     *
     * @param dia  El día de la fecha.
     * @param mes  El mes de la fecha.
     * @param anno El año de la fecha.
     * @return {@code true} si la fecha es válida, {@code false} en caso contrario.
     */
    private boolean fechaCorrecta(int dia, int mes, int anno) {
        boolean estado = false;
        if (mes > 0 && mes <= 12) {
            if (anno > 0) {
                switch (mes) {
                    case 1, 3, 5, 7, 8, 10, 12 -> {
                        if (dia > 0 && dia <= 31) {
                            estado = true;
                        }
                    }
                    case 2 -> {
                        if (esBisiesto()) {
                            if (dia > 0 && dia <= 29) {
                                estado = true;
                            }
                        } else {
                            if (dia > 0 && dia <= 28) {
                                estado = true;
                            }
                        }
                    }
                    case 4, 6, 9, 11 -> {
                        if (dia > 0 && dia <= 30) {
                            estado = true;
                        }
                    }
                }
            }
        }
        return estado;
    }

    /**
     * Incrementa el día en uno y ajusta el mes y el año si es necesario.
     */
    public void diaSiguiente() {
        dia++;
        if (!fechaCorrecta(dia, mes, anno)) {
            dia = 1;
            mes++;
            if (!fechaCorrecta(dia, mes, anno)) {
                mes = 1;
                anno++;
            }
        }
    }

    /**
     * Obtiene el día de la fecha.
     *
     * @return El día de la fecha.
     */
    public int getDia() {
        return dia;
    }

    /**
     * Obtiene el mes de la fecha.
     *
     * @return El mes de la fecha.
     */
    public int getMes() {
        return mes;
    }

    /**
     * Obtiene el año de la fecha.
     *
     * @return El año de la fecha.
     */
    public int getAnno() {
        return anno;
    }

    /**
     * Devuelve la fecha en formato "dd-mm-yyyy".
     *
     * @return La fecha en formato "dd-mm-yyyy".
     */
    @Override
    public String toString() {
        String fecha = "";
        if (dia < 10 && mes < 10) {
            fecha += "0" + dia + "-" + "0" + mes + "-" + anno;
        } else if (dia < 10) {
            fecha += "0" + dia + "-" + mes + "-" + anno;
        } else if (mes < 10) {
            fecha += dia + "-" + "0" + mes + "-" + anno;
        } else {
            fecha += dia + "-" + mes + "-" + anno;
        }
        return fecha;
    }
}