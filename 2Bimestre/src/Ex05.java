import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        double matrizA[] = new double[20];
        double matrizB[] = new double[20];
        double matrizC[] = new double[20];

        for (int index = 0; index < 20; index++) {
            System.out.printf("\nInforme o valor do indice %d para a matriz A", index);
            matrizA[index] = ms.nextDouble();

            System.out.printf("\nInforme o valor do indice %d para a matriz B", index);
            matrizB[index] = ms.nextDouble();

            matrizC[index] = matrizA[index] - matrizB[index];

        }
        for (int index = 0; index < 20; index++)
            System.out.println(matrizC[index]);
    }

}
