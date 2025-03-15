package com.aprendizado.java.Polimorfismo.SistemaGerenciamentoDocumentos;

public class Main {
    public static void main(String[] args) {
        GerenciadorDocumentos gerenciadorDocumentos = new GerenciadorDocumentos();
        DocumentoPDF pdf = new DocumentoPDF("O mundo e suas imperfeições");
        DocumentoTexto texto = new DocumentoTexto("Lista de compras");
        DocumentoWord word = new DocumentoWord("Relação de alunos");

        gerenciadorDocumentos.adiconarDocumento(pdf);
        gerenciadorDocumentos.adiconarDocumento(word);
        gerenciadorDocumentos.adiconarDocumento(texto);

        gerenciadorDocumentos.exibirDocumentos();

        gerenciadorDocumentos.editarDocumentos(0, "ngegngnegoingorngiengneroingenegnegnooeri");
        gerenciadorDocumentos.editarDocumentos(1, "nfinfiwefewjfnewjfnewfnejifiewfnewifnjneifn");
        gerenciadorDocumentos.editarDocumentos(2, "rgnerinfwefnenfiofnoiewfneiowfniewnfiewnfik");

        gerenciadorDocumentos.imprimirDocumentos();
    }
}
