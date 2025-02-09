package com.aprendizado.java.Classes_Enums.ContaCliente;

public enum TipoPagamento {
    CREDITO("Crédito"){
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.10;
        }
    },
    DEBITO("Débito"){
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    },
    PIX("Pix"){
        @Override
        public double calcularDesconto(double valor) {
            return 0;
        }
    };

    private String nome;

    TipoPagamento(String nome) {
        this.nome = nome;
    }

    public abstract double calcularDesconto(double valor);

    public String getNome() {
        return nome;
    }
}
