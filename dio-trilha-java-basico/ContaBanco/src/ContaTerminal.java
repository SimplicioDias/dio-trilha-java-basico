import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner leia = new java.util.Scanner(System.in);
        int numero;
        String agencia, nome;
        double saldo;

        System.out.println("Informe seu nome completo: ");
        nome = leia.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = leia.nextLine();

        System.out.println("Informe o numero da conta: ");
        numero = Integer.parseInt(leia.nextLine());

        System.out.println("Informe Saldo: ");
        saldo = Double.parseDouble(leia.nextLine());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.",nome,agencia,numero,saldo);

    }
}
