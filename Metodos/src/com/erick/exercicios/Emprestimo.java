package com.erick.exercicios;

public class Emprestimo {

    public static double taxaJuros(double valor, int parcelas) {
        double valorComJuros = valor * Math.pow(1.0375, parcelas);
        return valorComJuros;
    }
}
