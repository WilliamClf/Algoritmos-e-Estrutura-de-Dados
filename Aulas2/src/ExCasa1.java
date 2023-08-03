import java.util.Scanner;
import java.util.Random;

public class ExCasa1 {
    // Faça um programa que simule um jogo de adivinhação. O programa deve
    // gerar um número aleatório entre 1 e 100, e pedir para o usuário tentar
    // adivinhar
    // o número. A cada tentativa do usuário, o programa deve informar se o número a
    // ser adivinhado é maior ou menor do que o número informado pelo usuário. O
    // jogo termina quando o usuário acerta o número.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Jogo de adivinhação");
        int resultado = random.nextInt(100) + 1;

        boolean acertou = false;
        do {
            System.out.println("Informe um número de 0 a 100");
            int aposta = sc.nextInt();
            if (aposta < resultado) {
                System.out.println("O resultado é maior");
            } else if (aposta > resultado) {
                System.out.println("O resultado é menor");
            } else {
                acertou = true;
                System.out.println("Voce acertou");
            }
        } while (!acertou);

        sc.close();

    }
}
