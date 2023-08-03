import java.util.Scanner;

public class TrabalhoIRPF {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        // Informações pessoais
        System.out.println("Informe seu nome: ");
        String nome = ms.nextLine();
        while (nome.equals("")) {
            System.out.println("Informe seu nome: ");
            nome = ms.nextLine();
        }
        System.out.println("Informe seu CPF: ");
        String cpf = ms.nextLine();
        while (cpf.equals("")) {
            System.out.println("Informe seu CPF: ");
            cpf = ms.nextLine();
        }
        System.out.println("Informe seu email: ");
        String email = ms.nextLine();
        while (email.equals("")) {
            System.out.println("Informe seu email: ");
            email = ms.nextLine();
        }
        System.out.println("Informe sua data de nascimento: ");
        String dataNasc = ms.nextLine();
        while (dataNasc.equals("")) {
            System.out.println("Informe sua data de nascimento: ");
            dataNasc = ms.nextLine();
        }
        System.out.println("Informe seu telefone: ");
        String telefone = ms.nextLine();
        while (telefone.equals("")) {
            System.out.println("Informe seu telefone: ");
            telefone = ms.nextLine();
        }
        System.out.println("Pressione 'ENTER' para continuar");

        String mes = ms.nextLine();

        final int controleMes1 = 1;
        final int controleMes12 = 12;
        double acumuladoINSS = 0;
        double acumuladoIRPF = 0;

        for (int controle = controleMes1; controle <= controleMes12; controle++) {

            switch (controle) {
                case 1:
                    mes = "Janeiro";
                    break;

                case 2:
                    mes = "Fevereiro";
                    break;

                case 3:
                    mes = "Março";
                    break;

                case 4:
                    mes = "Abril";
                    break;

                case 5:
                    mes = "Maio";
                    break;

                case 6:
                    mes = "Junho";
                    break;

                case 7:
                    mes = "Julho";
                    break;

                case 8:
                    mes = "Agosto";
                    break;

                case 9:
                    mes = "Setembro";
                    break;

                case 10:
                    mes = "Outubro";
                    break;

                case 11:
                    mes = "Novembro";
                    break;

                case 12:
                    mes = "Dezembro";
                    break;
            }
            System.out.printf("\nInforme o salário de %s: R$", mes);
            double salario = ms.nextDouble();

            double inss;
            if (salario <= 1751.81) {
                inss = salario * 0.08;
            } else if (salario <= 2919.72) {
                inss = salario * 0.09;
            } else if (salario <= 5839.45) {
                inss = salario * 0.11;
            } else {
                inss = 5839.45 * 0.11;
            }

            acumuladoINSS += inss;

            double irpf;
            double base = salario - inss;

            if (base <= 1903.98) {
                irpf = 0;
            } else if (base <= 2826.65) {
                irpf = (base * 0.075) - 142.80;
            } else if (base <= 3751.05) {
                irpf = (base * 0.15) - 354.80;
            } else if (base <= 4664.68) {
                irpf = (base * 0.225) - 636.13;
            } else {
                irpf = (base * 0.275) - 869.36;
            }
            acumuladoIRPF += irpf;
            System.out.println("Mês: " + mes);
            System.out.printf("INSS: R$ %.2f\n", inss);
            System.out.printf("IRPF: R$ %.2f\n", irpf);

        }
        System.out.printf("Acumulado anual do INSS: R$ %.2f\n", acumuladoINSS);
        System.out.printf("Acumulado anual do IRPF: R$ %.2f\n", acumuladoIRPF);

        ms.close();
    }
}
