package com.aprendizado.java.exercicios;

import java.util.Scanner;

public class Exerc04ProgressaoGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primeiro termo da P.G: ");
        int pt = scanner.nextInt();

        System.out.print("Razão da P.G: ");
        int ra = scanner.nextInt();

        System.out.print("Números de termos da P.G: ");
        int nt = scanner.nextInt();

        int resultado = (int) (pt * Math.pow(ra, nt - 1));
        int somaTermos = (int) (pt * (Math.pow(ra,nt) - 1) / ra - 1);

        System.out.println("O n-ésimo termo desta P.G é: " + resultado);
        System.out.print("A soma dos n primeiros elementos é igual a: " + somaTermos);
    }
}
