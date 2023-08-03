import java.util.Scanner;

public class Ex3Aula9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número");
        int numero = sc.nextInt();

        if ((numero >= 20) && (numero <= 90)) {
            System.out.println("o numero esta na faixa de 20 a 90");
        } else {
            System.out.println("O numero esta fora da faixa de 20 a 90");
        }
        sc.close();
    }
}
