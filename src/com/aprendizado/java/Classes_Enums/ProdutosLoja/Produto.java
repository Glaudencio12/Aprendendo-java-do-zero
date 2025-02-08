package com.aprendizado.java.Classes_Enums.ProdutosLoja;

public class Produto {
    private TipoProduto tipo;
    private String nome;
    private int quantidade;

    public Produto(TipoProduto tipoProduto, String nome, int quantidade) {
        this.tipo = tipoProduto;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public double calcularPrecoTotal(){
        return this.quantidade * tipo.getPreco();
    }

    public double pesquiarProduto(String tipo){
        TipoProduto produto = TipoProduto.valueOf(tipo.toUpperCase());
        return produto.getPreco();
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
