package com.erick.exercicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Emprestimo
        double valor = 100d;
        int parcelas = 12;
        Emprestimo.taxaJuros(valor, parcelas);
        System.out.println();
        //Mensagem dia 

        Date dataHoraAtual = new Date();
        String horaCompleta = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
    
        String horaStr = horaCompleta.substring(0, 2);
        int hora = Integer.parseInt(horaStr);

        MsgHoraDia.obterMensagem(hora, horaCompleta);
        System.out.println();
        //Calculadora

        Calculadora.dividir(1.02, 10.0);
        Calculadora.subtrair(1.02, 10.0);
        Calculadora.somar(1.02, 10.0);
        Calculadora.multiplicar(1.02, 10.0);


    }

    
}
