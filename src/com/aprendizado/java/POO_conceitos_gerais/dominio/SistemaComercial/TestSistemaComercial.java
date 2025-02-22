package com.aprendizado.java.POO_conceitos_gerais.dominio.SistemaComercial;

public class TestSistemaComercial {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Glaudencio", "glaudencio3@gmail.com", "98984588181");
        Cliente cliente2 = new Cliente("Raimundo", "glau@gmail.com", "98984588781");
        Cliente cliente3 = new Cliente("Carlos", "dencio3@gmail.com", "98984585181");

        Produto produto1 = new Produto("Maça de bolo", 12.6, "23b32");
        Produto produto2 = new Produto("Bolacha", 10.2, "22b32");
        Produto produto3 = new Produto("Maça de bolo", 13.6, "33b32");

        Pedido pedido = new Pedido(cliente1, "12.03.2024");
        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);
        pedido.removerProduto(produto3);

        pedido.exibirInfo();
        System.out.println("-".repeat(50));
        System.out.printf("Preço total do pedidio: %2f", pedido.calcularTotal());
    }
}
