package com.erick.exercicios.loops;

import java.util.Scanner;

public class Ex2_NotaValida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        while(true){
            System.out.print("Digite uma nota entre [0 e 10]: ");
            nota = scan.nextInt();

            if(nota>=0 && nota<=10){
                System.out.println("=-=-=-=-=-=-=-=-=-=-=");

                System.out.println("Você digitou a nota " + nota);
                System.out.println("ENCERRANDO PROGRAMA");
                break;
            } else{
                System.out.println("=-=-=-=-=-=-=-=-=-=-=");

                System.out.println("ERRO: nota inválida");
                System.out.println("Tente novamente.");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            }
        }
    }
}
