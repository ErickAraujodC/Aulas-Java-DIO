package com.erick.exercicios.ex_set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class Ex3_SerOrdenacao {
   public static void main(String[] args) {
    Set<Linguagem> minhasLinguagens = new HashSet<>();
    minhasLinguagens.add(new Linguagem( "JavaScript", 1995, "Visual Studio Code"));
    minhasLinguagens.add(new Linguagem("Python", 1991, "PyCharm"));
    minhasLinguagens.add(new Linguagem("Java", 1991, "Eclipse"));

    //a) Ordem de inserção;
    System.out.println("a) Ordem de inserção: ");
    Set<Linguagem> minhasLinguagens2 = new LinkedHashSet<>();
    minhasLinguagens2.add(new Linguagem( "JavaScript", 1995, "Visual Studio Code"));
    minhasLinguagens2.add(new Linguagem("Python", 1991, "PyCharm"));
    minhasLinguagens2.add(new Linguagem("Java", 1991, "Eclipse"));

    for (Linguagem linguagem : minhasLinguagens2) {
        System.out.println(linguagem.getNome() + " - " + linguagem.getLancamento() + " - " + linguagem.getIde());
    }
    System.out.println();

    // b) Ordem natural(nome);
    System.out.println("b) Ordem natural(nome): ");
    Set<Linguagem> minhasLinguagens3 = new TreeSet<>(minhasLinguagens);

    for (Linguagem linguagem : minhasLinguagens3) {
        System.out.println(linguagem.getNome() + " - " + linguagem.getLancamento() + " - " + linguagem.getIde());
    }
    System.out.println();

    // c) Ordem natural(IDE): 
    System.out.println("C) Ordem natural(IDE): ");
    Set<Linguagem> minhasLinguagens4 = new TreeSet<>(new ComparatorIDE());
    minhasLinguagens4.addAll(minhasLinguagens);

    for (Linguagem linguagem : minhasLinguagens4) {
        System.out.println( linguagem.getIde() + " - " + linguagem.getNome() + " - " + linguagem.getLancamento());
    }
    System.out.println();

    // d) Ano de criação e nome;
    System.out.println("d) Ano de criação e nome: ");
    Set<Linguagem> minhasLinguagens5 = new TreeSet<>(new ComparatorLancamentoNome());
    minhasLinguagens5.addAll(minhasLinguagens);

    for (Linguagem linguagem : minhasLinguagens5) {
        System.out.println(linguagem.getLancamento()+ " - " + linguagem.getNome() + " - " + linguagem.getIde());
    }
    System.out.println();

    // e) Nome, ano de criação e IDE;
    System.out.println("d) Ano de criação e nome: ");
    Set<Linguagem> minhasLinguagens6 = new TreeSet<>(new ComparatorNomeLancamentoIde());
    minhasLinguagens6.addAll(minhasLinguagens);

    for (Linguagem linguagem : minhasLinguagens6) {
        System.out.println(linguagem.getNome() + " - " + linguagem.getLancamento() + " - " + linguagem.getIde());
    }
    System.out.println();


   }
    
}

class Linguagem implements Comparable<Linguagem>{
    String nome;
    int lancamento;
    String ide;
    
    public Linguagem(String nome, int lancamento, String ide) {
        this.nome = nome;
        this.lancamento = lancamento;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getLancamento() {
        return lancamento;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + lancamento;
        result = prime * result + ((ide == null) ? 0 : ide.hashCode());
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
        Linguagem other = (Linguagem) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (lancamento != other.lancamento)
            return false;
        if (ide == null) {
            if (other.ide != null)
                return false;
        } else if (!ide.equals(other.ide))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "{ " + nome + " - " + lancamento + " - " + ide+ " }" ;
    }

    @Override
    public int compareTo(Linguagem o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}

class ComparatorIDE implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem o1, Linguagem o2) {
        Integer ide = o1.getIde().compareToIgnoreCase(o2.getIde());
        if(ide != 0) return ide;
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }

}

class ComparatorLancamentoNome implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem o1, Linguagem o2) {
        Integer lancamento = Integer.compare(o1.getLancamento(), o2.getLancamento());
        if(lancamento != 0) return lancamento;
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }

}

class ComparatorNomeLancamentoIde implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem o1, Linguagem o2) {

        Integer nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if(nome != 0) return nome;

        Integer lancamento = Integer.compare(o1.getLancamento(), o2.getLancamento());
        if(lancamento != 0) return lancamento;

        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }

}
