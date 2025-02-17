package parte3.ejercicio6;

public class FuncionesMatematicas {
	
	public static int sumatorio(int numero) {
		
		/*Empieza el return de 0 + 1 devuelve 1 que a su vez se lo suma a 2 para devolverlo para sumarselo a 3 
		 * para devolverselo para sumarselo a 4 y por ultimo devolverlo y sumarselo a 5*/
		
		int sumatorio;
		
		if (numero == 0) {
			return 0;
		} else {
			sumatorio = numero + sumatorio(numero - 1);
		}
		
		
		return sumatorio;
		
	}
	
	

}
