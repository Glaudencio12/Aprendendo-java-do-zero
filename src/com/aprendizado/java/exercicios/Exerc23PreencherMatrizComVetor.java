package com.aprendizado.java.exercicios;

public class Exerc23PreencherMatrizComVetor {
    public static void main(String[] args) {
        int[] v = {1,2,3,4,5,6,7,8,9,1,4,7,3,6,7,8,3,6};
        int[][] m = new int[3][6];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = v[i * 6 + j];
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
