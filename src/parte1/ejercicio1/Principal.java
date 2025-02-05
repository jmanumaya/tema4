package parte1.ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Punto punto1 = new Punto(1,2);
		Punto punto2 = new Punto(3,4);
		Punto punto3 = new Punto(4,5);
		
		int x = 4;
		int y = 8;
		
		punto1.setX(x);
		punto2.setY(y);
		
		punto1.setY(y);
		punto2.setX(x);
		
		punto3.setX(x);
		punto3.setY(y);
		
		System.out.println(punto1.getX() + "," + punto1.getY());
		System.out.println(punto2.getX() + "," + punto2.getY());
		System.out.println(punto3.getX() + "," + punto3.getY());
		
		punto1.setX(punto1.getX() * punto1.getY());
		punto1.setY(punto1.getY() + punto1.getX());
		
		punto2.setX(punto2.getX() * punto2.getY());
		punto2.setY(punto2.getY() + punto2.getX());
		
		punto2.setX(punto2.getX() * punto2.getY());
		punto2.setY(punto2.getY() + punto2.getX());
		
		System.out.println();
		System.out.println(punto1.getX() + "," + punto1.getY());
		System.out.println(punto2.getX() + "," + punto2.getY());
		System.out.println(punto3.getX() + "," + punto3.getY());
	}

}
