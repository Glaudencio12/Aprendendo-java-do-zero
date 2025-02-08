package com.aprendizado.java.exercicios;

public class Exerc27MaiorEMenorLinha5E7 {
    public static void main(String[] args) {
        int[][] matriz = {
                {3, 7, 6, 5, 2, 9, 8, 7, 7, 6},
                {3, 3, 3, 0, 3, 5, 1, 9, 6, 3},
                {0, 3, 7, 0, 6, 5, 6, 5, 2, 8},
                {1, 5, 1, 3, 0, 5, 7, 7, 1, 0},
                {2, 7, 5, 1, 9, 1, 7, 2, 9, 9},
                {8, 1, 5, 3, 1, 5, 8, 0, 2, 5},
                {6, 4, 9, 9, 9, 7, 9, 7, 5, 0},
                {0, 0, 7, 0, 8, 8, 2, 2, 7, 8},
                {0, 4, 0, 1, 9, 2, 0, 4, 7, 3},
                {5, 0, 3, 1, 1, 5, 0, 7, 2, 0}
        };

        int linha5 = 4;
        int coluna7 = 6;
        int maiorLinha5 = matriz[linha5][0];
        int menorLinha5 = matriz[linha5][0];
        int maiorColuna7 = matriz[0][coluna7];
        int menorColuna7 = matriz[0][coluna7];

        for (int i = 1; i < matriz[linha5].length; i++) {
            if (matriz[linha5][i] > maiorLinha5) {
                maiorLinha5 = matriz[linha5][i];
            }
            if (matriz[linha5][i] < menorLinha5) {
                menorLinha5 = matriz[linha5][i];
            }
        }
        System.out.println("O maior elemento da linha 5 é: " + maiorLinha5);
        System.out.println("O menorr elemento da linha 5 é: " + menorLinha5);

        for (int i = 1; i < matriz[coluna7].length; i++) {
            if (matriz[i][coluna7] > maiorColuna7) {
                maiorColuna7 = matriz[i][coluna7];
            }
            if (matriz[i][coluna7] < menorColuna7) {
                menorColuna7 = matriz[i][coluna7];
            }
        }
        System.out.println("O maior elemento da linha 5 é: " + maiorColuna7);
        System.out.println("O menorr elemento da linha 5 é: " + menorColuna7);
    }
}
