public class TesteFiguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Círculo", 5.0);
        Retangulo retangulo = new Retangulo("Retângulo", 4.0, 6.0);
        Triangulo triangulo = new Triangulo("Triângulo", 3.0, 4.0, 5.0);
        Elipse elipse = new Elipse("Elipse", 3.0, 2.0);
        Hexagono hexagono = new Hexagono("Hexágono", 4.0);
        Losango losango = new Losango("Losango", 6.0, 8.0);
        Pentagono pentagono = new Pentagono("Pentágono", 5.0);
        PoligonoIrregular poligonoIrregular = new PoligonoIrregular("Polígono Irregular", new double[]{3.0, 4.0, 5.0, 4.0, 3.0});
        Trapezio trapezio = new Trapezio("Trapézio", 5.0, 3.0, 4.0);
        Quadrado quadrado = new Quadrado("Quadrado", 4.0);

        // Calcular área e perímetro para todas as figuras
        circulo.calcularArea();
        circulo.calcularPerimetro();

        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        triangulo.calcularArea();
        triangulo.calcularPerimetro();

        elipse.calcularArea();
        elipse.calcularPerimetro();

        hexagono.calcularPerimetro();

        losango.calcularArea();
        losango.calcularPerimetro();

        pentagono.calcularPerimetro();

        trapezio.calcularArea();
        trapezio.calcularPerimetro();

        quadrado.calcularArea();
        quadrado.calcularPerimetro();

        // Imprimir os resultados
        System.out.println("Nome: " + circulo.getNome());
        System.out.println("Área: " + circulo.getArea());
        System.out.println("Perímetro: " + circulo.getPerimetro());

        System.out.println("Nome: " + retangulo.getNome());
        System.out.println("Área: " + retangulo.getArea());
        System.out.println("Perímetro: " + retangulo.getPerimetro());

        System.out.println("Nome: " + triangulo.getNome());
        System.out.println("Área: " + triangulo.getArea());
        System.out.println("Perímetro: " + triangulo.getPerimetro());

        System.out.println("Nome: " + elipse.getNome());
        System.out.println("Área: " + elipse.getArea());
        System.out.println("Perímetro: " + elipse.getPerimetro());

        System.out.println("Nome: " + hexagono.getNome());
        System.out.println("Perímetro: " + hexagono.getPerimetro());

        System.out.println("Nome: " + losango.getNome());
        System.out.println("Área: " + losango.getArea());
        System.out.println("Perímetro: " + losango.getPerimetro());

        System.out.println("Nome: " + pentagono.getNome());
        System.out.println("Perímetro: " + pentagono.getPerimetro());

        // Não podemos calcular a área do Polígono Irregular sem coordenadas dos vértices

        System.out.println("Nome: " + trapezio.getNome());
        System.out.println("Área: " + trapezio.getArea());
        System.out.println("Perímetro: " + trapezio.getPerimetro());

        System.out.println("Nome: " + quadrado.getNome());
        System.out.println("Área: " + quadrado.getArea());
        System.out.println("Perímetro: " + quadrado.getPerimetro());
    }
}
