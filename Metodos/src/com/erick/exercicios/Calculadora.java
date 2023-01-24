package com.erick.exercicios;

public class Calculadora {
    // somar
    public static void somar(Double numero1, Double numero2) {
        Double resultado = numero1 + numero2;
        System.out.printf("A soma entre %.2f e %.2f é = %.2f %n", numero1, numero2, resultado);

    }

    public static void somar(int numero1, Double numero2) {
        Double resultado = numero1 + numero2;
        System.out.printf("A soma entre %d e %.2f é = %.1f %n", numero1, numero2, resultado);

    }

    public static void somar(double numero1, int numero2) {
        Double resultado = numero1 + numero2;
        System.out.printf("A soma entre %.2f e %d é = %.1f %n", numero1, numero2, resultado);

    }

    public static void somar(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        System.out.printf("A soma entre %d e %d é = %d %n", numero1, numero2, resultado);

    }

    // subtração
    public static void subtrair(Double numero1, Double numero2) {
        Double resultado = numero1 - numero2;
        System.out.printf("A subtração entre %.2f e %.2f é = %.2f %n", numero1, numero2, resultado);

    }

    public static void subtrair(int numero1, Double numero2) {
        Double resultado = numero1 - numero2;
        System.out.printf("A subtração entre %d e %.2f é = %.1f %n", numero1, numero2, resultado);

    }

    public static void subtrair(double numero1, int numero2) {
        Double resultado = numero1 - numero2;
        System.out.printf("A subtração entre %.2f e %d é = %.1f %n", numero1, numero2, resultado);

    }

    public static void subtrair(int numero1, int numero2) {
        int resultado = numero1 - numero2;
        System.out.printf("A subtração entre %d e %d é = %d %n", numero1, numero2, resultado);

    }

    //divisão
    public static void dividir(Double numero1, Double numero2) {
        Double resultado = numero1 / numero2;
        System.out.printf("A divisão entre %.2f e %.2f é = %.2f %n", numero1, numero2, resultado);

    }

    public static void dividir(int numero1, Double numero2) {
        Double resultado = numero1 / numero2;
        System.out.printf("A divisão entre %d e %.2f é = %.1f %n", numero1, numero2, resultado);

    }

    public static void dividir(double numero1, int numero2) {
        Double resultado = numero1 / numero2;
        System.out.printf("A divisão entre %.2f e %d é = %.1f %n", numero1, numero2, resultado);

    }

    public static void dividir(int numero1, int numero2) {
        int resultado = numero1 / numero2;
        System.out.printf("A divisão entre %d e %d é = %d %n", numero1, numero2, resultado);

    }

    //multiplicacao
    public static void multiplicar(Double numero1, Double numero2) {
        Double resultado = numero1 * numero2;
        System.out.printf("A multiplicação entre %.2f e %.2f é = %.2f %n", numero1, numero2, resultado);

    }

    public static void multiplicar(int numero1, Double numero2) {
        Double resultado = numero1 * numero2;
        System.out.printf("A multiplicação entre %d e %.2f é = %.1f %n", numero1, numero2, resultado);

    }

    public static void multiplicar(double numero1, int numero2) {
        Double resultado = numero1 * numero2;
        System.out.printf("A multiplicação entre %.2f e %d é = %.1f %n", numero1, numero2, resultado);

    }

    public static void multiplicar(int numero1, int numero2) {
        int resultado = numero1 * numero2;
        System.out.printf("A multiplicação entre %d e %d é = %d %n", numero1, numero2, resultado);

    }


}
