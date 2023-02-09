package br.com.erick.exceptions;

import java.io.*;

public class CheckedException {
    public static void main(String[] args){
    String nomeArquivo = "src/romances-blake-crouch.txt";

        try {
            imprimirArquivo(nomeArquivo);
        }catch (FileNotFoundException e){
            System.out.println("Erro: Talves o nome do arquivo esteja errado!!!");
        }
        catch (IOException e) {
            System.out.println("Erro: Ocorreu um erro inesperado, contate o suporte! " + e.getMessage());
        }


    }

    private static void imprimirArquivo(String nomeArquivo) throws IOException {
        File file = new File(nomeArquivo);

        BufferedReader br = new BufferedReader(new FileReader((file.getName())));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        bw.flush();
        bw.close();
    }
}
