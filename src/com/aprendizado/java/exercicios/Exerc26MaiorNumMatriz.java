package com.aprendizado.java.exercicios;

public class Exerc26MaiorNumMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 5, 6, 0},
                {4, 3, 7, 8},
                {6, 5, 6, 2},
                {2, 0, 1, 5}
        };
        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("linha: " + linha + " ; " + "Coluna: " + coluna);
        System.out.println("Número: " + maior);
    }
}
