import java.util.Scanner;

public class ExA11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;

        do {
            System.out.printf("Executando pela %d\n", i);
            System.out.println("Informe um valor:");
            int valorN = sc.nextInt();
            int valorR = valorN * 3;

            System.out.println(valorR);
            i = i + 1;

        } while (!(i > 5));

    }
}
