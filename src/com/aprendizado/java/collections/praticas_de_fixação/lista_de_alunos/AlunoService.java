package com.aprendizado.java.collections.praticas_de_fixação.lista_de_alunos;

import java.util.*;

public class AlunoService {
    List<Aluno> alunosList =  new ArrayList<>(5);
    NavigableSet<Aluno> alunoNavigableSet = new TreeSet<>(Comparator.comparing(Aluno::getIdade));

    public void adicionarAluno(Aluno aluno){
        alunosList.add(aluno);
        alunoNavigableSet.add(aluno);
    }

    public List<Aluno> visualizarAlunos(){
        return alunosList;
    }

    public List<Aluno> visualizarAlunosOrdenadosPorNome(){
        Collections.sort(alunosList);
        return visualizarAlunos();
    }

    public List<Aluno> visualizarAlunosOrdenadosPorNota(){
        alunosList.sort(Comparator.comparingDouble(Aluno::getIdade));
        return visualizarAlunos();
    }

    public Aluno buscarAluno(String nome){
        Aluno chave = new Aluno(nome, 0, 0.0);
        Aluno aluno;
        visualizarAlunosOrdenadosPorNome();
        int index = Collections.binarySearch(alunosList, chave);
        if (index >= 0) {
            aluno = alunosList.get(index);
        }else {
            return null;
        }
        return aluno;
    }

    public Aluno[] converterListaParaArray(){
        return alunosList.toArray(new Aluno[0]);
    }

    public List<Aluno> converterArrayParaList(){
        List<Aluno> alunoArrayList = new ArrayList<>(Arrays.asList(converterListaParaArray()));
        return alunoArrayList;
    }
}
