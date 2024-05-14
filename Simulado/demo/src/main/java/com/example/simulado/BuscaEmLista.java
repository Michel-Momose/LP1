package com.example.simulado;

import java.util.Scanner;

public class BuscaEmLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lista = new int[10];
        int item, i, achou;

        // Preenchimento da lista
        for (i = 0; i < 10; i++) {
            System.out.print("Digite o item " + (i + 1) + " da lista: ");
            lista[i] = scanner.nextInt();
        }

        System.out.print("Digite o item a ser procurado: ");
        item = scanner.nextInt();

        i = 0;
        achou = 0; // 0 = FALSO, 1 = VERDADEIRO

        // Procura na lista
        while (i < 10 && achou == 0) {
            if (lista[i] == item) {
                achou = 1;
            }
            i++;
        }
        // Saída
        if (achou == 1) {
            System.out.println(item + " encontrado na posição " + i);
        } else {
            System.out.println(item + " não encontrado na lista");
        }
        scanner.close();
    }
}
