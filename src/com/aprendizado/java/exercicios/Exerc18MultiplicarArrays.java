package com.aprendizado.java.exercicios;

public class Exerc18MultiplicarArrays {
    public static void main(String[] args) {
        int[] v1 = {1,2,3,4,5,6,7,8,9};
        int[] v2 = {2,3,4,5,6,7,8,9,0};
        int res = 0;

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                res = v1[i] * v2[i];
            }
            System.out.print(res + " ");
        }
    }
}
