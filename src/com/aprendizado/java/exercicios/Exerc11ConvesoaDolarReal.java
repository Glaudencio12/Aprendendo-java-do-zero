package com.aprendizado.java.exercicios;

import java.util.Scanner;

public class Exerc11ConvesoaDolarReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cotacaoDolar = 6.19;

        System.out.print("Digite o valor em doláres: ");
        double valorDolar = scanner.nextDouble();

        double conversao = cotacaoDolar * valorDolar;

        System.out.printf("%.2f US$, equivale a %.2f R$", valorDolar, conversao);
    }
}
