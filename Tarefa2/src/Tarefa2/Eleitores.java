package Tarefa2;

import java.util.Scanner;

public class Eleitores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        System.out.println("Digite o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        System.out.println("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.println("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        double percentualVotosBrancos = (double) votosBrancos / totalEleitores * 100;
        double percentualVotosNulos = (double) votosNulos / totalEleitores * 100;
        double percentualVotosValidos = (double) votosValidos / totalEleitores * 100;

        System.out.println("Percentual de votos brancos: " + percentualVotosBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualVotosNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualVotosValidos + "%");

        scanner.close();
    }
}
