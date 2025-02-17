package parte3.ejercicio5;

import java.util.Random;

public class Ejercicio5 {
	
	public void generaNumeros(int num) {
		
		Random rd = new Random();
		
		for (int i = 0; i < num; i++) {
			System.out.println(rd.nextInt(0, 2));
		}
		
	}
	
	public void generaNumeros(int cantidad, int valorMaximo) {
		
		Random rd = new Random();
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println(rd.nextInt(0, valorMaximo));
		}
		
	}
	
	public void generaNumeros(int cantidad, int valorMinimo, int valorMaximo) {
		
		Random rd = new Random();
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println(rd.nextInt(valorMinimo, valorMaximo));
		}
		
	}

}
