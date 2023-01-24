package com.erick.exercicios;

public class Emprestimo {

    public static void taxaJuros(double valor, int parcelas) {
        double valorComJuros = valor * Math.pow(1.0375, parcelas);
        System.out.printf("O valor final do empréstimo de %.2f pagos em %d parcelas é: R$%.2f. %n", valor, parcelas, valorComJuros);
        ;
    }
}
