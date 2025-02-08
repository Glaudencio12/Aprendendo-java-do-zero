package com.aprendizado.java.exercicios;

import java.util.Scanner;

public class Exerc21QualEOFilmeArrays {
    public void lerPistas(String[] pistas) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é o nome do filme: ");
        pistas[0] = scanner.nextLine();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Jogador 1 - Digite a pista " + i + ": ");
            pistas[i] = scanner.nextLine();
        }
    }

    public void compararFilme(String[] pistas, int numPistas) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int pontuacao;
        int pistasRestantes = numPistas;

        for (int i = 1; i <= numPistas; i++) {
            System.out.println("número de pistas restantes " + pistasRestantes);
            System.out.println("Pista " + i + ": " + pistas[i]);
            System.out.print("Jogador 2 – Qual o nome do filme? ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase(pistas[0])) {
                switch (count){
                    case 1:
                        pontuacao = 100;
                        System.out.println("Voce acertou: " + pontuacao + " pontos");
                        break;
                    case 2:
                        pontuacao = 60;
                        System.out.println("Voce acertou: " + pontuacao + " pontos");
                        break;
                    case 3:
                        pontuacao = 40;
                        System.out.println("Voce acertou: " + pontuacao + " pontos");
                        break;
                    case 4:
                        pontuacao = 20;
                        System.out.println("Voce acertou: " + pontuacao + " pontos");
                        break;
                    case 5:
                        pontuacao = 10;
                        System.out.println("Voce acertou: " + pontuacao + " pontos");
                        break;
                }
                return;

            } else {
                count++;
                System.out.println("Você errou!");
                pistasRestantes = pistasRestantes - 1;
                System.out.println("=".repeat(30));
            }
        }
        System.out.println("Acabaram as pistas! O filme era: " + pistas[0]);
    }
}
