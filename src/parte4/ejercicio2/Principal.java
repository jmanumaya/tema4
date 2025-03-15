package parte4.ejercicio2;

public class Principal {

	public static void main(String[] args) {
		
		/*Pruebas Clase Contador*/
		
		Contador cont = new Contador(60);
		
		System.out.println(cont);
		
		cont.incrementar();
		
		System.out.println(cont);
		
		cont.decrementar();
		
		System.out.println(cont);
		
		cont.setCont(1);
		
		System.out.println(cont);
		
		cont.decrementar();
		
		System.out.println(cont);
		
		cont.decrementar();
		
		System.out.println(cont);

		/*Pruebas Clase Contador*/
	}

}
