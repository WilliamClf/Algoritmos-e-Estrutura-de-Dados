import java.util.Scanner;

public class Exercicio02aula07 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        System.out.println("Informe a nota: ");
        double nota1 = ms.nextDouble();

        System.out.println("Informe a nota: ");
        double nota2 = ms.nextDouble();

        System.out.println("Informe a nota: ");
        double nota3 = ms.nextDouble();

        System.out.println("Informe a nota: ");
        double nota4 = ms.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Aprovado, parabéns!");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("Sua média é: " + media);
        ms.close();

    }
}
