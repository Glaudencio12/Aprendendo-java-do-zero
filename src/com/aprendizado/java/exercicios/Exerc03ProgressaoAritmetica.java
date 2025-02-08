package com.aprendizado.java.exercicios;
import java.util.Scanner;
public class Exerc03ProgressaoAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primeiro termo da P.A: ");
        int pt = scanner.nextInt();

        System.out.print("Razão da P.A: ");
        int ra = scanner.nextInt();

        System.out.print("Números de termos da P.A: ");
        int nt = scanner.nextInt();

        int resultado = pt + (nt -1) * ra;
        int somaTermos = nt / 2 * (pt + resultado);

        System.out.println("O n-ésimo termo desta P.A é: " + resultado);
        System.out.print("A soma dos n primeiros elementos é igual a: " + somaTermos);
    }
}
