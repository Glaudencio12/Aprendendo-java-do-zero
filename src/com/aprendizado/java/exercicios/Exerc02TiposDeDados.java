package com.aprendizado.java.exercicios;

public class Exerc02TiposDeDados {
    public static void main(String[] args) {
        // conversão de int pra float
        int n1 = 12;
        int n2 = 13;
        int n3 = 14;
        System.out.println((float) n1);
        System.out.println((float) n2);
        System.out.println((float) n3);

        // coversão de float pra int
        float num1 = 12.5f;
        float num2 = 12.3f;
        float num3 = 12.8f;
        System.out.println((int) num1);
        System.out.println((int) num2);
        System.out.println((int) num3);

        // soma de dus variáveis com tipos diferentes
        System.out.println(num3 + n2);
    }
}
