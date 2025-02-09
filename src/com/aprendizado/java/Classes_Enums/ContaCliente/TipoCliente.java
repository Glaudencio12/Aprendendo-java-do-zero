package com.aprendizado.java.Classes_Enums.ContaCliente;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int id;
    private String nome;

    TipoCliente(int pf, String nome) {
        this.id = pf;
        this.nome = nome;
    }

    public static int buscarIdPorNomeRelatori(String nome){
        for (TipoCliente tipoCliente : TipoCliente.values()){
            if (tipoCliente.nome.equals(nome)) {
                return tipoCliente.getId();
            }
        }
        return 0;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
