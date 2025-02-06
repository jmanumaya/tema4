package parte1.ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Punto punto1 = new Punto(1,2);
		Punto punto2 = new Punto(3,4);
		
		int x = 4;
		int y = 8;
		
		double distancia;
		
		punto1.setX(x);
		punto2.setY(y);
		
		punto1.setY(y);
		punto2.setX(x);
		
		System.out.println(punto1.getX() + "," + punto1.getY());
		System.out.println(punto2.getX() + "," + punto2.getY());
		
		punto1.setX(punto1.getX() * punto1.getY());
		punto1.setY(punto1.getY() + punto1.getX());
		
		punto2.setX(punto2.getX() * punto2.getY());
		punto2.setY(punto2.getY() + punto2.getX());
		
		punto2.setX(punto2.getX() * punto2.getY());
		punto2.setY(punto2.getY() + punto2.getX());
		
		System.out.println();
		System.out.println(punto1.getX() + "," + punto1.getY());
		System.out.println(punto2.getX() + "," + punto2.getY());
		
        punto1.setXY(2, 3);
        System.out.println("\nPunto 1 después de setXY: " + punto1);

        punto2.desplaza(3, -2);
        System.out.println("\nPunto 2 después de desplazar: " + punto2);

        distancia = punto1.distancia(punto2);
        System.out.println("\nDistancia entre punto1 y punto2: " + distancia);
	}

}
