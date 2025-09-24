package com.aprendizado.java.collections.praticas_de_fixação.AtendimentoBancario;

import java.util.Scanner;

public class PainelCliente {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        int opcao = 0;
        Cliente cliente;

        do {
            System.out.println("\n ================ MENU BANCO ================");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Chamar próximo cliente");
            System.out.println("3 - Mostrar fila completa");
            System.out.println("4 - Mostrar apenas fila de VIPs");
            System.out.println("5 - Mostrar apenas fila de Normais");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1 -> {
                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();

                    System.out.print("Tipo do cliente: ");
                    String tipo = scanner.nextLine();

                    System.out.print("Senha do cliente: ");
                    int senha = scanner.nextInt();

                    cliente = new Cliente(nome, tipo, senha);
                    banco.adicionarCliente(cliente);
                }

                case 2 -> banco.chamarCliente();
                case 3 -> banco.filaCompleta();
                case 4 -> banco.filaDevips();
                case 5 -> banco.filaDeNormais();
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
