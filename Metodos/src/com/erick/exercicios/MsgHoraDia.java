package com.erick.exercicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MsgHoraDia {
    public static void main(String[] args) {
        Date dataHoraAtual = new Date();
        String horaCompleta = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
    
        String horaStr = horaCompleta.substring(0, 2);
        int hora = Integer.parseInt(horaStr);

        obterMensagem(hora, horaCompleta);
    }

    public static void obterMensagem(int hora, String horaCompleta){
        if(hora>=6 && hora<12){
           System.out.println("Agora são "+ horaCompleta);
           mensagemBomDia();
        } else if (hora>=12 && hora<18){
            System.out.println("Agora são "+ horaCompleta);
            mensagemBoaTarde();
        } else if(hora>=18){
            System.out.println("Agora são "+ horaCompleta);
            mensagemBoaNoite();
        }
        
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Bom tarde!");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Bom noite!");
    }
}
