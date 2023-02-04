package com.erick.exercicios.ex_map.Ex4_Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

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


        Map<Disciplina, Aluno> cursos3 = new TreeMap<Disciplina, Aluno>( new ComparatorDuracao());
        cursos3.putAll(cursos2);

        System.out.println("Cursos: Ordem Nome Duracao");
        for (Map.Entry<Disciplina, Aluno> curso : cursos2.entrySet()) {
            System.out.println("Duracao: " + curso.getKey().getDuracao() + " - Disciplina: " + curso.getKey().getNome() + 
            " - Aluno: "+ curso.getValue().getNome() + " - Matricula: " + curso.getValue().getMatricula());
            System.out.println();
        }


        Set<Entry<Disciplina, Aluno>> cursos4 = new TreeSet<Map.Entry<Disciplina, Aluno>>(new ComparatorNome());
        cursos4.addAll(cursos.entrySet());

        System.out.println("Cursos: Ordem Nome Aluno");
        for (Map.Entry<Disciplina,Aluno> curso : cursos4) {
            System.out.println("Aluno: "+ curso.getValue().getNome() + " - Matricula: " + curso.getValue().getMatricula() +
            " - Duracao: " + curso.getKey().getDuracao() + " - Disciplina: " + curso.getKey().getNome());
            System.out.println();
        }

        
        Set<Map.Entry<Disciplina, Aluno>> cursos5 = new TreeSet<Map.Entry<Disciplina, Aluno>>( new ComparatorMatricula());
        cursos5.addAll(cursos.entrySet());

        System.out.println("Cursos: Ordem Nome Matricula");
        for (Map.Entry<Disciplina,Aluno> curso : cursos5) {
            System.out.println("Matricula: " + curso.getValue().getMatricula() + " - Aluno: "+ curso.getValue().getNome() + 
            " - Duracao: " + curso.getKey().getDuracao() + " - Disciplina: " + curso.getKey().getNome());
            System.out.println();
        }

    }
}

class ComparatorDuracao implements Comparator<Disciplina>{

    @Override
    public int compare(Disciplina o1, Disciplina o2) {
        Integer duracao = Integer.compare(o1.getDuracao(), o2.getDuracao());
        if(duracao!=0) return duracao;

        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }

}


class ComparatorNome implements Comparator<Map.Entry<Disciplina,  Aluno>>{

    @Override
    public int compare(Entry<Disciplina, Aluno> o1, Entry<Disciplina, Aluno> o2) {
        Integer nome = o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
        if(nome!=0) return nome;

        return Integer.compare(o1.getValue().getMatricula(), o2.getValue().getMatricula());
    }

}


class ComparatorMatricula implements Comparator<Map.Entry<Disciplina, Aluno>>{

    @Override
    public int compare(Entry<Disciplina, Aluno> o1, Entry<Disciplina, Aluno> o2) {

        return Integer.compare(o1.getValue().getMatricula(), o2.getValue().getMatricula());
    }

}