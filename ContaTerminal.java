import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args){
    
        try (Scanner tecla = new Scanner (System.in).useLocale(Locale.US)) {
            
            System.out.println("degite o numero da sua conta ?");
            int numero = tecla.nextInt();

            System.out.println("degite o numero da sua agencia?");
            int agencia = tecla.nextInt();

            System.out.println("degite o seu nome ?");
            String nome = tecla.next();

            System.out.println("degite o valor do seu saldo ?");
            double saldo = tecla.nextDouble();


            System.out.println(" o numero da conta é" + numero);

            System.out.println(" o numero da agencia é" + agencia);

            System.out.println(" o seu nome é " + nome);

            System.out.println(" o valor do seu saldo é" + saldo);
        }
        
    }
}
