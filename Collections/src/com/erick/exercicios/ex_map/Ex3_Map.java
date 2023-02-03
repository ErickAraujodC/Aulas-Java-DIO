package com.erick.exercicios.ex_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Ex3_Map {
    public static void main(String[] args) {
        int qntLancamentos = 100;
        Random random = new Random();

        List<Integer> valores = new ArrayList<>();
        
        for (int i = 0; i < qntLancamentos; i++) {
            int lancamento = random.nextInt(6) + 1;
            valores.add(lancamento);
        }

        Map<Integer, Integer> lancamentos = new HashMap<>();
        int cont = 1;
        for (Integer lancamento : valores) {
            
              
            
        }
        
        System.out.println("Cada resultado em um dado lancado 100 vezes: ");
        for (Map.Entry<Integer, Integer> valor : lancamentos.entrySet()) {
            System.out.println(valor.getKey() + " = " + valor.getValue());
        }
      
    }
}

