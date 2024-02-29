package Tarefa2;

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convertendo Fahrenheit para Celsius
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        System.out.println("A temperatura em graus Celsius é: " + celsius);

        scanner.close();
    }
}

