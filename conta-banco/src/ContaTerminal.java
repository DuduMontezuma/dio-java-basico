import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e imortar a classes scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        String numero =  scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: "+agencia + ", conta: " + numero + " e o saldo "+ saldo + " está disponivel");

    }
}
