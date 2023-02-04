package com.erick.exercicios.ex_map.Ex4_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex4_Map {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Erick", 100);
        Aluno aluno2 = new Aluno("Gislaine", 101);
        Aluno aluno3 = new Aluno("Henrique", 102);

        Disciplina disciplina1 = new Disciplina("Matematica", 60);
        Disciplina disciplina2 = new Disciplina("Biologia", 40);
        Disciplina disciplina3 = new Disciplina("Historia", 50);

        Map<Disciplina, Aluno> cursos = new HashMap<Disciplina, Aluno>(){{
            put(disciplina3, aluno3);
            put(disciplina2, aluno2);
            put(disciplina1, aluno1);
        }};

        System.out.println("Cursos: Ordem Aleatoria");
        for (Map.Entry<Disciplina, Aluno> curso : cursos.entrySet()) {
            System.out.println("Disciplina: " + curso.getKey().getNome() + " - Duracao: " + curso.getKey().getDuracao() +
            " - Aluno: "+ curso.getValue().getNome() + " - Matricula: " + curso.getValue().getMatricula());
            System.out.println();
        }

        Map<Disciplina, Aluno> cursos2 = new TreeMap<Disciplina, Aluno>(){{
            put(disciplina3, aluno3);
            put(disciplina1, aluno1);
            put(disciplina2, aluno2);
        }};


        System.out.println("Cursos: Ordem Nome Disciplina");
        for (Map.Entry<Disciplina, Aluno> curso : cursos2.entrySet()) {
            System.out.println("Disciplina: " + curso.getKey().getNome() + " - Duracao: " + curso.getKey().getDuracao() +
            " - Aluno: "+ curso.getValue().getNome() + " - Matricula: " + curso.getValue().getMatricula());
            System.out.println();
        }
    }
}
