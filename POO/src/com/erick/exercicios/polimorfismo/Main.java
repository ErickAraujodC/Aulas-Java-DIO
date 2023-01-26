package com.erick.exercicios.polimorfismo;

public class Main {
    public static void main(String[] args) {
        ClasseMae [] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
        
        for (ClasseMae classe : classes){
            classe.metodo1();
        }

        System.out.println();

        for (ClasseMae classe : classes){
            classe.metodo2();
        }
    }
}
