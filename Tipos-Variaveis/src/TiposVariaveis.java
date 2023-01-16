public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        //Tipos de variaveis numericas a baixo:

        byte idade = 123;
        short ano = 2023;
        int cep = 21070333; //se começar com zero não irá funcionar esse tipo 
        long cpf = 12345678910L; //se começar com zero não irá funcionar esse tipo 
        float pi = 3.14F;
        double salario = 1300.50;

        //Java é fortemente tipada, sendo assim, se eu tenho um n° do tipo short 
        //crio uma var a partir dele do tipo int e em seguida crio outra var do tipo short
        //a partir dessa do tipo int que foi criada do tipo short ele dará erro, ilustrando a baixo;

        short numeroCurto = 1;
        int numeroInt = numeroCurto;
        //short numeroCurto2 = numeroInt;

        // no caso acima posso trocar adicionar um cast na variavel numeroCurto2
        //O cast é uma conversão, é quando convertemos um valor de um tipo para outro tipo

    }
}
