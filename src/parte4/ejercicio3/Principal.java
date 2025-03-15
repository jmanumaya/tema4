package parte4.ejercicio3;

public class Principal {

	public static void main(String[] args) {
		
		/*Pruebas Clase Fecha*/
		
		Fecha fecha1 = new Fecha(27, 2, 2024);
		
		Fecha fecha2 = new Fecha(29, 9, 2023);
		
		Fecha fecha3 = new Fecha(30, 12, 2021);
		
		/*PRUEBA FECHA 1*/
		
		System.out.println(fecha1);
		
		fecha1.diaSiguiente();
		
		System.out.println(fecha1);
		
		fecha1.diaSiguiente();
		
		System.out.println(fecha1);
		
		fecha1.diaSiguiente();
		
		System.out.println(fecha1);
		
		/*PRUEBA FECHA 1*/
		
		/*PRUEBA FECHA 2*/
		
		System.out.println(fecha2);
		
		fecha2.diaSiguiente();
		
		System.out.println(fecha2);
		
		fecha2.diaSiguiente();
		
		System.out.println(fecha2);
		
		/*PRUEBA FECHA 2*/
		
		/*PRUEBA FECHA 3*/
		
		System.out.println(fecha3);
		
		fecha3.diaSiguiente();
		
		System.out.println(fecha3);
		
		fecha3.diaSiguiente();
		
		System.out.println(fecha3);
		
		/*PRUEBA FECHA 3*/
		
		/*Pruebas Clase Fecha*/

	}

}
