package com.aprendizado.java.POO_conceitos_gerais.dominio.SistemaLojaVeículos;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    {
        System.out.println("Veículo criado com sucesso!");
    }

    public Veiculo(String marca, String modelo, int ano, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public Veiculo(){
        this.marca = "Não informada";
        this.modelo = "Não informado";
        this.ano = 0;
        this.preco = 0;
    }

    public void exibirDetalhes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + ano);
        System.out.println("Preço: " + preco);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
