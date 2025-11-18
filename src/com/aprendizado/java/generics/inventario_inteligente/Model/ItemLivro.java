package com.aprendizado.java.generics.inventario_inteligente.Model;

import com.aprendizado.java.generics.inventario_inteligente.Categoria;

public class ItemLivro extends ItemBase {
    private String autor;

    public ItemLivro(int id, String nome, Categoria categoria, double preco, String autor) {
        super(id, nome, categoria, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor;
    }
}
