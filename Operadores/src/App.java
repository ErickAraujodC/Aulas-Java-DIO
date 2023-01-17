import javax.print.event.PrintJobListener;

public class App {
    public static void main(String[] args) throws Exception {
       //Regra na concatenação:
       
        String conc = "";

        conc = 1+1+"1"+1+1;
        /* System.out.println(conc); */
        //imprime: 2111

        /*
        A partir do momento que a var encontra um str, ela imediatamente começa a
        concatenação, mesmo existindo possiveis adiçoes depois.
        neste caso o correto a se fazer, seria evidenciar a expressão com ()
        exemplo a baixo:
        */

        conc = "1" + (1+1+1);
        /* System.out.println(conc); */
        //imprime: 13

        /*
        Mesmo começando com um str, a expressão obedeça a ordem faz o 
        que esta evidenciado primeiro. 
        */

        int num = 5;
        //System.out.println(num);

        num = - num ;
        //System.out.println(num);

        num = num * -1;
        //or
        //num = - num ; 
        //System.out.println(num);


        ///


        /* O If Ternário funciona da mesma forma que no JS
        Exemplo:
        */

        int a, b;

        a = 5; 
        b = 5;

        String resultado = (a==b) ? "A é igual a B" : "A é diferente de B";

        System.out.println(resultado);



        
        
    
    }
}
