package com.aprendizado.java.POO.dominio.SistemaLojaJogos;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Jogo> jogos;
    private List<Cliente> clientes;

    public Loja(){
        this.jogos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void adicionarJogo(Jogo...newJogos){
        for (Jogo jogo : newJogos){
            jogos.add(jogo);
        }
    }

    public void adicionarCliente(Cliente... newCliente){
        for (Cliente cliente : newCliente){
            clientes.add(cliente);
        }
    }

    public Jogo buscarJogoPorTitulo(String titulo){
        for (Jogo jogo : jogos){
            if (jogo.getTitulo().equals(titulo)) {
                return jogo;
            }
        }
        return null;
    }

    public void listarJogos(){
        System.out.println("=".repeat(50));
        System.out.println("Jogos diponíveis: ");
        for (Jogo jogo : jogos){
            jogo.dadosJogo();
        }
    }
    
    public void listarClientes(){
        System.out.println("-".repeat(50));
        System.out.println("Clientes cadastrados: ");
        for (Cliente cliente : clientes){
            cliente.dadosCliente();
        }
    }

    public void venderJogo(Cliente cliente, Jogo jogo){
        cliente.comprarJogo(jogo);
        Jogo.setTotalDeJogos(Jogo.getTotalDeJogos() - 1);
    }

    public void venderJogo(Cliente cliente, Jogo... jogos){
        for (Jogo jogo : jogos){
            cliente.comprarJogo(jogo);
        }
    }
}
