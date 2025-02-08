package com.aprendizado.java.exercicios;
/*2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino)
de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
 */
import java.util.Scanner;

public class Exerc07GrupoPessoasAltura {
    public static void main(String[] args) {
        double maiorAltura = 0, mediaAlturaHomens, somaAltura = 0;
        int qtdHomens = 0, qtdMulheres = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite 1 para homem e 2 para mulher");

            System.out.print("Homem ou mulher: ");
            int sexo = scanner.nextInt();

            System.out.print("Digite a altura do individuo: ");
            double altura = scanner.nextDouble();

            switch (sexo){
                case 1:
                    qtdHomens++;
                    somaAltura += altura;

                    if (altura > maiorAltura) {
                        maiorAltura = altura;
                    }
                case 2:
                    qtdMulheres++;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        mediaAlturaHomens = somaAltura / qtdHomens;
        System.out.println("Maior altura dos homens: " + maiorAltura);
        System.out.println("Quantidade de mulheres: " + qtdMulheres);
        System.out.printf("Média das alturas dos homens: %.2f%n ", mediaAlturaHomens);

        scanner.close();
    }
}
