public class Quadrado extends Figura {
    private double lado;
    
    public Quadrado(String nome, String cor, double lado) {
            super(nome, cor, lado * lado, lado);
            this.lado = lado;
        }
    
    @Override
    public void calcularPerimetro() {
        perimetro = 4 * lado;
        }

    public void calcularArea() {
        area = lado * lado;
    }
}