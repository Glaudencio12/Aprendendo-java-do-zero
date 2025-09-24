package com.aprendizado.java.collections.praticas_de_fixação.AtendimentoBancario;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Banco {
    Queue<Cliente> clientes = new PriorityQueue<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.offer(cliente);
    }

    public Cliente chamarCliente() {
        return clientes.poll();
    }

    public void filaCompleta() {
        System.out.println("================ Fila de espera ================");
        for (Cliente cliente : clientes) {
            System.out.print(cliente.toString());
        }
    }

    public void filaDevips() {
        for (Cliente cliente : clientes) {
            if (cliente.getTipo().equals("VIP")) {
                System.out.println(cliente);
            }
        }
    }

    public void filaDeNormais() {
        for (Cliente cliente : clientes) {
            if (cliente.getTipo().equals("NORMAL")) {
                System.out.println(cliente);
            }
        }
    }
}
