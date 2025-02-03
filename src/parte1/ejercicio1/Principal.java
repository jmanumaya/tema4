package parte1.ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Punto punto1 = new Punto();
		Punto punto2 = new Punto();
		Punto punto3 = new Punto();
		
		punto1.x = 5;
		punto1.y = 0;
		
		punto2.x = 10;
		punto2.y = 10;
		
		punto3.x = -3;
		punto3.y = 7;
		
		System.out.println(punto1.x + "," + punto1.y);
		System.out.println(punto2.x + "," + punto2.y);
		System.out.println(punto3.x + "," + punto3.y);
		
		punto1.x *= punto1.y;
		punto1.y += punto1.x;
		
		punto2.x = punto1.x + punto2.y;
		punto2.y = punto2.x + punto1.y;
		
		punto3.x += punto3.y;
		punto3.y *= punto1.y;
		
		System.out.println();
		System.out.println(punto1.x + "," + punto1.y);
		System.out.println(punto2.x + "," + punto2.y);
		System.out.println(punto3.x + "," + punto3.y);
	}

}
