import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class ContaTerminal { // Declara a classe ContaTerminal
    public static void main(String[] args) { // Método principal que inicia a execução do programa
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numero; // Variável para armazenar o número da conta (inteiro)
        String agencia; // Variável para armazenar o número da agência (texto)
        String nomeCliente; // Variável para armazenar o nome do cliente (texto)
        double saldo; // Variável para armazenar o saldo da conta (decimal)

        // Coleta dos dados do usuário
        System.out.print("Por favor, digite o número da Conta: "); // Solicita ao usuário o número da conta
        numero = scanner.nextInt(); // Lê um número inteiro fornecido pelo usuário

        System.out.print("Por favor, digite o número da Agência: "); // Solicita ao usuário o número da agência
        agencia = scanner.next(); // Lê uma string (número da agência) fornecida pelo usuário

        scanner.nextLine(); // Limpa o buffer do scanner para evitar problemas ao ler a próxima linha
        System.out.print("Por favor, digite o Nome do Cliente: "); // Solicita o nome do cliente
        nomeCliente = scanner.nextLine(); // Lê a linha completa (nome do cliente) fornecida pelo usuário

        System.out.print("Por favor, digite o saldo: "); // Solicita ao usuário o saldo
        saldo = scanner.nextDouble(); // Lê um número decimal fornecido pelo usuário

        // Exibe a mensagem de confirmação com as informações coletadas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + 
                " já está disponível para saque.");

        // Fechando o scanner para liberar recursos
        scanner.close();
    }
}
