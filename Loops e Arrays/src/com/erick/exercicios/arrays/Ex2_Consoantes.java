package com.erick.exercicios.arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String[6];
        int  cont = 0;
        int qntConsoantes = 0;

        System.out.println("Digite 6 letras por favor!");
        do {
            System.out.print("Letra " + (cont+1) + ": ");
            String letra = scan.next();

            if(!(letra.equalsIgnoreCase("a") |
            letra.equalsIgnoreCase("e") |
            letra.equalsIgnoreCase("i") |
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u"))){
                consoantes[cont] = letra;
            }
            cont++;
        } while (cont < consoantes.length);

        System.out.print("Voce digitou as seguintes consoantes: ");
        for(int i = 0; i < consoantes.length; i++){
           if(consoantes[i] != null){
            qntConsoantes++;
            System.out.print(consoantes[i] + " ");
           }
        }

        System.out.println("");
        System.out.println("Ao total foram: " + qntConsoantes + " letras consoantes.");

    }
}
