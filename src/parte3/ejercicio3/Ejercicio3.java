package parte3.ejercicio3;

public class Ejercicio3 {
	
	
	public int sumaEnteros(int numero) {
		// Caso base: si el número es 0, la suma es 0
		if (numero == 0) {
			return 0;
		} else {
			// Suma recursiva
			return numero + sumaEnteros(numero - 1);
		}
	}
	
	
	public int sumaEnteros(int num1, int num2) {
		// Si num1 es mayor que num2, invierto el orden para que siempre se sume de menor a mayor
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		// Sumo todos los números entre num1 y num2 (inclusive)
		if (num1 > num2) {
			return 0;
		} else {
			return num1 + sumaEnteros(num1 + 1, num2);
		}
	}
}
