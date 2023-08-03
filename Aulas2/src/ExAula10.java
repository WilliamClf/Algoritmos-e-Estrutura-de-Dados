import java.util.Scanner;

public class ExAula10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro nome");
        String nome1 = sc.nextLine();
        System.out.println("Informe o genero da primeira pessoa");
        char genero1 = sc.next().charAt(0);

        System.out.println("Informe o segundo nome");
        String nome2 = sc.next();
        System.out.println("Informe o genero da segunda pessoa");
        char genero2 = sc.next().charAt(0);

        if (genero1 == 'M' ^ genero2 == 'M') {
            System.out.printf("%s e %s formam par!\n", nome1, nome2);
        } else {
            System.out.printf("%s e %s não formam par!\n", nome1, nome2);
        }

        sc.close();
    }
}
