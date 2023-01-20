package com.erick.exercicios;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial = 1;
        String calculo = "";

        System.out.print("Digite um número e veja o seu fatorial: ");
        int numero = scan.nextInt();

        for(int i = numero; i > 0; i--){
            fatorial *= i;
            calculo += i>1 ? i + " x ": i + " = ";
        }

        System.out.println("O fatorial de " + numero + " é : " + fatorial);
        System.out.println("Calculo: "+ calculo + fatorial);
    }
}
