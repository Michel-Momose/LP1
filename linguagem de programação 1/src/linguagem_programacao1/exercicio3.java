package linguagem_programacao1;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        // Criando um scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo a nota da primeira prova
        System.out.print("Digite a nota da primeira prova (0 a 10): ");
        double notaProva1 = scanner.nextDouble();

        // Solicitando e lendo a nota da segunda prova
        System.out.print("Digite a nota da segunda prova (0 a 10): ");
        double notaProva2 = scanner.nextDouble();

        // Verificando se as notas estão no intervalo válido
        if (notaProva1 < 0 || notaProva1 > 10 || notaProva2 < 0 || notaProva2 > 10) {
            System.out.println("As notas devem estar no intervalo de 0 a 10.");
            return; // Encerra o programa
        }

        // Calculando a média das notas
        double media = (notaProva1 + notaProva2) / 2.0;

        // Exibindo a média
        System.out.println("A média de LP1 deste semestre é: " + media);

        // Fechando o scanner
        scanner.close();
    }
}

