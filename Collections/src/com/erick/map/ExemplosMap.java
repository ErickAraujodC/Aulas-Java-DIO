package com.erick.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ExemplosMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<String, Double>() {{
        put("Uno", 16.1);
        put("Gol", 14.0);
        put("Mobi", 16.1);
        put("Hb20", 14.0);
        put("Kwid", 14.0);
        }};    
        System.out.println(carrosPopulares);
        System.out.println();
     
        //Substitua o consumo do gol por 15,2 km/l: 
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);
        System.out.println();

        //Conferindo se o modelo tucson esta no dicionario: 
        System.out.println("O modelo Tucson esta no dicionario: " + carrosPopulares.containsKey("Tucson"));
        System.out.println();

        //Exibindo consumo do Uno
        System.out.println("Exiba o consumo do Uno: "+ carrosPopulares.get("Uno"));
        System.out.println();

        //Exibindo os modelos de todos carros
        System.out.println("Exibindo os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        System.out.println();

        //Exibindo os consumos dos carros
        System.out.println("Exibindo os consumos: ");
        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);
        System.out.println();

        //Exibindo modelo mais economico
        System.out.println("Exibindo modelo e consumo do carro mais economico: ");
        Double melhorConsumo = Collections.max(carrosPopulares.values());
        Set<Entry<String, Double>> entrySet = carrosPopulares.entrySet();
        String modeloMelhorConsumo = "";

        for (Entry<String,Double> entry : entrySet) {
            if(entry.getValue().equals(melhorConsumo)){
                modeloMelhorConsumo = entry.getKey();
                System.out.println("Veiculo mais economico: "+ modeloMelhorConsumo + " - " + melhorConsumo);
            }
        }
        System.out.println();

        //Exibindo modelo menos economico
        System.out.println("Exibindo modelo e consumo do carro mais economico: ");
        Double piorConsumo = Collections.min(carrosPopulares.values());
        Set<Entry<String, Double>> entrySet2 = carrosPopulares.entrySet();
        String modeloPiorConsumo = "";

        for (Entry<String,Double> entry : entrySet2) {
            if(entry.getValue().equals(piorConsumo)){
                modeloPiorConsumo = entry.getKey();
                System.out.println("Veiculo menos economico: "+ modeloPiorConsumo + " - " + piorConsumo);
            }
        }
        System.out.println();

        //Exibindo a soma dos valores

        Iterator<Double> iterator = carrosPopulares.values().iterator();

        Double soma = 0d;

        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("O valor da soma dos valores dos consumo é: "+soma);
        System.out.println();

        //Media dos consumos

        Double media = Math.floor(soma/carrosPopulares.size());
        System.out.println("Exibindo média do consumo: "+media);
        System.out.println();

        //Removendo carros com valor de consumo igua a 15.6
        System.out.println("Remova os modelos com o consumo igual a 15,2 km/l: ");

        Iterator<Double> iterator2 = carrosPopulares.values().iterator();

        while (iterator2.hasNext()) {
            Double next = iterator2.next();

            if(next == 15.2){
                iterator2.remove();
            }
        }
        System.out.println(carrosPopulares);
        System.out.println();
        

        //Exibindo todos carros na ordem de insercao

        Map<String, Double> carrosPopulares2 = new LinkedHashMap<String, Double>(){{
            put("Gol", 14.0);
            put("Uno", 16.1);
            put("Hb20", 14.0);
            put("Kwid", 14.6);
            put("Mobi", 16.1);
        }};

        System.out.println("Exibindo veiculos na ordem de insercao: ");
        System.out.println(carrosPopulares2);
        System.out.println();

        //Exibindo pelo modelo

        System.out.println("Exibindo pela ordem do nome: ");
        Map<Object, Object> carrosPopulares3 = new TreeMap<>(carrosPopulares2);

        System.out.println(carrosPopulares3);
        System.out.println();

        //apagando o dicionario

        System.out.println("Apagando o dicionario carrosPopulares: ");
        carrosPopulares.clear();
        System.out.println();
        
        // Verificando se o dicionario esta vazio
        System.out.println("O dicionario carrosPopulares esta vazio: "+carrosPopulares.isEmpty());
        System.out.println("O dicionario carrosPopulares2 esta vazio: "+carrosPopulares2.isEmpty());
        System.out.println("O dicionario carrosPopulares3 esta vazio: "+carrosPopulares3.isEmpty());

    }
}


