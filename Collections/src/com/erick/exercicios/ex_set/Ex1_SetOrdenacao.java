package com.erick.exercicios.ex_set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex1_SetOrdenacao {
    public static void main(String[] args) {
        
        Set<Filme> filmes = new HashSet<>();
        filmes.add(new Filme("Harry Poter", "J. K. Rowling", 2001));
        filmes.add(new Filme("Titanic", "James Cameron", 1997));
        filmes.add(new Filme("Velozes e Furiosos", "Gary Scott Thompson", 2001));
        filmes.add(new Filme("Maze Runner", "James Dashner", 2014));
        filmes.add(new Filme("Avatar", "James Cameron", 2009));
        

        //Exibindo em ordem aleatória
        System.out.println("Exibindo filmes em ordem aleatória: ");
        for(Filme filme : filmes){
            System.out.println(filme.getNome() + " - " + filme.getDiretor() + " - " + filme.getLancamento());
        }
        System.out.println();


        //Exibindo na ordem de inserçao
        System.out.println("Exibindo filmes em ordem de Insercao: ");
        Set<Filme> filmes2 = new LinkedHashSet<>();
        filmes2.add(new Filme("Titanic", "James Cameron", 1997));
        filmes2.add(new Filme("Velozes e Furiosos", "Gary Scott Thompson", 2001));
        filmes2.add(new Filme("Maze Runner", "James Dashner", 2014));
        filmes2.add(new Filme("Harry Poter", "J. K. Rowling", 2001));
        filmes2.add(new Filme("Avatar", "James Cameron", 2009));

        for(Filme filme : filmes2){
            System.out.println(filme.getNome() + " - " + filme.getDiretor() + " - " + filme.getLancamento());
        }
        System.out.println();

        //Ordem natural
        System.out.println("Exibindo na ordem natural: ");
        Set<Filme> filmes3 = new TreeSet<>(filmes);
        for(Filme filme : filmes3){
            System.out.println(filme.getNome() + " - " + filme.getDiretor() + " - " + filme.getLancamento());
        }
        System.out.println();

        System.out.println("Exibindo na ordem de lancamento: ");
        Set<Filme> filmes4 = new TreeSet<>(new ComparatorLancamento());
        filmes4.addAll(filmes);
        for(Filme filme : filmes4){
            System.out.println(filme.getLancamento() + " - " + filme.getNome() + " - " + filme.getDiretor());
        }
        System.out.println();

        System.out.println("Exibindo na ordem de Diretor/Nome/Lancamento: ");
        Set<Filme> filmes5 = new TreeSet<>(new ComparatorDiretorNomeLancamento());
        filmes5.addAll(filmes);
        for(Filme filme : filmes5){
            System.out.println(filme.getDiretor() + " - " + filme.getNome() + " - " + filme.getLancamento());
        }
        System.out.println();

    }
}

class Filme implements Comparable<Filme>{
    String nome;
    String diretor;
    int lancamento;


    public Filme(String nome, String diretor, int lancamento) {
        this.nome = nome;
        this.diretor = diretor;
        this.lancamento = lancamento;
    }


    public String getNome() {
        return nome;
    }


    public String getDiretor() {
        return diretor;
    }


    public int getLancamento() {
        return lancamento;
    }


    @Override
    public int compareTo(Filme o) {

        return this.getNome().compareToIgnoreCase(o.getNome());
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((diretor == null) ? 0 : diretor.hashCode());
        result = prime * result + lancamento;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Filme other = (Filme) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (diretor == null) {
            if (other.diretor != null)
                return false;
        } else if (!diretor.equals(other.diretor))
            return false;
        if (lancamento != other.lancamento)
            return false;
        return true;
    }

}

class ComparatorLancamento implements Comparator<Filme>{

    @Override
    public int compare(Filme o1, Filme o2) {
        Integer lanc = Integer.compare(o1.getLancamento(), o2.getLancamento());
        if(lanc != 0) return lanc;

        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }

}


class ComparatorDiretorNomeLancamento implements Comparator<Filme>{

    @Override
    public int compare(Filme o1, Filme o2) {

        Integer diretor = o1.getDiretor().compareTo(o2.getDiretor());
        if(diretor!=0) return diretor;

        Integer nome = o1.getNome().compareTo(o2.getNome());
        if(nome!=0) return nome;

        return Integer.compare(o1.getLancamento(), o2.getLancamento()); 

    }

}
