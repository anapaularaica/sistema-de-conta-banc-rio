import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Coleta dos dados do usuário
        System.out.print("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt(); // Lê um número inteiro

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.next(); // Lê uma string

        scanner.nextLine(); // Limpa o buffer do scanner para evitar problemas ao ler a próxima linha
        System.out.print("Por favor, digite o Nome do Cliente: ");
        nomeCliente = scanner.nextLine(); // Lê o nome do cliente

        System.out.print("Por favor, digite o saldo: ");
        saldo = scanner.nextDouble(); // Lê um número decimal

        // Exibindo a mensagem de confirmação
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + 
                " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}
