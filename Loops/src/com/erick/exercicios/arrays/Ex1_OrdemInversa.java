package com.erick.exercicios.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        
    int [] vetor = {5, 6, 12, 10, 2, 1};

    System.out.print("Vetor: ");
    int cont = 0;
    while(cont < vetor.length){
        System.out.print(vetor[cont] + " ");
        cont++;
    }
    
    System.out.println(" ");
    System.out.print("Vetor invertido: ");
    for(int i = (vetor.length - 1); i >= 0; i--){
        System.out.print(vetor[i] + " ");
    }
    
    }
}
