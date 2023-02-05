package com.erick.exercicios.ex_listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Ex1_OrdemListas {
    public static void main(String[] args) {
        List<Vara> minhasVaras = new ArrayList<>();
        
        minhasVaras.add(new Vara("Top Carbon", 2.70, "Lumis"));
        minhasVaras.add(new Vara("Albacora", 2.40, "Albatroz"));
        minhasVaras.add(new Vara("Sucuri", 2.40, "Maruri"));

        //Ordenando na ordem de inserção
        System.out.println("<Ordem de inserçao>");
        System.out.println(minhasVaras);
        System.out.println();
        

        //Ordem aleatória
        System.out.println("<Ordem aleatória>");
        Collections.shuffle(minhasVaras);
        System.out.println(minhasVaras);
        System.out.println();

        //Ordem natural
        System.out.println("<Ordem natural>");
        Collections.sort(minhasVaras);
        System.out.println(minhasVaras);
        System.out.println();

        //Ordem de idade
        System.out.println("<Ordem idade>");
        minhasVaras.sort(new ComparatorTamanho());
        System.out.println(minhasVaras);
        System.out.println();

        //Ordem Marca
        System.out.println("<Ordem marca>");
        minhasVaras.sort(new ComparatorMarca());
        System.out.println(minhasVaras);
        System.out.println();

        //Ordem nome/tamanho/marca
        System.out.println("<Ordem nome/tamanho/marca>");
        minhasVaras.sort(new ComparatorNomeTamanhoMarca());
        System.out.println(minhasVaras);
}
}

class Vara implements Comparable<Vara>{
    
    private String nome;
    private double tamanho;
    private String marca;

    public Vara(String nome, double tamanho, String marca) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", tamanho=" + tamanho + ", marca=" + marca + "]";
    }

    @Override
    public int compareTo(Vara vara) {
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(vara.getNome());
    }
}

class ComparatorTamanho implements Comparator<Vara>{

    @Override
    public int compare(Vara o1, Vara o2) {
        return Double.compare(o1.getTamanho(), o2.getTamanho());
    }

}

class ComparatorMarca implements Comparator<Vara>{

    @Override
    public int compare(Vara v1, Vara v2) {
        // TODO Auto-generated method stub
        return v1.getMarca().compareToIgnoreCase(v2.getMarca());
    }
}
class ComparatorNomeTamanhoMarca implements Comparator<Vara>{

    @Override
    public int compare(Vara o1, Vara o2) {
        
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if(nome!=0) return nome;

        int marca = o1.getMarca().compareToIgnoreCase(o2.getMarca());
        if(marca!=0) return marca;

        return Double.compare(o1.getTamanho(), o2.getTamanho());


    }

    

}
