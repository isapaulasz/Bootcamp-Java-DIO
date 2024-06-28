import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        
        System.out.println("Boas Vindas!");
        
        System.out.print("Insira o número da conta: ");
        int Numero = scanner.nextInt();
        
        System.out.print("Número da agência: ");
        String Agencia = scanner.next();
        
        System.out.print("Nome do Cliente: ");
        String NomeCliente = scanner.next();
        
        System.out.print("Saldo: ");
        double Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
        + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
}
