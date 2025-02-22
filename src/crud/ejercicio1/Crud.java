package crud.ejercicio1;

import java.util.ArrayList;

/**
 * Clase Crud que gestiona una lista de alumnos.
 * Permite realizar operaciones CRUD: crear, leer, actualizar y eliminar alumnos.
 */
public class Crud {
    
    /** Lista que almacena los alumnos registrados. */
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    /**
     * Obtiene el listado completo de alumnos.
     *
     * @return Una lista de todos los alumnos registrados.
     */
    public ArrayList<Alumno> listadoAlumnos() {
        return alumnos;
    }

    /**
     * Crea un nuevo alumno y lo añade a la lista si no existe previamente.
     *
     * @param nombre Nombre del alumno.
     * @param notaMedia Nota media del alumno (debe estar entre 0 y 10).
     * @return true si el alumno fue añadido correctamente, false si ya existía o los datos no son válidos.
     */
    public boolean nuevoAlumno(String nombre, double notaMedia) {
        boolean estado = false;

        if (nombre != null && !nombre.isEmpty() && notaMedia >= 0 && notaMedia <= 10) {
            // Verifica si ya existe un alumno con el mismo nombre.
            boolean existe = false;
            for (Alumno a : alumnos) {
                if (a.getNombre().equalsIgnoreCase(nombre)) {
                    existe = true;
                    break; // ¡¡¡¡¡¡Preguntar si permitía break en for-each!!!!!!
                }
            }

            // Si no existe, se añade el nuevo alumno.
            if (!existe) {
                Alumno alum = new Alumno(nombre, notaMedia);
                alumnos.add(alum);
                estado = true;
            }
        }

        return estado;
    }

    /**
     * Busca si un alumno con el nombre indicado está registrado.
     *
     * @param nombre Nombre del alumno a buscar.
     * @return true si el alumno existe, false en caso contrario.
     */
    public boolean buscaAlumno(String nombre) {
        boolean estado = false;

        if (nombre != null && !nombre.isEmpty()) {
            for (Alumno a : alumnos) {
                if (a.getNombre().equalsIgnoreCase(nombre)) {
                    estado = true;
                    break;
                }
            }
        }
        return estado;
    }

    /**
     * Modifica la nota media de un alumno existente.
     *
     * @param nombre Nombre del alumno cuya nota se desea modificar.
     * @param notaMedia Nueva nota media (debe estar entre 0 y 10).
     * @return true si se actualizó la nota correctamente, false si el alumno no existe o la nota no es válida.
     */
    public boolean modificaAlumno(String nombre, double notaMedia) {
        boolean estado = false;

        for (Alumno a : alumnos) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                estado = a.setNotaMedia(notaMedia);
                break;
            }
        }

        return estado;
    }

    /**
     * Elimina un alumno de la lista si existe.
     *
     * @param nombre Nombre del alumno a eliminar.
     * @return true si el alumno fue eliminado correctamente, false si el alumno no existe.
     */
    public boolean borraAlumno(String nombre) {
        boolean estado = buscaAlumno(nombre);

        if (estado) {
            for (Alumno a : alumnos) {
                if (a.getNombre().equalsIgnoreCase(nombre)) {
                    alumnos.remove(a);
                    estado = true;
                    break;
                }
            }
        }

        return estado;
    }
}
