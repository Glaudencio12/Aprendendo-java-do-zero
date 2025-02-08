package com.aprendizado.java.exercicios;

import java.util.Scanner;

public class Exerc17LoginComLoops {
    public static void main(String[] args) {
        final String LOGIN = "Glau16";
        final String SENHA = "porrontinha";

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("LOGIN: ");
            String loginInput = scanner.nextLine();

            System.out.print("SENHA: ");
            String senhaInput = scanner.nextLine();

            if (loginInput.equals(LOGIN) && senhaInput.equals(SENHA)) {
                System.out.println("ACESSO CONCEDIDO");
                break;
            } else {
                System.out.println("ACESSO NEGADO");
            }
        }
    }

    public static class Exerc17Fatorial {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Numero do fatorial: ");
            int num = scanner.nextInt();

            int fatorial = 0;
            for (int i = num - 1; i >= 1 ; i--) {
                fatorial = num * i;
                num = fatorial;
            }
            System.out.print(fatorial);
            scanner.close();
        }
    }
}

