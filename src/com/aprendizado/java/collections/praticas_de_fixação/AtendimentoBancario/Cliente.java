package com.aprendizado.java.collections.praticas_de_fixação.AtendimentoBancario;

public class Cliente implements Comparable<Cliente> {
    private String nome;
    private String tipo;
    private int senha;

    public Cliente(String nome, String tipo, int senha) {
        this.nome = nome;
        this.tipo = tipo;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Cliente: " + '\n' +
               "nome = " + nome + '\n' +
               "tipo = " + tipo + '\n' +
               "senha = " + senha + '\n';
    }

    @Override
    public int compareTo(Cliente o) {
        if (this.tipo.equals(o.getTipo())) {
            if (this.senha > o.senha) {
                return -1;
            } else {
                return 1;
            }
        } else {
            if (this.tipo.equals("VIP")) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
