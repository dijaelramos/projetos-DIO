import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        double saldo = 237.48d;

        //Dadps do cliente 1
         Scanner c1 = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = c1.nextInt();

        System.out.println("Digite o número da agencia. Ex: 000-0");
        String agencia = c1.next();

        System.out.println("Digite o seu nome completo: ");
        String nomeCliente = c1.next();

        System.out.println(" \n");
        System.out.println("Prezado " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                numero + ", conta: " + agencia + " e seu saldo é de R$ " + saldo + " e já está disponível para saque.");
    }
}
