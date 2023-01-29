package com.erick.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
    //for (Double nota : notas) System.out.println(nota);

    //get() usamos para passar um posicao e recebemos o elemento
    System.out.println("Exibindo o terceiro elemento da lista: ");
    System.out.println(notas.get(2));

    //Collections.min(notas) retornará o menor valor dentro da lista
    //Collections.max(notas) retornará o maior valor dentro da lista
    
    System.out.println("Retornando o menor valor na lista: " + Collections.min(notas));
    System.out.println("Retornando o maior valor na lista: " + Collections.max(notas));

    //iterator, metodo que auxiliar a somar itens na lista 
    Iterator<Double> iterator = notas.iterator();

    double soma = 0d;
    while(iterator.hasNext()){
        double next = iterator.next();
        soma += next;
    }
    System.out.println("Valor da soma de todos os valores da lista: "+soma);

    //a variavel cont vai retornar o valor de itens dentro da lista notas 


    //size() size  o valor selecionado no parametro da lista
    System.out.println("A média das notas na lista é: "+(soma/notas.size()));

    //remove() remove o valor selecionado no parametro da lista, remove o valor ou o indice 
    
    System.out.println("Removendo o valor 11.0 da lista: ");
    notas.remove(11d);
    System.out.println(notas);

    System.out.println("Removendo item da posicao 1 da lista: ");
    notas.remove(1);
    System.out.println(notas);

    /* com a ajuda do iterator, e de uma laco while, podemos 
    remover item condicionalmente de determinada lista, como no exemplo a baixo  */

    Iterator<Double> iterator1 = notas.iterator();

    while(iterator1.hasNext()){
        double next = iterator1.next();
        
        if(next<3) iterator1.remove();
    }
    System.out.println(notas);

    //clear() remove todos os itens de uma lista
    notas.clear();
    System.out.println("Todos dados da lista foram removidos: "+notas);

    //isEmpty() retorna um boolean se a lista estiver vazia

    System.out.println("A lista esta vazia: "+ notas.isEmpty());
}   
}