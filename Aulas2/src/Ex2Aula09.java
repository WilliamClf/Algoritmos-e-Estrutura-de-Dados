import java.util.Scanner;

public class Ex2Aula09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu salário: ");
        double sa = sc.nextDouble();

        double ns = 0;
        // valor * percentual / 100 | regra de tres
        if (sa < 500) {
            ns = sa + ((sa * 15) / 100);
        } else if ((sa <= 1000)) {
            ns = sa + ((sa * 10) / 100);
        } else {
            ns = sa + ((sa * 5) / 100);
        }

        System.out.println("Seu sálario é de:" + ns);
    }
}
