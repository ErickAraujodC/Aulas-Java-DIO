package com.erick.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex1_v2_listas {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            List<Double> temperaturas = new ArrayList<Double>();

            int cont = 1;

            while(true){
                if(cont==7) break;

                System.out.printf("Digite a média da temperatura do %d° mês: ", cont);
                double next = scan.nextDouble();

                temperaturas.add(next);
                cont++;
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

            //forEach para exibir todas temperaturas
            System.out.println("Todas as temperaturas: ");
            temperaturas.forEach(t -> System.out.print(t + " "));
            
            double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
            System.out.printf("A média semestral de temperatura foi: %.1f °C", media);
            System.out.println();

            //Exibindo as temperaturas encima da média.
            System.out.println("Temperaturas acima da média: ");
            temperaturas.stream()
                .filter(t -> t > media)
                .forEach(t -> System.out.printf("%.1f ", t));

            //nomeando meses com temperatura acima da media
                
            System.out.println();
            System.out.println("Os seguintes meses estiveram temperatura a baixo da média semestral =>");
            
            Iterator<Double> iterator = temperaturas.iterator();

            int numeroMes = 0;
            while(iterator.hasNext()) {
                double mes = iterator.next();
                if(mes>media){
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
        }
        
        System.out.println();
    }
}
