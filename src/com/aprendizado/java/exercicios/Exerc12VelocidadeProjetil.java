package com.aprendizado.java.exercicios;

import java.util.Scanner;

public class Exerc12VelocidadeProjetil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a distância em km: ");
        double D = scanner.nextDouble();

        System.out.print("Quanto tempo pra percorre a distância: ");
        double T = scanner.nextDouble();

        double V = (D * 1000) / (T * 60);

        System.out.printf("A velocidade do projétil equivale a %.2f m/s", V);
    }
}
