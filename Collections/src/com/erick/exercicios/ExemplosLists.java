package com.erick.exercicios;

import java.util.ArrayList;
import java.util.List;

public class ExemplosLists{
public static void main(String[] args) {
    List<Double> notas = new ArrayList<Double>();
    //add() adiciona um item a lista
    System.out.println("Criando lista e adicionando 4 notas: ");
    notas.add(2.3);
    notas.add(3.5);
    notas.add(5d);
    notas.add(4.1);
    notas.add(6d);

    //indexOf(x) retorna um int da posiçao do item x dentro da lista 
    System.out.println("Retornando a posicao do valor 5.0 da lista: "+ notas.indexOf(5d)); 


    //add(index, value) adiciona na posicao index o valor value
    //esse metodo nao substituo o valor existente, ele apenas empurra uma casa pra frente todos valores subsequentes
    System.out.println("Adicionando na posicao 3 o valor 8.0");
    notas.add(3, 8d);
    System.out.println(notas);

    //set() faz uma substituicao de valores
    System.out.println("Substituindo o valor 5.0 por 6.0");
    notas.set(notas.indexOf(5d), 11d);
    System.out.println(notas);

    //contains() retorna se determinado valor consta na lista, ele retorna um boolean
    System.out.println("Confira se a nota 5.0 conta na lista: "+notas.contains(5d));
    
    System.out.println("Exibindo todos os valores na ordem informada: ");
    for (Double nota : notas) System.out.println(nota);
}   
}