package com.erick.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemplosSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 7d, 4.5, 0d, 3.2));
        System.out.println(notas);
        System.out.println();

        //Verificando se conta a nota 3.2 no conjunto
        System.out.println("Existe a nota 3.2 no conjunto: " + notas.contains(3.2));
        System.out.println();

        //Exibindo menor nota
        System.out.println("Exibindo a menor nota do conjunto: "+ Collections.min(notas));
        System.out.println();

        //Exibindo a maior nota
        System.out.println("Exibindo a maior nota do conjunto: "+ Collections.max(notas));
        System.out.println();

        Iterator<Double> iterator = notas.iterator();

        double soma = 0d;

        while(iterator.hasNext()){
            Double next = iterator.next();

            soma += next;
        }

        //Exibindo soma dos valores no conjunto
        System.out.println("Soma dos valores: "+soma);
        System.out.println();

        //Exibindo a média dos valores
        double media = soma / notas.size();
        System.out.println("A média dos valores é: "+ media);

        //Removendo a nota 0.0 do conjunto
        notas.remove(0.0);
        System.out.println("Exibindo conjunto com nota 0.0 removida: "+notas);

        //Removendo todas as notas menores que 5

        Iterator<Double> iterator2 = notas.iterator();

        while(iterator2.hasNext()){
            double next = iterator2.next();

            if(next<5) iterator2.remove();
        }

        System.out.println("Removendo todas as notas menores que 5: "+notas);
        System.out.println();

        //Notas 2
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8d, 2.3, 2.5, 7d));


        //Exibindo as notas na ordem que foram inseridas
        System.out.println("Exibindo as notas na ordem que foram inseridas: ");
        System.out.println(notas2);
        System.out.println();

        //Exibindo as notas na ordem crescente
        //Criando a nota3 e passando como argumento a nota2
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println("Exibindo as notas na ordem crescente: ");
        System.out.println(notas3);

        //Apagando um conjunto todo
        notas.clear();
        System.out.println("Apagando todos os valores do conjunto notas e o retornando: ");
        System.out.println(notas);

        //Verificando se o conjunto esta vazio
        System.out.println("O conjunto notas esta vazio: "+notas.isEmpty());
        System.out.println("O conjunto notas2 esta vazio: "+notas2.isEmpty());
        System.out.println("O conjunto notas3 esta vazio: "+notas3.isEmpty());
    }
}
