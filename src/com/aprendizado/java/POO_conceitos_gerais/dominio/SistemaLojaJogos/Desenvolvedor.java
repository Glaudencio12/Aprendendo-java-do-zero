package com.aprendizado.java.POO_conceitos_gerais.dominio.SistemaLojaJogos;

public class Desenvolvedor {
    private String nome;
    private String pais;

    public Desenvolvedor(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
