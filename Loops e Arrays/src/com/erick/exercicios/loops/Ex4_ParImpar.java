package com.erick.exercicios.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String continuar;
        String par = "";
        String impar = "";

        List<Integer> numeros = new ArrayList<>();

        while(true){
            System.out.print("Digite um número: ");
            numeros.add(input.nextInt());
            
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("Deseja continuar [S/N]: ");
            continuar = input.next().toUpperCase().substring(0,1);
            
            if(continuar.equals("N")) break;
        }

        for(int i = 0; i < numeros.size(); i++){
           
            if(numeros.get(i)%2==0){
                par = par + numeros.get(i) + " ";
            } else {
                impar = impar + numeros.get(i) + " ";
            }
        }

        System.out.println("Você digitou os números pares: " + par);
        System.out.println("Você digitou os números ímpares: " + impar);

        System.out.println("Encerrando programa, até a proxima!");


    }
}
