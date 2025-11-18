package com.aprendizado.java.generics.inventario_inteligente;

import com.aprendizado.java.generics.inventario_inteligente.Model.ItemBase;
import com.aprendizado.java.generics.inventario_inteligente.repository.Repositorio;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Service<T extends ItemBase> {
    private final Repositorio<T> repositorio;

    public Service(Repositorio<T> repositorio) {
        this.repositorio = repositorio;
    }

    public List<T> ordenarListaPorPreco(){
        return repositorio.buscarTodos().stream()
                .sorted(Comparator.comparing(ItemBase::getPreco))
                .collect(Collectors.toList());
    }

    public List<T> filtrarPorPrecoMinimo(double precoMinimo){
        return repositorio.buscarTodos().stream()
                .filter(t -> t.getPreco() >= precoMinimo)
                .collect(Collectors.toList());
    }

    public Map<Categoria, List<T>> agruparPorCategoria(){
        return repositorio.buscarTodos().stream()
                .collect(Collectors.groupingBy(ItemBase::getCategoria));
    }

    public double precoMedio(){
        return repositorio.buscarTodos().stream()
                .mapToDouble(ItemBase::getPreco)
                .average()
                .orElse(0.0);
    }

    public Optional<T> itemMaisCaro() {
        return repositorio.buscarTodos().stream()
                .max(Comparator.comparingDouble(ItemBase::getPreco));
    }

    public Optional<T> itemMaisBarato() {
        return repositorio.buscarTodos().stream()
                .min(Comparator.comparingDouble(ItemBase::getPreco));
    }
}
