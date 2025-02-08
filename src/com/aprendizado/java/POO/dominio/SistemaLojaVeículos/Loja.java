package com.aprendizado.java.POO.dominio.SistemaLojaVeículos;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private static int countVeiculos;
    private List<Veiculo> veiculos;

    static {
        countVeiculos = 0;
    }

    public Loja(){
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
        Loja.countVeiculos++;
    }

    public void removerVeiculo(Veiculo veiculo){
        veiculos.remove(veiculo);
        Loja.countVeiculos--;
    }

    public Veiculo procurarVeiculoPeloModelo(String modelo){
       for (Veiculo veiculo : veiculos){
           if (veiculo.getModelo().equals(modelo)) {
               return veiculo;
           }
       }
       return null;
    }

    public void exibriVeiculos(){
        for (Veiculo veiculo : veiculos){
            veiculo.exibirDetalhes();
            System.out.println("-".repeat(50));
        }
    }

    public static int mostarTotalVeiculos(){
        return Loja.countVeiculos;
    }

    public static void exibirHorarioDeFuncionamento() {
        System.out.println("A loja está aberta de segunda a sábado das 8h às 20h.");
    }
}
