package com.aprendizado.java.Excecoes.Checked;

import java.io.File;
import java.io.IOException;

public class IOExceptionTest {
    public static void main(String[] args) {
        criarArquivo();
    }
    public static void criarArquivo(){
        File file = new File("arquivo\\texto.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Arquivo criado com sucesso!");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
