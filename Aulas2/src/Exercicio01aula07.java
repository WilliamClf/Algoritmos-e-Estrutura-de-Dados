import java.util.Scanner;

public class Exercicio01aula07 {
    public static void main(String[] args) {

        Scanner ms = new Scanner(System.in);
        System.out.println("Informe o valor de A:");
        double a = ms.nextDouble();

        System.out.println("Informe o valor de B:");
        double b = ms.nextDouble();

        System.out.println("Informe o valor de C:");
        double c = ms.nextDouble();

        double resultado = a + b + c;

        if (resultado >= 100) {
            System.out.println("O resultado é: " + resultado);
        }
        ms.close();
    }
}
