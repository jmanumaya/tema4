package parte1.ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Punto punto1 = new Punto(5,0);
		Punto punto2 = new Punto(10,10);
		Punto punto3 = new Punto(-3,7);
		
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
