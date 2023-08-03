import java.util.Scanner;

public class ListaAt9 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (true) {

            System.out.println("Informe um valor positivo inteiro (ou um valor negativo para encerrar): ");
            int valor = ms.nextInt();

            if (valor < 0) {
                break;
            }
            if (valor > maior) {
                maior = valor;
            }
            if (valor > menor) {
                menor = valor;
            }

        }
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        ms.close();
    }
}
