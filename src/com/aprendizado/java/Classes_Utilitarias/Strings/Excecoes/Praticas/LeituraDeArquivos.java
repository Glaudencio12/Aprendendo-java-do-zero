package com.aprendizado.java.Classes_Utilitarias.Strings.Excecoes.Praticas;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class LeituraDeArquivos {
    public static void main(String[] args) throws FileNotFoundException{
        String nome = "arquivo.txt"; // Coloque "arquivo_inexistente.txt" para gerar uma  FileNotFoundException
        try {
            List<String> dados = lerDadosArquivo(nome);
            for (String linha : dados){
                System.out.println("Processando: " + linha.toUpperCase());
            }
        }catch (FileNotFoundException e){
            System.err.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }catch (NullPointerException e){
            System.err.println("Erro: Arquivo incompleto");
            e.printStackTrace();
        }finally {
            System.out.println("Processo de leitura do arquivo finalizado");
        }
    }

    public static List<String> lerDadosArquivo(String nome) throws FileNotFoundException{
        List<String> arquivo = new ArrayList<>();
        if (nome.equals("arquivo_inexistente.txt")) {
            throw new FileNotFoundException("Arquivo não encontrado");
        }
        arquivo.add("Linha 1");
        arquivo.add("Linha 2");
        arquivo.add(null);
        return arquivo;
    }
}
