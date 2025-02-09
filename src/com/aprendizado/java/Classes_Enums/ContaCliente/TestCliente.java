package com.aprendizado.java.Classes_Enums.ContaCliente;

public class TestCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Glaudencio", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Raimundo", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("Francisco", TipoCliente.PESSOA_FISICA, TipoPagamento.PIX);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(cliente3.toString());

        System.out.println("-".repeat(50));

        System.out.println("Id do tipo do clinte: ");
        System.out.println("Pessoa Física: " + TipoCliente.buscarIdPorNomeRelatori("Pessoa Física"));
        System.out.println("Pessoa Jurídica: " + TipoCliente.buscarIdPorNomeRelatori("Pessoa Jurídica"));

        System.out.println("-".repeat(50));

        System.out.println("Descontos relacionados ao tipo de pagemento. EX: 100 R$: ");
        System.out.println("Crédito: " + TipoPagamento.CREDITO.calcularDesconto(100) + " R$");
        System.out.println("Débito: " + TipoPagamento.DEBITO.calcularDesconto(100) + " R$");
        System.out.println("Pix: " + TipoPagamento.PIX.calcularDesconto(100) + " R$");
    }
}
