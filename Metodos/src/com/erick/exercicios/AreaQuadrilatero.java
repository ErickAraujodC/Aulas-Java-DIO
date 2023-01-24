package com.erick.exercicios;

public class AreaQuadrilatero {

    //Area quadrado
    public static void calcularArea(double lado) {
        double area = lado * lado;
        System.out.printf("A área do quadrado com lados %.2f é: %.2f", lado, area);    
    }
    public static void calcularArea(int lado) {
        int area = lado * lado;
        System.out.printf("A área do quadrado com lados %d é: %d", lado, area);    
    }

    //Retangulo 

    public static void calcularArea(double lado1, double lado2) {
        double area = lado1 * lado2;
        System.out.printf("A área do retangulo com lados %.2f e %.2f é: %.2f", lado1, lado2, area);    
    }

    public static void calcularArea(int lado1, int lado2) {
        int area = lado1 * lado2;
        System.out.printf("A área do retangulo com lados %d e %d é: %d", lado1, lado2, area);    
    }

    public static void calcularArea(int lado1, double lado2) {
        double area = lado1 * lado2;
        System.out.printf("A área do retangulo com lados %d e %.2f é: %.2f", lado1, lado2, area);    
    }

    public static void calcularArea(double lado1, int lado2) {
        double area = lado1 * lado2;
        System.out.printf("A área do retangulo com lados %.2f e %d é: %.2f", lado1, lado2, area);    
    }
}
