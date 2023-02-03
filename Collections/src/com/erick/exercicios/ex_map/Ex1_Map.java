package com.erick.exercicios.ex_map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ex1_Map {

    public static void main(String[] args) {
        Map<String, Livro> meusLivros = new HashMap<String, Livro>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("Lições Para o Século 21", 432));
        }};

        //Ordem de insercao
        System.out.println("Ordem de aletorio: ");
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - Livro: " + livro.getValue());
        }System.out.println();

        //Ordem de insercao 
        Map<String, Livro> meusLivros2 = new LinkedHashMap<String, Livro>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("Lições Para o Século 21", 432));
        }};

        System.out.println("Ordem de inserção: ");
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - Livro: " + livro.getValue());
            
        }
        System.out.println();

        //Ordem alfabetica de autores

        System.out.println("Ordem alfabetica de autores: ");
        Map<String, Livro> meusLivros3 = new TreeMap<>();
        meusLivros3.putAll(meusLivros2);

        for (Map.Entry<String, Livro> livro : meusLivros3.entrySet()) {
            System.out.println(livro.getKey() + " - Livro:" + livro.getValue());
        }
        System.out.println();


        // Ordem alfabetica por nome do livro: 
        System.out.println("Ordem alfabética por nome: ");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNomeLivro());
        meusLivros4.addAll(meusLivros3.entrySet());
        
        for (Map.Entry<String, Livro> livro : meusLivros4) {
            System.out.println("Nome: "+livro.getValue().getNome() + " - Paginas: " + livro.getValue().getPaginas() +  " - Autor: " + livro.getKey());
        }
        System.out.println();

        //Ordem de numero de paginas
        // Ordem alfabetica por nome do livro: 
        System.out.println("Ordem por quantidade de paginas: ");
        Set<Map.Entry<String, Livro>> meusLivros5 = new TreeSet<>(new ComparatorPaginasNome());
        meusLivros5.addAll(meusLivros3.entrySet());
        
        for (Map.Entry<String, Livro> livro : meusLivros5) {
            System.out.println("Paginas: " + livro.getValue().getPaginas() +  " - Nome: "+livro.getValue().getNome() +" - Autor: " + livro.getKey());
        }
    }
}

class Livro implements Comparable<Livro>{
    private String nome;
    private int paginas;
    
    public Livro(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + paginas;
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
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas != other.paginas)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[ " + nome + " - " + paginas + " ]";
    }

    @Override
    public int compareTo(Livro o) {
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}

class ComparatorNomeLivro implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {        
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }   
}

class ComparatorPaginasNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        
        Integer paginas = Integer.compare(o1.getValue().getPaginas(), o2.getValue().getPaginas());
        if(paginas != 0) return paginas;

        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }

}