package com.erick.exercicios.ex_listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex2_listas {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            List<String> respostas = new ArrayList<String>();
            
            System.out.println("Investigacao de assassinato: ");
            
            System.out.println("1. Telefonou para a vítima?[s/n]");
            String resposta = scan.next();
            respostas.add(resposta.toLowerCase());

            System.out.println("2. Esteve no local do crime?[s/n]");
            resposta = scan.next();
            respostas.add(resposta.toLowerCase());
            
            System.out.println("3. Mora perto da vítima?[s/n]");
            resposta = scan.next();
            respostas.add(resposta.toLowerCase());
            
            System.out.println("4. Devia para a vítima?[s/n]");
            resposta = scan.next();
            respostas.add(resposta.toLowerCase());
            
            System.out.println("5. Já trabalhou com a vítima?[s/n]");
            resposta = scan.next();
            respostas.add(resposta.toLowerCase());

            Iterator<String> iterator = respostas.iterator();

            int respostasPositivas = 0;

            while(iterator.hasNext()){
                String resp = iterator.next();

                if(resp.equalsIgnoreCase("s")){
                    respostasPositivas++;
                }
            }

            switch (respostasPositivas) {
                case 1:
                    System.out.println("De acordo com as respostas te declaramos:- INOCENTE");
                    break;
                
                case 2:
                case 3:
                    System.out.println("De acordo com as respostas te declaramos:- SUSPEITO");
                    break;
                case 4:
                    System.out.println("De acordo com as respostas te declaramos:- CUMPLICE");
                    break;
                case 5:
                    System.out.println("De acordo com as respostas te declaramos:- ASSASSINO");
                    break;
                default:

                break;
            }
        }


    }
}
