package com.aprendizado.java.exercicios;
/*
1. Escreva um programa que, com base em uma temperatura em graus celsius,
a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8;
Ra = C * 1.8 + 32 + 459.67
 */
import java.util.Scanner;

public class Exerc06ConverterTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double C, K, Re, F, Ra;

        System.out.println("Digite o valor da temperatura em graus celcius: ");
        C = scanner.nextDouble();


        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;

        System.out.printf("Temperatura em Kelvin:  %.2f%n", K);
        System.out.printf("Temperatura em Fahreinheeit:  %.2f%n",F);
        System.out.printf("Temperatura em Réaumur:  %.2f%n", Re);
        System.out.printf("Temperatura em Rankine: %.2f%n", Ra);
    }
}
