package br.com.erick.exceptions;

public class Exception_Custumizada {
    public static void main(String[] args) {
        int[] numerador = {10, 5, 6, 18};
        int[] denominador = {2, 0, 6, 4, 9};


        for (int i = 0; i < denominador.length; i++) {
            try {

                int resultado = numerador[i] / denominador[i];

                if (resultado %2 != 0) {
                    Double resultadoDouble = Double.valueOf(numerador[i] / denominador[i]);
                    System.out.println(resultadoDouble);
                } else System.out.println(resultado);


            } catch (ArithmeticException e){
                System.out.println("Impossível dividir um número por zero");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("O tamanho dos arrays devem ser compativeís, Verifique o seu código!");
            }
        }


        System.out.println("Continuando o código");
    }
}
