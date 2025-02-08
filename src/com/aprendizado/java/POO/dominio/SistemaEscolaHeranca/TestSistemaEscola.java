package com.aprendizado.java.POO.dominio.SistemaEscolaHeranca;

public class TestSistemaEscola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Glaudencio", "95995959",18, "Rua 2, bairro Sucesso", "484uf");
        Aluno aluno2 = new Aluno("Raimundo", "95695959",17, "Rua 8, bairro Sucesso", "484if");

        Professor prof1 = new Professor("Carlos", "9499494", 34, "Rua 1, ponte seca", "40994949");

        prof1.addDisciplina("História", "Geografia", "Matemática", "Filosofia");
        //prof1.exibirDados();

        aluno1.adicionarNotas(10,9,8);
        aluno2.adicionarNotas(5,8,9);
        //aluno1.exibirDados();
        //aluno2.calcularMedia();

        Escola escola = new Escola("Barreto");
        escola.addProfessor(prof1);
        //escola.listarProf();

        escola.addAluno(aluno2);
        escola.addAluno(aluno1);
        //escola.listarAluno();

    }
}
