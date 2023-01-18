import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.print("Digite seu sobrenome: ");
        String sobreNome = scanner.next();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite sua altura: ");
        Double altura = scanner.nextDouble();

        //Mensagem de saudação após a entrada dos dados.
     
        
        System.out.println("Olá " + nome + " " + sobreNome);
        System.out.println("Você tem " + idade + " anos.");
        System.out.println("Sua altura é: " + altura);


    }
}
