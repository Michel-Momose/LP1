package linguagem_programacao1;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        // Criando um scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo a nota da primeira prova
        System.out.print("Digite a nota da primeira prova (0 a 10): ");
        double P1 = scanner.nextDouble();

        // Solicitando e lendo a nota do primeiro exercicio
        System.out.print("Digite a nota do primeiro exercicio (0 a 10): ");
        double E1 = scanner.nextDouble();
        
        // Solicitando e lendo a nota do segundo exercicio
        System.out.print("Digite a nota do segundo exercicio (0 a 10): ");
        double E2 = scanner.nextDouble();
        
        // Solicitando e lendo a nota da API
        System.out.print("Digite a nota da API (0 a 10): ");
        double API = scanner.nextDouble();
        
        // Solicitando e lendo os pontos extras
        System.out.print("Digite a nota dos pontos extras (0 a 2): ");
        double X = scanner.nextDouble();
        
        // Verificando se as notas estão no intervalo válido
        if (P1 < 0 || P1 > 10 || E1 < 0 || E1 > 10 
        	|| E2 < 0 || E2 > 10 || API < 0 || API > 10 || X < 0 || X > 2) {
            System.out.println("As notas devem estar no intervalo de 0 a 10.");
            return; // Encerra o programa
        }

        // Calculando a média das notas
        double parte1 = (P1 * 0.6 + ((E1 + E2) / 2) * 0.4) * 0.5;
        double parte2 = Math.max(((P1 * 0.6 + ((E1 + E2) / 2) * 0.4) - 5.9), 0) / ((P1 * 0.6 + ((E1 + E2) / 2) * 0.4) - 5.9);
        double mediaSemSub = parte1 + parte2 * (API * 0.5) + X;
        
        System.out.println("A média de LP1 deste semestre sem considerar a prova substitutiva é: " + mediaSemSub);
        
        if (mediaSemSub >= 6.0) {
        	System.out.println("Aluno aprovado!");
        } else {
            // Solicitando e lendo a nota da prova substitutiva
            System.out.print("Digite a nota da prova substitutiva (0 a 10): ");
            double SUB = scanner.nextDouble();
            
            // Verificando se a nota da prova substitutiva está no intervalo válido
            if (SUB < 0 || SUB > 10) {
                System.out.println("A nota da prova substitutiva deve estar no intervalo de 0 a 10.");
                return; // Encerra o programa
            }
            
            // Recalculando a média considerando a prova substitutiva
            double mediaComSub = mediaSemSub + (SUB * 0.2);
            System.out.println("A média de LP1 deste semestre com a prova substitutiva é: " + mediaComSub);
            
            if (mediaComSub >= 6.0) {
                System.out.println("Aluno aprovado após prova substitutiva!");
            } else {
                System.out.println("Aluno reprovado mesmo após prova substitutiva.");
            }
        }
        
        // Fechando o scanner
        scanner.close();
    }
}
