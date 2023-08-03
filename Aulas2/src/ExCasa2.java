import java.util.Scanner;

public class ExCasa2 {
    // Faça um programa que calcule a média de um conjunto de números
    // informados pelo usuário. O programa deve continuar pedindo números até que
    // o usuário informe um valor negativo.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        double somatoria = 0;
        double num = 0;
        boolean continua = true;
        do {
            System.out.println("Informe um número");
            num = sc.nextDouble();
            continua = num >= 0;

            if (continua) {
                contador = contador + 1; // == contador++;
                somatoria = somatoria + num;
            }

        } while (num >= 0);
        double media = somatoria / contador;
        System.out.printf("A média é %2f e %d é igual a: %2f", somatoria, contador, media);

        sc.close();
    }
}
