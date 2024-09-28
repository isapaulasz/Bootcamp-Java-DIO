import java.util.Scanner;

public class dio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        for (String s : partes) {
          if (s == servico) {contratado = true; }
          System.out.println(s + servico);
        }
        
        if (contratado) {System.out.println("Sim");}
        else {System.out.println("Nao");}
        
        scanner.close();
    }
}
