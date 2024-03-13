public class Hexagono extends Figura {
    private double lado;

    public Hexagono(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }


    public void calcularPerimetro() {
        perimetro = 6 * lado;
    }

    
    public void calcularArea() {
        area = (3 * Math.sqrt(3) * lado * lado) / 2;
    }
}