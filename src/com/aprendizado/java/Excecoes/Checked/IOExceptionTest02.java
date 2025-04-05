package com.aprendizado.java.Excecoes.Checked;

import java.io.File;
import java.io.IOException;

public class IOExceptionTest02 {
    public static void main(String[] args) {
        try {
            if (criarArquivo()) {
                System.out.println("Arquivo criado com sucesso");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean criarArquivo() throws IOException {
        File arquivo2 = new File("arquivo\\texto2.txt");
        return arquivo2.createNewFile();
    }
}
