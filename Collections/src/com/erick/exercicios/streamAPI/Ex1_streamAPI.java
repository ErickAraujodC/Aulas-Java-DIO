package com.erick.exercicios.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;


public class Ex1_streamAPI {
    public static void main(String[] args) {
        List<String> numerosStr = Arrays.asList(
            "1", "0", "4", "1", "2", "3", "9", "9", "6", "5"
        );

        System.out.println("Teste");
        System.out.println(numerosStr);

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosStr.forEach(System.out::println);
        System.out.println();
        
        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");

        Set<String> numeros5Str = numerosStr.stream()
        .limit(5)
        .collect(Collectors.toSet());

        numeros5Str.forEach(System.out::println);
        System.out.println();

        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        List<Integer> numerosInt = numerosStr.stream().
        map(Integer::parseInt)
        .collect(Collectors.toList());

        numerosInt.forEach(System.out::println);
        System.out.println();

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");

        
        List<Integer> numerosPares = numerosInt.stream()
        .filter(n -> n % 2 == 0 && n > 2)
        .collect(Collectors.toList());

        numerosPares.forEach(System.out::println);
        System.out.println();

        System.out.println("Mostre a média dos números: ");

        numerosStr.stream().mapToInt(Integer::parseInt)
        .average()
        .ifPresent(System.out::println);
        System.out.println();


        // System.out.println("Remova os valores imapares: ");

        // numerosInt.removeIf(integer -> {
        //     if(integer % 2 != 0) return true;

        //     return false;
        // });

        // numerosInt.forEach(System.out::println);
        // System.out.println();


        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosStr.stream().map(Integer::parseInt).skip(3).forEach(System.out::println);
        System.out.println();

        System.out.println("Retirando os números repetidos da lista, quantos números ficam: " );
        long numerosRestantes = numerosStr.stream().mapToInt(Integer::parseInt).distinct().count();

        System.out.println(numerosRestantes);
        System.out.println();

        System.out.print("Mostre o menor valor da lista: " );
        numerosStr.stream().mapToInt(Integer::parseInt).min().ifPresent(System.out::println);
        System.out.println();

        System.out.print("Mostre o maior valor da lista: ");
        numerosStr.stream().mapToInt(Integer::parseInt).max().ifPresent(System.out::println);
        System.out.println();

        System.out.println("Pegue apenas os números pares e some: ");
        int somaPares = numerosStr.stream().mapToInt(Integer::parseInt).filter(n -> n % 2 == 0).sum();
        System.out.println(somaPares);
        System.out.println();


        System.out.println("Mostre a lista na ordem númerica: ");
        numerosStr.stream().sorted().forEach(System.out::println);
        System.out.println();


        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5: ");
        
        Map<Boolean, List<Integer>>  numerosAgrupados3e5 = numerosInt.stream().collect(Collectors.groupingBy(n -> (n % 3 == 0 || n % 5 == 0 )));
        for (Map.Entry<Boolean, List<Integer>> numero : numerosAgrupados3e5.entrySet()) {
            System.out.println(numero);
        }
    }
    

}
