package parte2.ejercicio1;

public class Principal {

    public static void main(String[] args) {
        
        // Creación de cuentas con distintos constructores
        CuentaCorriente cuenta1 = new CuentaCorriente("12345678P", "Jose Manuel", 2000, "española");
        CuentaCorriente cuenta2 = new CuentaCorriente("87654321H", "Pepe", 3000);
        CuentaCorriente cuenta3 = new CuentaCorriente("98765432J", 500);
        
        // Muestro la información inicial de las cuentas
        System.out.println("Cuentas creadas:");
        System.out.println(cuenta1);
        System.out.println();
        System.out.println(cuenta2);
        System.out.println();
        System.out.println(cuenta3);
        System.out.println("\n---------------------------");

        // Cambio la nacionalidad de una cuenta
        cuenta2.setNacionalidad("extranjera");
        System.out.println("Nueva Nacionalidad de " + cuenta2.getNombre() + ": " + cuenta2.getNacionalidad());
        
        // Prueba de ingresos
        System.out.println("\nIntentando ingresar 500€ en la cuenta de " + cuenta1.getNombre());
        if (cuenta1.ingresarDinero(500)) {
            System.out.println("Ingreso exitoso. Nuevo saldo: " + cuenta1.getSaldo());
        } else {
            System.out.println("Fallo al ingresar dinero.");
        }

        // Prueba de retiro de dinero con saldo suficiente
        System.out.println("\nIntentando retirar 1000€ de la cuenta de " + cuenta1.getNombre());
        if (cuenta1.sacarDinero(1000)) {
            System.out.println("Retiro exitoso. Nuevo saldo: " + cuenta1.getSaldo());
        } else {
            System.out.println("Fallo al retirar dinero.");
        }

        // Prueba de retiro de dinero sin saldo suficiente
        System.out.println("\nIntentando retirar 4000€ de la cuenta de " + cuenta2.getNombre());
        if (cuenta2.sacarDinero(4000)) {
            System.out.println("Retiro exitoso. Nuevo saldo: " + cuenta2.getSaldo());
        } else {
            System.out.println("Fallo al retirar dinero. Saldo insuficiente.");
        }

        // Prueba de igualdad de cuentas
        CuentaCorriente cuenta4 = new CuentaCorriente("12345678P", "Jose Manuel", 100);
        System.out.println("\nComparando cuenta1 con cuenta4:");
        if (cuenta1.equals(cuenta4)) {
            System.out.println("Las cuentas son iguales.");
        } else {
            System.out.println("Las cuentas son diferentes.");
        }

        System.out.println("\n---------------------------");
        System.out.println("Estado final de las cuentas:");
        System.out.println(cuenta1);
        System.out.println();
        System.out.println(cuenta2);
        System.out.println();
        System.out.println(cuenta3);
    }
}
