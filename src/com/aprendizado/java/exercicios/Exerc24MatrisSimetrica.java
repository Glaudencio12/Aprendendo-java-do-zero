package com.aprendizado.java.exercicios;

public class Exerc24MatrisSimetrica {
    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 4, 5, 5, 5, 3, 4, 8 },
                { 1, 2, 5, 6, 2, 6, 7, 6 },
                { 1, 2, 5, 6, 2, 9, 1, 4 },
                { 1, 2, 5, 6, 2, 8, 5, 2 },
                { 1, 2, 5, 6, 2, 1, 3, 9 },
                { 1, 2, 5, 6, 2, 5, 2, 1 },
                { 6, 4, 7, 9, 3, 8, 4, 5},
                { 1, 2, 5, 6, 2, 6, 7, 6 }
        };

        boolean isSimetrica = true;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == matriz[j][i]) {
                    isSimetrica = true;
                }else{
                    isSimetrica = false;
                    break;
                }
            }
        }
        System.out.println(isSimetrica);
    }
}
