package crud.ejercicio5;

import java.util.HashSet;

/**
 * Esta clase representa un sistema CRUD (Crear, Leer, Actualizar, Borrar) para gestionar cuentas corrientes.
 */
public class Crud {

    private HashSet<CuentaCorriente> listado = new HashSet<>();

    /**
     * Lista todas las cuentas corrientes almacenadas.
     *
     * @return Un HashSet que contiene todas las cuentas corrientes.
     */
    public HashSet<CuentaCorriente> listarCuentas() {
        return listado;
    }

    /**
     * Da de alta una nueva cuenta corriente.
     *
     * @param cc La cuenta corriente a dar de alta.
     * @return true si la cuenta se añadió correctamente, false si ya existía.
     */
    public boolean altaCuenta(CuentaCorriente cc) {
        return listado.add(cc);
    }

    /**
     * Da de baja una cuenta corriente existente.
     *
     * @param cc La cuenta corriente a dar de baja.
     * @return true si la cuenta se eliminó correctamente, false si no existía.
     */
    public boolean bajaCuenta(CuentaCorriente cc) {
        return listado.remove(cc);
    }

    /**
     * Modifica el nombre del titular de una cuenta corriente.
     *
     * @param dni    El DNI de la cuenta corriente a modificar.
     * @param nombre El nuevo nombre del titular.
     * @return true si la cuenta se encontró y modificó, false si no se encontró.
     */
    public boolean modificaNombre(String dni, String nombre) {

        boolean estado = false;

        CuentaCorriente ccAux = new CuentaCorriente(dni);

        for (CuentaCorriente cc : listado) {
            if (ccAux.equals(cc)) {
                cc.setNombre(nombre);
                estado = true;
            }
        }

        return estado;
    }

    /**
     * Modifica la nacionalidad del titular de una cuenta corriente.
     *
     * @param dni          El DNI de la cuenta corriente a modificar.
     * @param nacionalidad La nueva nacionalidad del titular.
     * @return true si la cuenta se encontró y modificó, false si no se encontró.
     */
    public boolean modificaNacionalidad(String dni, String nacionalidad) {

        boolean estado = false;

        CuentaCorriente ccAux = new CuentaCorriente(dni);

        for (CuentaCorriente cc : listado) {
            if (ccAux.equals(cc)) {
                cc.setNacionalidad(nacionalidad);
                estado = true;
            }
        }

        return estado;
    }

    /**
     * Modifica el saldo de una cuenta corriente.
     *
     * @param dni   El DNI de la cuenta corriente a modificar.
     * @param saldo El nuevo saldo de la cuenta.
     * @return true si la cuenta se encontró y modificó, false si no se encontró.
     */
    public boolean nuevoSaldo(String dni, Double saldo) {

        boolean estado = false;

        CuentaCorriente ccAux = new CuentaCorriente(dni);

        for (CuentaCorriente cc : listado) {
            if (ccAux.equals(cc)) {
                cc.setSaldo(saldo);
                estado = true;
            }
        }

        return estado;
    }

}