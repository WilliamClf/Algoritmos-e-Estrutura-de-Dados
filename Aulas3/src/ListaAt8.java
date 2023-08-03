import java.util.Scanner;

public class ListaAt8 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        int soma = 0;
        int valor = 0;
        int conta = 0;

        do {
            System.out.println("Digite um valor positivo(ou um valor negativo para sair): ");
            valor = ms.nextInt();
            if (valor >= 0) {
                conta++;
                soma += valor;
            }
        } while (valor >= 0);
        double av = conta > 0 ? (double) soma / conta : 0;

        System.out.println("Total de valores lidos: " + conta);
        System.out.println("Somatório doa valores lidos:" + soma);
        System.out.println("Média dos valores lidos: " + av);
        ms.close();
    }
}
