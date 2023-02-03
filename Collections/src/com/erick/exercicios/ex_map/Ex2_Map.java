package com.erick.exercicios.ex_map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Ex2_Map {
    public static void main(String[] args) {
        Map<String, Integer> estados = new HashMap<String, Integer>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE",  9187103);
            put("RN", 3534265);
        }};

        for (Map.Entry<String, Integer> estado : estados.entrySet()) {
        System.out.println("Estado: " +estado.getKey() + " - Populacao: " + estado.getValue());
        }
        System.out.println();


        System.out.println("Substitua a população do estado RN por : 3.534.165");
        estados.put("RN", 3534165);

        for (Map.Entry<String, Integer> estado : estados.entrySet()) {
            System.out.println("Estado: " +estado.getKey() + " - Populacao: " + estado.getValue());
        }
        System.out.println();


        System.out.println("Confira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione PB - 4.039.277: ");
        if(!(estados.containsKey("PB"))) estados.put("PB", 4039277);

        for (Map.Entry<String, Integer> estado : estados.entrySet()) {
            System.out.println("Estado: " +estado.getKey() + " - Populacao: " + estado.getValue());
        }
        System.out.println();

        
        System.out.println("Exiba a população do estado PE: " + estados.get("PE"));
        System.out.println();


        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> estados2 = new LinkedHashMap<String, Integer>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE",  9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};

        for (Map.Entry<String, Integer> estado : estados2.entrySet()) {
            System.out.println("Estado: " +estado.getKey() + " - Populacao: " + estado.getValue());
        }
        System.out.println();


        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> estados3 = new TreeMap<>(estados2);

        for (Map.Entry<String, Integer> estado : estados3.entrySet()) {
            System.out.println("Estado: " +estado.getKey() + " - Populacao: " + estado.getValue());
        }
        System.out.println();

        //Exibir estado com maior e menor populacao

        Collection<Integer> populacao = estados2.values();

        String nomeMaiorPopulacao = "";
        String nomeMenorPopulacao = "";

        Integer maiorPopulacao = Collections.max(populacao);
        Integer menorPopulacao = Collections.min(populacao);

        Set<Entry<String, Integer>> entrySet = estados2.entrySet();

        System.out.println("Estado com maior populacao: ");

        for (Entry<String,Integer> entry : entrySet) {
            if(entry.getValue().equals(maiorPopulacao)) {
                nomeMaiorPopulacao = entry.getKey();
                System.out.println("Estado: " + nomeMaiorPopulacao + " - Populacao: " + maiorPopulacao);
            }
        } 
        System.out.println();

        System.out.println("Estado com menor populacao: ");

        for (Entry<String,Integer> entry : entrySet) {
            if(entry.getValue().equals(menorPopulacao)) {
                nomeMenorPopulacao = entry.getKey();
                System.out.println("Estado: " + nomeMenorPopulacao + " - Populacao: " + menorPopulacao);
            }

        }
        System.out.println();


        int soma = 0;
        Iterator<Integer> iterator = populacao.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();

            soma += next;
        }

        System.out.println("Exiba a soma da população desses estados: " + soma);
        System.out.println();

        
        System.out.println("Exiba a média da população deste dicionário de estados: " + (soma / estados2.size()));
        System.out.println();


        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        
        Iterator<Integer> iterator2 = estados2.values().iterator();

        while (iterator2.hasNext()) {
            Integer next = iterator2.next();

            if(next < 4000000) iterator2.remove();
        }

        for (Map.Entry<String, Integer> estado : estados2.entrySet()) {
            System.out.println("Estado: " +estado.getKey() + " - Populacao: " + estado.getValue());
        }
        System.out.println();

        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        estados.clear();
        System.out.println(estados);
        System.out.println();


        System.out.println("Confira se a lista estados está vazia: " + estados.isEmpty());
        System.out.println("Confira se a lista estados2 está vazia: " + estados2.isEmpty());
        System.out.println("Confira se a lista estados3 está vazia: " + estados3.isEmpty());




        







        
        

        


        
    }

}


