import java.util.Scanner;

public class ExAula08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor númerico inteiro:");
        double valor1 = sc.nextDouble();

        if (valor1 == 1) {
            System.out.println("Voce entrou o valor 1");
        }

        if (valor1 == 2) {
            System.out.println("Voce entrou o valor 2");
        }

        if (valor1 < 1) {
            System.out.println("Voce entrou um valor muito baixo");
        }

        if (valor1 > 2) {
            System.out.println("Voce entrou um valor muito alto");
        }

        sc.close();
    }
}
