public class Calculadora {
    private int numerador;
    private int denominador;

    public Calculadora(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public void soma (int outroNumerador, int outroDenominador) {
        int novoNumerador = this.numerador * outroDenominador + outroNumerador * this.denominador;
        int novoDenominador = this.denominador * outroDenominador;
        System.out.println("Resultado da soma:" + novoNumerador + "/" + novoDenominador);
    }

    public void subtracao (int outroNumerador, int outroDenominador) {
        int novoNumerador = this.numerador * outroDenominador - outroNumerador * this.denominador;
        int novoDenominador = this.denominador * outroDenominador;
        System.out.println("Resultado da subtração:" + novoNumerador + "/" + novoDenominador);
    }

    public void multiplicacao (int outroNumerador, int outroDenominador) {
        int novoNumerador = this.numerador * outroNumerador;
        int novoDenominador = this.denominador * outroDenominador;
        System.out.println("Resultado da multiplicação:" + novoNumerador + "/" + novoDenominador);
    }

    public void divisao (int outroNumerador, int outroDenominador) {
        int novoNumerador = this.numerador * outroDenominador;
        int novoDenominador = this.denominador * outroNumerador;
        System.out.println("Resultado da divisão:" + novoNumerador + "/" + novoDenominador);
    }

    public static void main(String[] args){
        Calculadora calculadora1 = new Calculadora(1, 2);
        calculadora1.soma(1,3);
        calculadora1.subtracao(1,3);
        calculadora1.multiplicacao(1, 3);
        calculadora1.divisao(1, 3);
    }
}
