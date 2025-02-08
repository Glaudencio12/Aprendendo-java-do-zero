package com.aprendizado.java.POO.dominio.SistemaComercial;

public class Produto {
    private String nome;
    private double preco;
    private String codigo;

    public Produto(String nome, double preco, String codigo){
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public Produto(){
        this.nome = "Não informado";
        this.preco = 0;
        this.codigo = "Não informado";
    }

    public void exibirInfo(){
        System.out.println("-".repeat(50));
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Código: " + codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
