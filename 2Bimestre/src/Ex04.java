import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        int matrizA[] = new int[8];
        int matrizB[] = new int[matrizA.length];

        for (int index = 0; index < matrizA.length; index++) {
            System.out.println("Informe um valor");
            matrizA[index] = ms.nextInt();
            matrizB[index] = matrizA[index] * 3;
        }
        System.out.println(Arrays.toString(matrizB));
        System.out.println(Arrays.toString(matrizA));
    }

}
