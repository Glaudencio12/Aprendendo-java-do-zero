package com.aprendizado.java.Classes_Enums.ProdutosLoja;

public enum TipoProduto {
    ELETRONICO("Eletrônico", 10.0),
    ROUPA("Roupa", 5.0),
    ALIMENTO("Alimento", 2.0),
    LIVRO("Livro", 8.0);

    private String nome;
    private double preco;

    TipoProduto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " (Preço base: R$ " + preco + ")";
    }
}
