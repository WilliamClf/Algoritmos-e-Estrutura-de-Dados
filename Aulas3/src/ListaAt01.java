import java.util.Scanner;

public class ListaAt01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int i = 0;

        while (i <= 100) {
            soma += i;
            i++;
        }
        System.out.println(" A soma de 1 a 100 é " + soma);
        sc.close();
    }
}
