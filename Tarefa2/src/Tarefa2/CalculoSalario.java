package Tarefa2;

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de horas trabalhadas em um mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();

        int horasSemanais = 40; // Número de horas semanais padrão
        int semanasNoMes = 4;   // Número de semanas em um mês

        double salarioTotal;

        if (horasTrabalhadas <= horasSemanais * semanasNoMes) {
            // Se o funcionário não trabalhou horas extras
            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else {
            // Se o funcionário trabalhou horas extras
            int horasExtras = horasTrabalhadas - (horasSemanais * semanasNoMes);
            double salarioHoraExtra = salarioPorHora * 1.5; // 50% de acréscimo
            salarioTotal = (horasSemanais * semanasNoMes * salarioPorHora) + (horasExtras * salarioHoraExtra);
        }

        System.out.println("O salário total do funcionário é: " + salarioTotal);

        scanner.close();
    }
}
