package com.aprendizado.java.generics.inventario_inteligente.Model;

import com.aprendizado.java.generics.inventario_inteligente.Categoria;

import java.time.LocalDate;

public class ItemAlimento extends ItemBase {
    private LocalDate dataValidade;

    public ItemAlimento(int id, String nome, Categoria categoria, double preco, LocalDate dataValidade) {
        super(id, nome, categoria, preco);
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Data de validade: " + dataValidade;
    }
}
