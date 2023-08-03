import java.util.Scanner;

public class ListaAt10 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        Scanner ms2 = new Scanner(System.in);
        double areaTotal = 0;
        double areaComodo = 0;
        double comprimentoComodo = 0;
        double larguraComodo = 0;
        String nomeComodo;
        String continuar = "";
        do {
            // nextLine --pergunta do nome do comodo
            System.out.println("Informe o nome do comodo");
            nomeComodo = ms2.nextLine();

            // nextDouble --pergunta da largura do comodo
            System.out.println("Informe a largura do comodo");
            larguraComodo = ms.nextDouble();

            // nextDouble -- pergunta do comprimento do comodo
            System.out.println("Informe o comprimento");
            comprimentoComodo = ms.nextDouble();

            // calculo da area desse comodo
            areaComodo = larguraComodo * comprimentoComodo;

            // impressao nome,largura,comprimento,areaComodo
            System.out.println(
                    "Nome:" + nomeComodo + "\n" +
                            "Comprimento:" + comprimentoComodo + "\n" +
                            "Largura:" + larguraComodo + "\n" +
                            "Area:" + areaComodo);

            // armazenar a area total da residencia
            areaTotal = areaTotal + areaComodo;

            // fazer a pergunta. deseja continuar...?
            System.out.println("Deseja continuar? SIM/NAO");
            continuar = ms2.nextLine();
        } while (continuar.equals("SIM"));
        // impressão da area total da residencia
        System.out.println("Area Total:" + areaTotal);
        ms2.close();
        ms.close();
    }
}
