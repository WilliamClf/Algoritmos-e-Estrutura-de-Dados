
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        String nome = "";
        String rua, bairro, num;
        double saldo = 0;
        double retirada = 0;
        double deposito;

        double retiradaExtrato = 0;
        double depositoExtrato = 0;

        System.out.println("Bem vindo a Central de Atendimento :)");

        System.out.println("Informe seu nome:");
        nome = ms.nextLine();

        while (nome.equals("")) {
            System.out.println("Informe seu nome");
            nome = ms.nextLine();
        }

        System.out.printf("%s,Informe seu endereço\n", nome);
        System.out.print("Bairro: ");
        bairro = ms.nextLine();
        System.out.print("Rua: ");
        rua = ms.nextLine();
        System.out.print("Número: ");
        num = ms.nextLine();

        System.out.println("Informe seu saldo: ");
        saldo = ms.nextDouble();

        while (saldo < 0) {
            System.out.println("Informe seu saldo: ");
            saldo = ms.nextDouble();
        }

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n1 - Consultar Saldo");
            System.out.println("2 - Fazer Retirada ");
            System.out.println("3 - Realizar Depósito");
            System.out.println("4 - Extrato ");
            System.out.println("5 - Consultar Endereço");
            System.out.println("6 - Alterar Endereço");
            System.out.println("9 - Sair");

            System.out.println("Digite o número do comando que deseja");
            int op = ms.nextInt();
            ms.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Seu saldo é: R$ " + saldo);
                    break;

                case 2:
                    System.out.println("Quanto deseja retirar?");
                    retirada = ms.nextInt();
                    if (retirada > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else if (retirada < 0) {
                        System.out.println("Valor inválido");
                    } else if (retirada <= saldo) {
                        saldo = saldo - retirada;
                        retiradaExtrato = retiradaExtrato + retirada;
                    }
                    break;

                case 3:
                    System.out.println("Quanto deseja depositar?");
                    deposito = ms.nextDouble();
                    if (deposito > 0) {
                        saldo = saldo + deposito;
                        depositoExtrato = depositoExtrato + deposito;
                    } else if (deposito < 0) {
                        System.out.println("Valor inválido");
                    }
                    break;

                case 4:
                    System.out.printf("Extrato de %s:", nome);
                    System.out.printf("\nVoce retirou R$ %.2f", retiradaExtrato);
                    System.out.printf("\nVoce depositou R$ %.2f", depositoExtrato);
                    System.out.printf("\nSeu saldo final é: R$ %.2f", saldo);
                    break;

                case 5:
                    System.out.printf("Seu endereço é: Bairro: %s, Rua: %s, Número: %s", bairro, rua, num);
                    break;
                case 6:
                    System.out.println("Digite seu novo endereço: ");

                    System.out.println("Bairro: ");
                    bairro = ms.nextLine();

                    System.out.println("Rua: ");
                    rua = ms.nextLine();

                    System.out.println("Número: ");
                    num = ms.nextLine();
                    break;
                case 9:
                    continuar = false;
                    System.out.println("Até breve...");
                default:
                    break;
            }
        }
        ms.close();
    }
}
