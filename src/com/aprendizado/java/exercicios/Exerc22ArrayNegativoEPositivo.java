package com.aprendizado.java.exercicios;

public class Exerc22ArrayNegativoEPositivo {
    public static void main(String[] args) {
        int[] v1 = {-1,2,3,5,2,-4,-1,-9};
        int[] numsPositivos = new int[8];
        int[] numsNegativos = new int[8];

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] > 0) {
                numsPositivos[i] = v1[i];
            }else{
                numsNegativos[i] = v1[i];
            }
        }

        for (int i = 0; i < numsPositivos.length; i++) {
            System.out.print(numsPositivos[i] + " ");
        }

        for (int i = 0; i < numsNegativos.length; i++) {
            System.out.print(numsNegativos[i] + " ");
        }
    }
}
