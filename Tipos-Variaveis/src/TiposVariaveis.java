public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        //Tipos de String

        String meuNome = "Erick Araujo de Carvalho";
        char sexo = 'M';

        /*Temos o tipo string que aceita uma cadeia de caracteres, e o tipo
         * char que aceita exclusivamente um caracter, e deve ser usado aspas simples.
        */

        ////

        
        //Tipos de variaveis numericas a baixo:

        byte idade = 123;
        short ano = 2023;
        int cep = 21070333; //se começar com zero não irá funcionar esse tipo 
        long cpf = 12345678910L; //se começar com zero não irá funcionar esse tipo 
        float pi = 3.14F;
        double salario = 1300.50;


        ////

        
        //Java é fortemente tipada, sendo assim, se eu tenho um n° do tipo short 
        //crio uma var a partir dele do tipo int e em seguida crio outra var do tipo short
        //a partir dessa do tipo int que foi criada do tipo short ele dará erro, ilustrando a baixo;

        short numeroCurto = 1;
        int numeroInt = numeroCurto;
        //short numeroCurto2 = numeroInt;

        // no caso acima posso trocar adicionar um cast na variavel numeroCurto2
        //O cast é uma conversão, é quando convertemos um valor de um tipo para outro tipo


        ////


        /*Para criar constantes usamos a palavra "final" no inicio da declaraçao da variavel,
        *e o nome da variavel deve estar escrita em uppercase por convensao.
        *Exemplo a baixo.
        */

        final double PI = 3.14;
        //PI = 3.12;
        
        //Se eu tento alterar gera um erro dizendo que
        //A variável local final PI não pode ser atribuída.
    }
}
