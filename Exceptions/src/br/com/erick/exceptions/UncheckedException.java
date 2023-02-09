package br.com.erick.exceptions;

import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean continueLoop = true;
        do{
            System.out.print("Numerador: ");
            String a = scan.next();

            System.out.print("Denominador: ");
            String b = scan.next();

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLoop = false;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um valor válido: " + e.getMessage());
            } catch (ArithmeticException e){
                System.out.println("Erro: O valor 0 não é aceito: " + e.getMessage());

            }
        }while (continueLoop);
    }

    private static int dividir(int a, int b) { return  a/b; }
}
