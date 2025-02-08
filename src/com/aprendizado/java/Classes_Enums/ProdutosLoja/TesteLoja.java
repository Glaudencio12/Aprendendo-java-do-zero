package com.aprendizado.java.Classes_Enums.ProdutosLoja;

public class TesteLoja {
    public static void main(String[] args) {
        Produto p1 = new Produto(TipoProduto.ALIMENTO, "Macarrão", 3);

        System.out.println("Tipos de produtos na loja: ");
        for (TipoProduto produto : TipoProduto.values()){
            System.out.println(produto);
        }

        System.out.println("-".repeat(40));

        System.out.println("Pesquisa de preço por tipo: ");
        System.out.println("Preço do tipo encontrado: " + p1.pesquiarProduto("alimento"));

        System.out.println("-".repeat(40));

        System.out.println("Produto comprado: ");
        System.out.println("Produto: " +  p1.getTipo() + " - " + p1.getNome() + " - Quantidade: " + p1.getQuantidade() + " - Preço total:  " + p1.calcularPrecoTotal());

    }
}
