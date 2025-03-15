package com.aprendizado.java.Polimorfismo.SistemaGerenciamentoDocumentos;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDocumentos {
    private List<Documento> listDocumentos;

    public GerenciadorDocumentos() {
        this.listDocumentos = new ArrayList<>();
    }

    public void adiconarDocumento(Documento documento) {
        listDocumentos.add(documento);
    }

    public void exibirDocumentos() {
        for (Documento documento : listDocumentos) {
            documento.exibir();
        }
    }

    public void editarDocumentos(int index, String novoConteudo){
        if (index < listDocumentos.size() && index >= 0) {
            listDocumentos.get(index).editar(novoConteudo);
        }else{
            System.out.println("Documento não encontrado!");
        }
    }

    public void imprimirDocumentos(){
        for (Documento documento : listDocumentos){
            documento.imprimir();
        }
    }
}