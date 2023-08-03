import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomes[] = new String[10];

        int index = 0;

        while (index < 10) {
            System.out.println("Informe o seu nome: ");
            nomes[index] = scanner.nextLine();
            index++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("\nO nome na posição %d é: %s ", (i + 1), nomes[i]);
        }

    }
}
