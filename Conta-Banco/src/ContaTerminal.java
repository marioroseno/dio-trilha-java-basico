import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        boolean contaEspecial = true;
        double saldo = 0.00;
        double limiteConta = 1000.00;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nDigite seu nome: ");
        String nome = scanner.next();

        System.out.println("\nDigite o número e o digito da sua conta: ");
        String conta = scanner.next();

        System.out.println("\nDigite o número da sua agência: ");
        int agencia = scanner.nextInt();

        System.out.println("\nOlá " + nome + ", sua conta " + conta + " e agencia " + agencia + " foram criados com sucesso, é um prazer tê-lo como cliente.");
        System.out.println("\nSeu saldo é de: " + saldo);
        System.out.println("\nSeu limite de conta especial é: " + limiteConta);


    }
}
