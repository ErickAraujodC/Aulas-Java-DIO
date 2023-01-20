package com.erick.exercicios;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    String continuar;
    
    while(true){
        System.out.print("Digite um número para ver a sua tabuada: ");
        int num = scan.nextInt();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i +" = " + (num*i));
            }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");

        System.out.print("Deseja continuar [S/N]: ");
        continuar = scan.next().toUpperCase().substring(0,1);
        
        if(continuar.equals("N")) break;        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
    
    }
    }
}
