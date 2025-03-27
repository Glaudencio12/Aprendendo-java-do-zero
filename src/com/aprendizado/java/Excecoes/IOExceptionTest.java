package com.aprendizado.java.Excecoes;

import java.io.File;
import java.io.IOException;

public class IOExceptionTest {
    public static void main(String[] args) {
        criarArquivo();
    }
    public static void criarArquivo(){
        File file = new File("arquivo\\texto.txt"); //Cria um novo arquivo dentro da pasta arquivo
        try {
            if (file.createNewFile()) { //Verifica se o arquivo foi criado
                System.out.println("Arquivo criado com sucesso!");
            }
        } catch (IOException e){ //Se o arquivo não tiver sido criado, uma exceção é lançada
            e.printStackTrace();
        }
    }
}
