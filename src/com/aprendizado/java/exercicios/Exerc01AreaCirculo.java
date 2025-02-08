package com.aprendizado.java.exercicios;

import java.util.Scanner;

public class Exerc01AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;

        System.out.println();
        double raio = scanner.nextDouble();

        double area = pi * Math.pow(raio, 2);

        System.out.printf("A = %.4f%n", area);

        scanner.close();
    }
}