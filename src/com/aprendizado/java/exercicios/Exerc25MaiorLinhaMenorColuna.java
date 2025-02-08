package com.aprendizado.java.exercicios;

public class Exerc25MaiorLinhaMenorColuna {
    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 5, 6, 2, 8, 4 },
                { 1, 4, 5, 5, 5, 3, 4 },
                { 1, 2, 5, 6, 2, 6, 7 },
                { 1, 2, 5, 6, 2, 9, 1 },
                { 1, 2, 5, 6, 2, 8, 5 },
                { 1, 2, 5, 6, 2, 1, 3 },
                { 1, 2, 5, 6, 2, 5, 2 }
        };
        int[] maiorLinhas = new int[7];
        int[] menorColunas = new int[7];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            int maior = matriz[i][0];
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            maiorLinhas[i] = maior;
        }

        for (int j = 0; j < matriz.length; j++) {
            int menor = matriz[0][j];
            for (int i = 0; i < matriz[j].length; i++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            menorColunas[j] = menor;
        }

        System.out.println("=".repeat(20));
        System.out.println("Maiores elementos de cada linha: ");
        for (int i = 0; i < maiorLinhas.length; i++) {
            System.out.print(maiorLinhas[i] + " ");
        }

        System.out.println();

        System.out.println("=".repeat(20));
        System.out.println("Menores elementos de cada coluna: ");
        for (int i = 0; i < menorColunas.length; i++) {
            System.out.print(menorColunas[i] + " ");
        }
    }
}
