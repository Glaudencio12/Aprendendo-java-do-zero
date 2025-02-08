package com.aprendizado.java.exercicios;

public class Exerc16Fibonacci {
    public static void main(String[] args) {
        int first = 1, second = 1;

        System.out.print(first + " " + second + " ");

        for (int i = 2; i <= 14; i++) {
            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }
}
