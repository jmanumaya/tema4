package parte1.ejercicio3;

public class Principal {
	
	public static void main(String[] args) {
        // Instanciar dos objetos Rectángulo
        Rectangulo rect1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo rect2 = new Rectangulo(7, 9, 2, 3);

        // Mostrar las coordenadas, área y perímetro del primer rectángulo
        System.out.println("Primer rectángulo:");
        rect1.mostrarCoordenadas();
        System.out.println("Área: " + rect1.area());
        System.out.println("Perímetro: " + rect1.perimetro());

        // Mostrar las coordenadas, área y perímetro del segundo rectángulo
        System.out.println("\nSegundo rectángulo:");
        rect2.mostrarCoordenadas();
        System.out.println("Área: " + rect2.area());
        System.out.println("Perímetro: " + rect2.perimetro());

        // Modificar las coordenadas del primer rectángulo
        rect1.x1 = 1; rect1.y1 = 1; rect1.x2 = 6; rect1.y2 = 6;
        // Modificar las coordenadas del segundo rectángulo
        rect2.x1 = 4; rect2.y1 = 5; rect2.x2 = 8; rect2.y2 = 2;

        // Mostrar las nuevas coordenadas, área y perímetro del primer rectángulo
        System.out.println("\nNuevo primer rectángulo:");
        rect1.mostrarCoordenadas();
        System.out.println("Área: " + rect1.area());
        System.out.println("Perímetro: " + rect1.perimetro());

        // Mostrar las nuevas coordenadas, área y perímetro del segundo rectángulo
        System.out.println("\nNuevo segundo rectángulo:");
        rect2.mostrarCoordenadas();
        System.out.println("Área: " + rect2.area());
        System.out.println("Perímetro: " + rect2.perimetro());
    }
}


