package com.aprendizado.java.Polimorfismo.SistemaGerenciamentoDocumentos;

public class DocumentoTexto implements Documento{
    private String tituloTexto;
    private String conteudo;

    public DocumentoTexto(String tituloTexto) {
        this.tituloTexto = tituloTexto;
    }

    @Override
    public void exibir() {
        System.out.println("Documento de Texto: " + tituloTexto);
    }

    @Override
    public void editar(String novoConteudo) {
        conteudo = novoConteudo;
    }

    @Override
    public void imprimir() {
        System.out.println("=".repeat(50));
        System.out.println("Impressão do Texto: ");
        System.out.println("Conteúdo: ");
        System.out.println(conteudo);
        System.out.println("=".repeat(50));
    }
}
