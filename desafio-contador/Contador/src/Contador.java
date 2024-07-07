import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro (deve ser menor que o segundo parâmetro):");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro (deve ser maior que o primeiro parâmetro):");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);          
        } catch (Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        scanner.close();
    }

    static void contar (int parametroUm, int parametroDois) throws Exception {
        if (parametroDois<=parametroUm) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}
