import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();
         
        System.out.println("Digite seu sobrenome");
        String sobrenomeCliente = scanner.next();
        
        System.out.println("Digite sua agência");
        String agencia = scanner.next();

        System.out.println("Digite sua conta");
        int numero = scanner.nextInt();
        
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "  + agencia + ", conta "  + numero + " e seu saldo " + saldo + " já está disponível para saque." );
        
        
    }
}