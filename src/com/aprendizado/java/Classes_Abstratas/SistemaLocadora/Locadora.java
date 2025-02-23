package com.aprendizado.java.Classes_Abstratas.SistemaLocadora;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private static final int LIMITE_VEICULOS = 10;
    private List<Veiculo> veiculos;
    private int contador;

    public Locadora(){
        this.veiculos = new ArrayList<>();
        contador = 0;
    }

    public void adicionarVeiculos(Veiculo veiculo){
        if (contador < 10) {
            this.veiculos.add(veiculo);
            contador = this.veiculos.size();
        }else{
            System.out.println("A locadora está lotada!");
        }
    }

    public void adicionarVeiculos(Veiculo...veiculos){
        for (Veiculo veiculo : veiculos){
            if (contador < 10) {
                this.veiculos.add(veiculo);
            }else{
                System.out.println("A locadora está lotada!");
                break;
            }
        }
    }

    public void listarVeiculos(){
        for (Veiculo veiculo : this.veiculos){
            System.out.println(veiculo.toString());
        }
    }
}
