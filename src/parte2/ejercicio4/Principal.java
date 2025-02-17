package parte2.ejercicio4;

public class Principal {

    public static void main(String[] args) {
        // Creación de pizzas
        Pizza pizza1 = new Pizza(203949, "Mediana", "Funghi");
        Pizza pizza2 = new Pizza(304812, "Familiar", "Margarita");
        Pizza pizza3 = new Pizza(203949, "Mediana", "CuatroQuesos"); // Mismo código que pizza 1

        // Muestro información de las pizzas
        System.out.println("Pizzas creadas:");
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

        // Comparación de pizzas
        System.out.println("\n¿Pizza1 y Pizza3 son iguales? " + pizza1.equals(pizza3));
        System.out.println("¿Pizza1 y Pizza2 son iguales? " + pizza1.equals(pizza2));

        // Servir una pizza
        pizza1.servir();
        System.out.println("\nPizza1 después de servirse: " + pizza1);
    }
}
