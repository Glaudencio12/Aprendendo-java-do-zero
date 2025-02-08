package com.aprendizado.java.exercicios;

import java.util.Arrays;

public class Exerc20UniaoDoisArrays {
    public static void main(String[] args) {
        int[] v1 = {2,3,4,5,5};
        int[] v2 = {5,63,6,7,8};
        System.out.println(Arrays.toString(uniao(v1,v2)));
    }

    public static int[] uniao(int[] v1, int[] v2){
        int[] v3 = new int[v1.length + v2.length];
        int posicao = 0;

        for (int i = 0; i < v1.length; i++) {
            v3[posicao++] = v1[i];
            v3[posicao++] = v2[i];
        }
        return v3;
    }
}
