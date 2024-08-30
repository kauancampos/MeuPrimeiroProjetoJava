import java.util.Scanner;

public class DesafioConclusaoDeCurso {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int escolha = 0;
        double deposito = 0;
        double tranferencia = 0;


        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o tipo de conta: ");
        String tipoDeConta = scanner.nextLine();
        System.out.println("Digite o saldo da conta");
        double saldo = scanner.nextDouble();
        System.out.println("================================");
        System.out.println("Dados do cliente");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("================================");

        while (escolha != 5){
            System.out.println("=======MENU=======");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferência de valores");
            System.out.println("4. Dados completos");
            System.out.println("5. Sair");
            escolha = scanner.nextInt();

            if(escolha == 1){
                System.out.println("Seu saldo atual é de R$ " + saldo);

            } else if (escolha == 2) {
                System.out.println("Digite o valor do déposito: ");
                deposito = scanner.nextDouble();
                System.out.println("Foi depositado " + deposito);
                System.out.println("Seu saldo atual é " + (saldo + deposito));
                saldo += deposito;

            } else if (escolha == 3){
                System.out.println("Qual o valor você deseja transferir?");
                tranferencia = scanner.nextDouble();
                System.out.println("O valor de R$ " + tranferencia + " foi tranferido.");
                System.out.println("Seu saldo atual é de R$ " + (saldo - tranferencia));
                saldo -= tranferencia;

            } else if (escolha == 4){
                System.out.println("================================");
                System.out.println("Dados do cliente");
                System.out.println("Nome: " + nome);
                System.out.println("Tipo de conta: " + tipoDeConta);
                System.out.println("Saldo atual: " + saldo);
                System.out.println("================================");
            } else if (escolha == 5){
                System.out.println("Programa encerrado! Atpé mais.");
            } else{
                System.out.println("Opção inválida. Digite novamente.");
            }
        }
    }
}
