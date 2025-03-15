package com.aprendizado.java.Polimorfismo.SistemaGerenciamentoDocumentos;

public class DocumentoWord implements Documento {
    private String tituloWord;
    private String conteudo;

    public DocumentoWord(String tituloWord) {
        this.tituloWord = tituloWord;
    }

    @Override
    public void exibir() {
        System.out.println("Documento Word: " + tituloWord);
    }

    @Override
    public void editar(String novoConteudo) {
        conteudo = novoConteudo;
    }

    @Override
    public void imprimir() {
        System.out.println("=".repeat(50));
        System.out.println("Impressão do documento Word: ");
        System.out.println("Conteúdo: ");
        System.out.println(conteudo);
        System.out.println("=".repeat(50));
    }
}
