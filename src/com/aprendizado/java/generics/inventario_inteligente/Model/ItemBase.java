package com.aprendizado.java.generics.inventario_inteligente.Model;

import com.aprendizado.java.generics.inventario_inteligente.Categoria;
import com.aprendizado.java.generics.inventario_inteligente.Identificavel;

import java.util.Objects;

public abstract class ItemBase implements Identificavel {
    private int id;
    private String nome;
    private Categoria categoria;
    private double preco;

    public ItemBase(int id, String nome, Categoria categoria, double preco) {
        if (id < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        } else {
            this.id = id;
        }
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ItemBase itemBase = (ItemBase) o;
        return id == itemBase.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome +
               ", Categoria: " + categoria +
               ", Preço: " + preco;
    }
}
