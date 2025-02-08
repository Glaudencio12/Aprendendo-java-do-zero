package com.aprendizado.java.POO.dominio.SistemaComercial;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> produtos;
    private Cliente cliente;
    private String data;

    public Pedido(Cliente cliente, String data){
        this.cliente = cliente;
        this.data = data;
        this.produtos = new ArrayList<>();
    }

    public Pedido(){
        this.cliente = null;
        this.data = "Não informada";
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void removerProduto(Produto produto){
        produtos.remove(produto);
    }

    public double calcularTotal(){
        double soma = 0;
        if (produtos != null) {
           for (Produto produto : produtos){
               soma += produto.getPreco();
           }
        }
        return soma;
    }

    public void exibirInfo(){
        System.out.println("Cliente do pedido: " + cliente.getNome());
        System.out.println("Data do pedido: " + data);
        System.out.println("Produtos do pedido: ");
        for (Produto produto : produtos){
            produto.exibirInfo();
        }
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
