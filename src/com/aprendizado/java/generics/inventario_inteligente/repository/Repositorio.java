package com.aprendizado.java.generics.inventario_inteligente.repository;

import com.aprendizado.java.generics.inventario_inteligente.Categoria;
import com.aprendizado.java.generics.inventario_inteligente.Identificavel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Repositorio <T extends Identificavel> {
    private List<T> elementos;

    public Repositorio() {
        this.elementos = new ArrayList<>();
    }

    public void adicionar(T item){
        elementos.add(item);
    }

    public void removerPorId(int id){
        Iterator<T> lista = elementos.iterator();
        while (lista.hasNext()){
            if (lista.next().getId() == id) {
                lista.remove();
                return;
            }
        }
        throw new IllegalArgumentException("Item não encontrado");
    }

    public T buscarPorId(int id){
        for (T elemento : elementos) {
            if (elemento.getId() == id) {
                return elemento;
            }
        }
        throw new IllegalArgumentException("Item não encontrado");
    }

    public List<T> buscarPorCategoria(Categoria categoria){
        List<T> elementosPorCategoria = new ArrayList<>();
        for (T elemento : elementos) {
            if (elemento.getCategoria().equals(categoria)) {
               elementosPorCategoria.add(elemento);
            }
        }
        return elementosPorCategoria;
    }

    public List<T> buscarTodos(){
        return elementos;
    }
}
