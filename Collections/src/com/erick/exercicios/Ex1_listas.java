package com.erick.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex1_listas {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            List<Double> temperaturas = new ArrayList<Double>();

            int cont = 1;
            while(cont<=6){
                System.out.printf("Digite a temperatura °C do %d° mês / exemplo: 10,2 =>  ", cont);
                double temp = scan.nextDouble();

                temperaturas.add(temp);
                cont++;
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Temperatura de média de cada mês no primeiro semestre do ano => ");

            retornaMes(temperaturas);

            Iterator<Double> iterator = temperaturas.iterator();
            double soma = 0d;

            while(iterator.hasNext()){
                double next = iterator.next();
                soma += next;
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

            double tempMedia = soma/temperaturas.size();
            System.out.printf("A média da temperatura do 1° semestre foi: %.1f ", tempMedia);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

            retornaMesMenorMedia(temperaturas, tempMedia);
        }
    }

    public static void retornaMes(List<Double> lista) {
        int numeroMes = 0;
        for (Double mes : lista) {
            System.out.println();
            switch (numeroMes) {
                case (0):
                    System.out.printf("1 - janeiro: %.1f", mes);
                    break;
                case (1):
                    System.out.printf("2 - fevereiro: %.1f", mes);
                    break;
                case (2):
                    System.out.printf("3 - março: %.1f", mes);
                    break;
                case (3):
                    System.out.printf("4 - abril: %.1f", mes);
                    break;
                case (4):
                    System.out.printf("5 - maio: %.1f", mes);
                    break;
                case (5):
                    System.out.printf("6 - junho: %.1f", mes);
                    break;
                default:
                    System.out.println("Erro ao exibir mes");
                    break;
            }

            numeroMes++;
        }
        System.out.println();
    }

    public static void retornaMesMenorMedia(List<Double> lista, double media) {
        System.out.println("Os seguintes meses estiveram temperatura a baixo da média semestral =>");
        int numeroMes = 0;
        for (Double mes : lista) {
            if(mes<media){
                System.out.println();
                switch (numeroMes) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f", mes);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f", mes);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f", mes);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f", mes);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f", mes);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f", mes);
                        break;
                    default:
                        System.out.println("Erro ao exibir mes");
                    break;
                } 
            }   

            numeroMes++;
        }
        System.out.println();
    }
}
