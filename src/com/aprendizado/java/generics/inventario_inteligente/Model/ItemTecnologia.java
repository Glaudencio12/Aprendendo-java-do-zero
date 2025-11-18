package com.aprendizado.java.generics.inventario_inteligente.Model;

import com.aprendizado.java.generics.inventario_inteligente.Categoria;

public class ItemTecnologia extends ItemBase {
    private int garantiaMeses;

    public ItemTecnologia(int id, String nome, Categoria categoria, double preco, int garantiaMeses) {
        super(id, nome, categoria, preco);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String toString() {
        return super.toString() + " , Garantia: " + garantiaMeses + " meses";
    }
}