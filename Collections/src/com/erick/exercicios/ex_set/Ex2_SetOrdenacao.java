package com.erick.exercicios.ex_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class Ex2_SetOrdenacao {
    public static void main(String[] args) {
        Set<String> arcoIris = new HashSet<>();
        arcoIris.add("Vermelho");
        arcoIris.add("Laranja");
        arcoIris.add("Amarelo");
        arcoIris.add("Verde");
        arcoIris.add("Azul");
        arcoIris.add("Anil");
        arcoIris.add("Violeta");

        // a) Exiba todas as cores o arco-íris uma abaixo da outra;
    
        System.out.println("a) Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cor : arcoIris) {
            System.out.println(cor);
        }
        System.out.println();

        // b) A quantidade de cores que o arco-íris tem;
        System.out.println("b) Exiba a quantidade de cores que o arco-íris tem: " + arcoIris.size());
        System.out.println();

        // c) Exiba as cores em ordem alfabética;
        System.out.println("c) Exiba as cores em ordem alfabética: ");
        Set<String> arcoIris2 = new TreeSet<>(arcoIris);
        for (String cor : arcoIris2) {
            System.out.println(cor);
        }
        System.out.println();

        // d) Exiba as cores na ordem inversa da que foi informada;
        System.out.println("d) Exiba as cores na ordem inversa da que foi informada: ");
        Set<String> arcoIris3 = new LinkedHashSet<>();
        arcoIris3.add("Vermelho");
        arcoIris3.add("Laranja");
        arcoIris3.add("Amarelo");
        arcoIris3.add("Verde");
        arcoIris3.add("Azul");
        arcoIris3.add("Anil");
        arcoIris3.add("Violeta");

        System.out.println(arcoIris3);
        System.out.println();

        List<String> arcoIris3Reverse = new ArrayList<>(arcoIris3);
        Collections.reverse(arcoIris3Reverse);
        System.out.println("Arco iris inverso: ");
        System.out.println(arcoIris3Reverse);
        System.out.println();

        // e) Exiba todas as cores que começam com a letra ”v”;
        System.out.println("e) Exiba todas as cores que começam com a letra --v--: ");
        
        for (String cor : arcoIris) {
            if(cor.startsWith("V")||cor.startsWith("v")){
                System.out.println(cor);
            }
        }
        System.out.println();
    
        // f) Remova todas as cores que não começam com a letra “v”;
        System.out.println("f) Remova todas as cores que não começam com a letra --v--: ");
        
        Iterator<String> iterator = arcoIris.iterator();

        while(iterator.hasNext()){
            String next = iterator.next();

            if(!(next.startsWith("V"))){
                iterator.remove();
            }
        }
        
        for (String cor : arcoIris) {
            System.out.println(cor);
        }
        System.out.println();

        // g) Limpe o conjunto;
        System.out.println("g) Limpe o conjunto: ");
        arcoIris.clear();
        System.out.println(arcoIris);
        System.out.println();

        // h) Confira se o conjunto está vazio;
        System.out.println("h) Confira se o conjunto arcoIris está vazio: "+ arcoIris.isEmpty());
        System.out.println("   Confira se o conjunto arcoIris2 está vazio: "+ arcoIris2.isEmpty());
        System.out.println("   Confira se o conjunto arcoIris3 está vazio: "+ arcoIris3.isEmpty());
        System.out.println("   Confira se o conjunto arcoIris3Reverse está vazio: "+ arcoIris3Reverse.isEmpty());

    }
}
