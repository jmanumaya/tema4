package parte1.ejercicio3;

public class Principal {
	
	public static void main(String[] args) {
        // Instancio dos objetos Rectángulo
        Rectangulo rect1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo rect2 = new Rectangulo(7, 9, 2, 3);

        // Muestro las coordenadas, área y perímetro del primer rectángulo
        System.out.println("Primer rectángulo:");
        rect1.mostrarCoordenadas();
        System.out.println("Área: " + rect1.getArea());
        System.out.println("Perímetro: " + rect1.getPerimetro());

        // Muestro las coordenadas, área y perímetro del segundo rectángulo
        System.out.println("\nSegundo rectángulo:");
        rect2.mostrarCoordenadas();
        System.out.println("Área: " + rect2.getArea());
        System.out.println("Perímetro: " + rect2.getPerimetro());

        // Modifico las coordenadas del primer rectángulo utilizando los setters
        rect1.setX1(1); rect1.setY1(1); rect1.setX2(6); rect1.setY2(6);
        // Modificar las coordenadas del segundo rectángulo utilizando los setters
        rect2.setX1(4); rect2.setY1(5); rect2.setX2(8); rect2.setY2(2);

        // Muestro las nuevas coordenadas, área y perímetro del primer rectángulo
        System.out.println("\nNuevo primer rectángulo:");
        rect1.mostrarCoordenadas();
        System.out.println("Área: " + rect1.getArea());
        System.out.println("Perímetro: " + rect1.getPerimetro());

        // Muestro las nuevas coordenadas, área y perímetro del segundo rectángulo
        System.out.println("\nNuevo segundo rectángulo:");
        rect2.mostrarCoordenadas();
        System.out.println("Área: " + rect2.getArea());
        System.out.println("Perímetro: " + rect2.getPerimetro());
        
        System.out.println("Informacion Rectangulo 1: " + rect1);
        System.out.println("Informacion Rectangulo 2: " + rect2);
    }
}
