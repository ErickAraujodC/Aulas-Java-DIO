package com.erick;

import javax.sound.sampled.SourceDataLine;

public class Calculadora {

    public static void somar(Double numero1, Double numero2) {
        Double resultado = numero1 + numero2;
        System.out.printf("A soma entre %.1f e %.1f é = %.1f %n", numero1, numero2, resultado);

    }


    public static void subtrair(Double numero1, Double numero2) {
        Double resultado = numero1 - numero2;
        System.out.printf("A subtração entre %.1f e %.1f é = %.1f %n", numero1, numero2, resultado);
    }


    public static void dividir(Double numero1, Double numero2) {
        Double resultado = numero1 / numero2;
        System.out.printf("A divisão entre %.1f e %.1f é = %.1f %n", numero1, numero2, resultado);
    }


    public static void multiplicar(Double numero1, Double numero2) {
        Double resultado = numero1 * numero2;
        System.out.printf("A multiplicação entre %.1f e %.1f é = %.1f %n", numero1, numero2, resultado);
    }


}
