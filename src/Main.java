public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE FORMAS GEOMÉTRICAS ===\n");

        Circulo circulo1 = new Circulo(5.0);
        Circulo circulo2 = new Circulo(3.5);

        Esfera esfera1 = new Esfera(4.0);
        Esfera esfera2 = new Esfera(2.8);

        System.out.println("Círculos criados com raios: 5.0 e 3.5");
        System.out.println("Esferas criadas com raios: 4.0 e 2.8");
        System.out.println("\nFormas geométricas criadas com sucesso!");
    }
} 