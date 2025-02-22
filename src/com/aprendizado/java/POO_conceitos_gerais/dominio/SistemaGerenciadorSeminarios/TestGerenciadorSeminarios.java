package com.aprendizado.java.POO_conceitos_gerais.dominio.SistemaGerenciadorSeminarios;

public class TestGerenciadorSeminarios {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Glaudencio", 18);
        Aluno aluno2 = new Aluno("Raimundo", 28);
        Aluno aluno3 = new Aluno("Carlos", 15);
        Aluno aluno4 = new Aluno("João", 19);

        Professor professor = new Professor("Geraldo", "Inteligência Artiicial");

        Local local1 = new Local("Teresina");
        Local local2 = new Local("Duque Bacelar");
        Local local3 = new Local("São Paulo");
        Local local4 = new Local("Rio de Janeiro");

        Seminario semi1 = new Seminario("A IA na vida humana");
        Seminario semi2 = new Seminario("Neuroplástica óssea");
        Seminario semi3 = new Seminario("Filogenética");
        Seminario semi4 = new Seminario("A vida das bactérias");

        semi1.adiconarLocalizacao(local1);
        semi2.adiconarLocalizacao(local2);
        semi3.adiconarLocalizacao(local3);
        semi1.adiconarLocalizacao(local4);

        aluno1.adicionarSemininario(semi1);
        aluno2.adicionarSemininario(semi2);
        aluno3.adicionarSemininario(semi3);
        aluno4.adicionarSemininario(semi3);
        //aluno1.exibirDadosAluno();

        semi1.adicionarAluno(aluno3, aluno1,aluno4, aluno2);
        //semi1.exibirDados();

        semi2.adicionarAluno(aluno3, aluno1,aluno4, aluno2);
        //semi2.exibirDados();

        professor.ministrarSeminario(semi2, semi4, semi3, semi1);
        //professor.exibriDados();

    }
}
