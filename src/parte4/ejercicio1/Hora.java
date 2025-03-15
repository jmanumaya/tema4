package parte4.ejercicio1;

/**
 * Representa una hora del día con horas, minutos y segundos.
 */
public class Hora {
    
    /**
     * La hora (0-23).
     */
    private int hora;
    
    /**
     * Los minutos (0-59).
     */
    private int minuto;
    
    /**
     * Los segundos (0-59).
     */
    private int segundo;

    /**
     * Construye un objeto Hora con la hora, minutos y segundos especificados.
     *
     * @param hora    La hora (0-23).
     * @param minuto  Los minutos (0-59).
     * @param segundo Los segundos (0-59).
     * @throws IllegalArgumentException Si la hora, minutos o segundos no son válidos.
     */
    public Hora(int hora, int minuto, int segundo) {
        
        if(hora <= 23 && hora >= 0) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("La hora indicada no es válida");
        }
        if(minuto <= 59 && minuto >= 0) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Los minutos indicados no son validos");
        }
        if(segundo <= 59 && segundo >= 0) {
        this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Los segundos indicados no son validos");
        }
    }
    
    /**
     * Incrementa los segundos en uno, ajustando los minutos y horas si es necesario.
     */
    public void incrementaSegundo() {
        
        ++segundo;
        
        compruebaSegundos();
    }
    
    /**
     * Comprueba si los segundos exceden 59 y ajusta los minutos si es necesario.
     */
    private void compruebaSegundos() {
        
        if(segundo > 59) {
            segundo = 00;
            incrementaMinuto();
        }
    }
    
    /**
     * Incrementa los minutos en uno, ajustando las horas si es necesario.
     */
    private void incrementaMinuto() {
        
        ++minuto;
        
        compruebaMinuto();
    }

    /**
     * Comprueba si los minutos exceden 59 y ajusta las horas si es necesario.
     */
    private void compruebaMinuto() {
        
        if(minuto > 59) {
            minuto = 00;
            incrementaHora();
        }
    }

    /**
     * Incrementa las horas en uno, ajustando el día si es necesario.
     */
    private void incrementaHora() {
        
        ++hora;
        
        compruebaHora();
    }

    /**
     * Comprueba si las horas exceden 23 y ajusta el día si es necesario.
     */
    private void compruebaHora() {
        
        if(hora > 23) {
            hora = 00;
            incrementaHora();
        }
    }

    /**
     * Devuelve una representación en cadena de la hora en formato "HH : MM : SS".
     *
     * @return La representación en cadena de la hora.
     */
    @Override
    public String toString() {
        return hora + " : " + minuto + " : " + segundo;
    }
    
}