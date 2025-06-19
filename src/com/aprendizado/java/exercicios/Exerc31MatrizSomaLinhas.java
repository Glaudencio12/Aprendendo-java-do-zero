package com.aprendizado.java.exercicios;

public class Exerc31MatrizSomaLinhas {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int valor = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor ++;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Linha " + i + " soma " + somaLinha);
        }
    }
}
