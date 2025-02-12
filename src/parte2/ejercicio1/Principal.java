package parte2.ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		CuentaCorriente cuenta1 = new CuentaCorriente("12345678P", "Jose Manuel", 2000, "española");
		CuentaCorriente cuenta2 = new CuentaCorriente("87654321H", "Pepe", 3000);
		
		System.out.println(cuenta1);
		System.out.println();
		System.out.println(cuenta2);
		
		cuenta2.setNacionalidad("extranjera");
		
		System.out.println("\nNueva Nacionalidad de " + cuenta2.getNombre() + ": " + cuenta2.getNacionalidad());
		
		

	}

}
