package com.aprendizado.java.Classes_Enums.ContaCliente;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Clientes: " +
                "nome: '" + nome + '\'' +
                ", tipoCliente: " + tipoCliente.getNome() +
                ", tipoPagamento: " + tipoPagamento.getNome();
    }
}
