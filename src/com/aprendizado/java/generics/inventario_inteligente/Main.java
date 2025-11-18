package com.aprendizado.java.generics.inventario_inteligente;

import com.aprendizado.java.generics.inventario_inteligente.Model.ItemAlimento;
import com.aprendizado.java.generics.inventario_inteligente.Model.ItemBase;
import com.aprendizado.java.generics.inventario_inteligente.Model.ItemLivro;
import com.aprendizado.java.generics.inventario_inteligente.Model.ItemTecnologia;
import com.aprendizado.java.generics.inventario_inteligente.repository.Repositorio;
import com.aprendizado.java.generics.inventario_inteligente.utils.Util;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Repositorio<ItemBase> repositorio = new Repositorio<>();
        Service<ItemBase> service = new Service<>(repositorio);
        Scanner sc = new Scanner(System.in);

        // adicionar alguns itens de exemplo
        repositorio.adicionar(new ItemTecnologia(1, "Notebook X", Categoria.TECNOLOGIA, 4500, 12));
        repositorio.adicionar(new ItemAlimento(2, "Arroz 5kg", Categoria.ALIMENTO, 345, LocalDate.now().plusMonths(6)));
        repositorio.adicionar(new ItemLivro(3, "Aprendendo Java", Categoria.LIVRO, 456, "Autor A"));

        boolean executando = true;
        while (executando) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Listar todos");
            System.out.println("2 - Buscar por ID");
            System.out.println("3 - Adicionar item");
            System.out.println("4 - Remover por ID");
            System.out.println("5 - Relatórios (ordenar, agrupar, média)");
            System.out.println("6 - Soma de preços por categoria");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            String escolha = sc.nextLine().trim();
            try {
                switch (escolha) {
                    case "1":
                        Util.imprimirColecao(repositorio.buscarTodos());
                        break;

                    case "2":
                        System.out.print("ID: ");
                        int idBusca = Integer.parseInt(sc.nextLine());
                        System.out.println(repositorio.buscarPorId(idBusca));
                        break;

                    case "3":
                        adicionarInterativo(repositorio, sc);
                        break;

                    case "4":
                        System.out.print("ID para remover: ");
                        int idRem = Integer.parseInt(sc.nextLine());
                        repositorio.removerPorId(idRem);
                        System.out.println("Removido com sucesso.");
                        break;

                    case "5":
                        System.out.println("Ordenado por preço:");
                        Util.imprimirColecao(service.ordenarListaPorPreco());

                        System.out.println("\nAgrupado por categoria:");
                        service.agruparPorCategoria().forEach((cat, lista) -> {
                            System.out.println(cat);
                            lista.forEach(i -> System.out.println("  " + i));
                        });

                        System.out.printf("\nPreço médio: %.2f\n", service.precoMedio());
                        service.itemMaisCaro().ifPresent(i -> System.out.println("Mais caro: " + i));
                        service.itemMaisBarato().ifPresent(i -> System.out.println("Mais barato: " + i));
                        break;

                    case "6":
                        System.out.println("Soma de preços (todos): " + Util.totalPrecos(repositorio.buscarTodos()));
                        break;

                    case "0":
                        executando = false;
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        sc.close();
        System.out.println("Encerrado.");
    }

    private static void adicionarInterativo(Repositorio<ItemBase> repo, Scanner sc) {
        System.out.println("Escolha tipo: 1-Tecnologia 2-Alimento 3-Livro");
        String tipo = sc.nextLine().trim();
        try {
            System.out.print("ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = Double.parseDouble(sc.nextLine());

            switch (tipo) {
                case "1":
                    System.out.print("Garantia (meses): ");
                    int g = Integer.parseInt(sc.nextLine());
                    repo.adicionar(new ItemTecnologia(id, nome, Categoria.TECNOLOGIA, preco, g));
                    break;
                case "2":
                    System.out.print("Validade (YYYY-MM-DD): ");
                    LocalDate data = LocalDate.parse(sc.nextLine());
                    repo.adicionar(new ItemAlimento(id, nome, Categoria.ALIMENTO, preco, data));
                    break;
                case "3":
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    repo.adicionar(new ItemLivro(id, nome, Categoria.LIVRO, preco, autor));
                    break;
                default:
                    System.out.println("Tipo inválido.");
            }
            System.out.println("Item adicionado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar item: " + e.getMessage());
        }
    }
}
