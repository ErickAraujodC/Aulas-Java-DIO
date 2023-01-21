package com.erick.exercicios.arrays;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        
        Random random = new Random();

        int [] numeros = new int[20];
        int cont = 0;
        
        for(int i = 0; i < numeros.length; i++){
            int numeroAleatorio = random.nextInt(100);
            numeros[i] = numeroAleatorio;
        }

        System.out.print("Vetor:      ");
        for(int numero : numeros){
            System.out.print(numero + " ");
        }

        System.out.println(" ");
        System.out.print("Antecessor: ");
        for(int numero : numeros){
            System.out.print((numero-1) + " ");
        }

        System.out.println(" ");
        System.out.print("Sucessor:   ");
        for(int numero : numeros){
            System.out.print((numero+1) + " ");
        }
    }    
}
