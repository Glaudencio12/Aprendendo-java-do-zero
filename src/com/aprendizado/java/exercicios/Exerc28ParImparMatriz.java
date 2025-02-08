package com.aprendizado.java.exercicios;

import java.util.Scanner;

public class Exerc28ParImparMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int countPar = 0;
        int countImpar = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite um valor: ");
                matriz[i][j] = scanner.nextInt();

                if (matriz[i][j] % 2 == 0) {
                    countPar++;
                }else{
                    countImpar++;
                }
            }
        }

        for (int[] array:matriz){
            for (int num:array){
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("Quantidade de números pares: " + countPar);
        System.out.println("Quantidade de números ímpares: " + countImpar);
    }
}
