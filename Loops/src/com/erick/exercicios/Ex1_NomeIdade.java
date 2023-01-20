package com.erick.exercicios;

import java.util.Scanner;

public class Ex1_NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome, continuar;
        int idade;
        

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-= ");
        System.out.println("Informações sobre você");

        while(true){
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-= ");

            System.out.print("Digite o seu nome: ");
            nome = scan.next().trim();

            System.out.print("Idade: ");
            idade = scan.nextInt();

            String maiorMenor = idade>17?"maior de idade": "menor de idade";

            System.out.println("Olá " + nome + ", você é " + maiorMenor + ", e voce tem " + idade + " anos.");
        
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-= ");
            System.out.print("Deseja continuar? [S/N]: ");
            continuar = scan.next().toUpperCase().substring(0,1);
            if(continuar.equals("N")) {
                System.out.println("Encerrando programa, até mais " + nome);
                break;
            }

        }
    }
}
