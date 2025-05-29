public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE FORMAS GEOMÉTRICAS ===\n");

        Circulo circulo1 = new Circulo(5.0);
        Circulo circulo2 = new Circulo(3.5);

        System.out.println("=== CÁLCULOS DE ÁREA DOS CÍRCULOS ===");
        System.out.println("Círculo 1 - Raio: 5.0");
        double area1 = circulo1.calcularArea();
        System.out.println("Área: " + area1);

        System.out.println("\nCírculo 2 - Raio: 3.5");
        double area2 = circulo2.calcularArea();
        System.out.println("Área: " + area2);

        System.out.println("\n=== CÁLCULOS DE VOLUME DAS ESFERAS ===");

        Esfera esfera1 = new Esfera(4.0);
        Esfera esfera2 = new Esfera(2.8);

        System.out.println("Esfera 1 - Raio: 4.0");
        double volume1 = esfera1.calcularVolume();
        System.out.println("Volume: " + volume1);

        System.out.println("\nEsfera 2 - Raio: 2.8");
        double volume2 = esfera2.calcularVolume();
        System.out.println("Volume: " + volume2);

        System.out.println("\n=== COMPARAÇÕES ===");
        System.out.println("Maior área entre os círculos: " + Math.max(area1, area2));
        System.out.println("Maior volume entre as esferas: " + Math.max(volume1, volume2));

        System.out.println("\n=== CÁLCULOS REALIZADOS COM SUCESSO! ===");
    }
} 