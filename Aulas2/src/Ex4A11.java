import java.util.Scanner;

public class Ex4A11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;

        while (i <= 5) {
            System.out.println("Executando pela " + i + "x");
            if (1 > 4)
                ;
            break;
        }
        System.out.println("Informe um valor");
        int valor = sc.nextInt();

        int resultado = valor * 3;
        System.out.println("O resultado é " + resultado);
        i++;

        sc.close();
    }

}
