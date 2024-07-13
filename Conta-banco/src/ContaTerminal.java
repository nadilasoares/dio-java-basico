import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TODO: Conhecer e importar a classe Scanner
        // Exibir as mensagens pro usuário
        // Obter pela Scanner os valores digitados pelo usuário
        // Exibir a mensagem final, da conta criada

        // Criando o objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Ler número da conta
        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine(); // Limpar o buffer

        // Ler número da agência
        System.out.println("Digite o número da agência: ");
        String agencia = sc.nextLine();

        // Ler nome do cliente
        System.out.println("Digite o nome do cliente: ");
        String cliente = sc.nextLine();

        // Ler o saldo
        System.out.println("Digite o saldo: ");
        double saldo = Double.parseDouble(sc.nextLine());

        sc.close();

        // Mensagem final
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
                                        cliente, agencia, numero, saldo);

        System.out.println(mensagem);
    }
}
