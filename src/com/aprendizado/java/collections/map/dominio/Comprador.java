package com.aprendizado.java.collections.map.dominio;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Comprador {
    private int id;
    private String nome;

    public Comprador(String nome) {
        this.id = ThreadLocalRandom.current().nextInt();
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Comprador comprador = (Comprador) object;
        return Objects.equals(nome, comprador.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
