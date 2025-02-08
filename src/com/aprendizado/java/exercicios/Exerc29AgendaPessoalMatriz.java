package com.aprendizado.java.exercicios;

import java.util.Scanner;

public class Exerc29AgendaPessoalMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] agenda = new String[24][31];

        System.out.print("Informe o dia do compromisso (1-31): ");
        int dia = scanner.nextInt();

        System.out.print("Informe a hora do compromisso (0-23): ");
        int hora = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Descreva o compromisso: ");
        String compromisso = scanner.nextLine();

        agenda[hora][dia - 1] = compromisso;

        String res = "";
        System.out.println("\nAgenda:");

        System.out.print("Deseja consultar um comprimisso [s] ou [n]");
        String resposta = scanner.nextLine();

        if (resposta.equals("s")) {
            System.out.print("Informe o dia do compromisso (1-31): ");
            int diaBusca = scanner.nextInt();

            System.out.print("Informe a hora do compromisso (0-23): ");
            int horaBusca = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < agenda.length; i++) {
                for (int j = 0; j < agenda[i].length; j++) {
                    res = agenda[horaBusca][diaBusca - 1];
                }
            }
            System.out.println("Seu compromisso para o dia " + diaBusca + " às " + horaBusca + " horas será: " + res);
        }
        scanner.close();

        for (String[] array : agenda){
            for (String compro : array){
                System.out.print(compro + " ");
            }
            System.out.println();
        }
    }
}
