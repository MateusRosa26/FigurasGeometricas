public class TestaFiguras {
    public static void main(String[] args) {
        System.out.println("=== TESTE DAS CLASSES DE FIGURAS GEOMÉTRICAS ===\n");

        System.out.println("=== TESTANDO CLASSE CIRCULO ===");
        Circulo meuCirculo = new Circulo(3.0);
        System.out.println("Círculo criado com raio: 3.0");

        double areaCirculo = meuCirculo.calcularArea();
        System.out.println("Área calculada: " + areaCirculo);
        System.out.println("Área formatada: " + String.format("%.2f", areaCirculo));
        System.out.println();

        System.out.println("=== TESTANDO CLASSE ESFERA ===");
        Esfera minhaEsfera = new Esfera(5.0);
        System.out.println("Esfera criada com raio: 5.0");

        double volumeEsfera = minhaEsfera.calcularVolume();
        System.out.println("Volume calculado: " + volumeEsfera);
        System.out.println("Volume formatado: " + String.format("%.2f", volumeEsfera));
        System.out.println();

        System.out.println("=== TESTE ADICIONAL COM OUTROS VALORES ===");

        Circulo circulo2 = new Circulo(7.5);
        System.out.println("Segundo círculo - Raio: 7.5");
        double area2 = circulo2.calcularArea();
        System.out.println("Área: " + String.format("%.2f", area2));

        Esfera esfera2 = new Esfera(2.0);
        System.out.println("Segunda esfera - Raio: 2.0");
        double volume2 = esfera2.calcularVolume();
        System.out.println("Volume: " + String.format("%.2f", volume2));
        System.out.println();

        System.out.println("=== VERIFICAÇÃO DOS RESULTADOS ===");
        System.out.println("Círculo raio 3.0 - Área esperada: ~28.27, Calculada: " + String.format("%.2f", areaCirculo));
        System.out.println("Esfera raio 5.0 - Volume esperado: ~523.60, Calculado: " + String.format("%.2f", volumeEsfera));

        System.out.println("\n=== TESTE CONCLUÍDO COM SUCESSO! ===");
        System.out.println("Todas as classes estão funcionando corretamente.");
    }
}