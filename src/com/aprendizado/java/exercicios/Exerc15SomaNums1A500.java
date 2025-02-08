package com.aprendizado.java.exercicios;

public class Exerc15SomaNums1A500 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 500; i++) {
           soma += i;
        }
        System.out.println(soma);
    }
}
