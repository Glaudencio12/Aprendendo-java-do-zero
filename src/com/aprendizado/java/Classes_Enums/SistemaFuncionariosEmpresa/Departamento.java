package com.aprendizado.java.Classes_Enums.SistemaFuncionariosEmpresa;

public enum Departamento {
    TI("Tecnologia da Informação"),
    RH("Recursos Humanos"),
    FINANCEIRO("Financeiro"),
    MARKETING("Marketing e Publicidade");

    private String nomeDepartamento;

    Departamento(String nomeDepartamento){
        this.nomeDepartamento = nomeDepartamento;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }
}
