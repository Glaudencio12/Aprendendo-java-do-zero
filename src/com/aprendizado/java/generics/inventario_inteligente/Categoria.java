package com.aprendizado.java.generics.inventario_inteligente;

public enum Categoria {
    TECNOLOGIA("Tecnologia"),
    ALIMENTO("Alimento"),
    ROUPA("Roupa"),
    LIVRO("Livro");

    private String categoria;

    Categoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
}
