package com.erick.exercicios;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorEMedia {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            //Recebendo os 5 valores
            System.out.print("Digite " + i + "° valor: ");
            numeros.add(scan.nextInt());
        }
        
        //obtendo soma e média
        int soma = numeros.stream().mapToInt(Integer::intValue).sum();
        int media = soma / numeros.size();

        //obtendo maior número
        int maiorNumero = Collections.max(numeros);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Você digitou os número: "+numeros);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("O maior número digitado foi: "+maiorNumero);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("A média dos números digitados foi: "+media);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
    } 

}
