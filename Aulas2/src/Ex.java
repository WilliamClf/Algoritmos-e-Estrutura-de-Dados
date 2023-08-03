import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe as horas trabalhadas no mes");
        int ht = sc.nextInt();
        System.out.println("Informe o valor hora-aula");
        int vh = sc.nextInt();
        System.out.println("Informe o percentual de desconto");
        int pd = sc.nextInt();

        double sb = ht * vh;

        double td = pd / 100;

        double sl = sb - td;

        System.out.println("Seu salário bruto é de: " + sb);
        System.out.println("Seu salário liquido é de: " + sl);
        sc.close();

    }
}
