package com.aprendizado.java.Polimorfismo.SistemaGerenciamentoDocumentos;

public class DocumentoPDF implements Documento{
    private String tituloPDF;
    private String conteudo;

    public DocumentoPDF(String tituloPDF) {
        this.tituloPDF = tituloPDF;
    }

    @Override
    public void exibir() {
        System.out.println("Documento PDF: " + tituloPDF);
    }

    @Override
    public void editar(String novoConteudo) {
        conteudo = novoConteudo;
    }

    @Override
    public void imprimir() {
        System.out.println("=".repeat(50));
        System.out.println("Impressão do PDF: ");
        System.out.println("Conteúdo: ");
        System.out.println(conteudo);
        System.out.println("=".repeat(50));
    }
}
