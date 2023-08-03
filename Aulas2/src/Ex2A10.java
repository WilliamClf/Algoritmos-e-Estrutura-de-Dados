import java.util.Scanner;

public class Ex2A10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;

        // enquanto i for menor ou igual a 5 faça:
        while (i <= 5) {
            System.out.println("Informe um valor: ");
            int valorN = sc.nextInt();
            int valorR = valorN * 3;

            System.out.println(valorR);

            i = i + 1;
            // autoincremento
            // i++
        }
        sc.close();

    }
}
