import java.util.Scanner;
import java.util.Random;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jogador 1, informe seu nome:");
        String jogador1 = scanner.nextLine();

        System.out.println("Jogador 2, Informe seu nome:");
        String jogador2 = scanner.nextLine();

        System.out.println("Jogador1, informe sua jogada (cara ou coroa) ");
        String jogadaj1 = scanner.nextLine();

        System.out.println("Jogador2, informe sua jogada(cara ou coroa)");
        String jogadaj2 = scanner.nextLine();

        Random random = new Random();
        int resultado = random.nextInt(1);

        // zero = cara
        // um = coroa

        String resultadot;

        if (resultado > 0) {
            resultadot = "coroa";
        } else {
            resultadot = "cara";
        }
        if (jogadaj1.equals(jogadaj2) && jogadaj1.equals(resultadot)) {
            System.out.println("Empate!");
        } else if (jogadaj1.equals(resultadot)) {
            System.out.println("" + jogador1 + " é o vencedor!");
        } else if (jogadaj2.equals(resultadot)) {
            System.out.println("" + jogador2 + " é o vencedor!");
        } else {
            System.out.println("Não houve um ganhador :(");
        }
        scanner.close();

    }
}
