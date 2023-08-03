import java.util.Arrays;
import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {
        double matrizA[] = new double[5];
        double matrizB[] = new double[5];
        double matrizC[] = new double[5];
        double matrizD[] = new double[15];
        Random random = new Random();

        for (int index = 0; index < 5; index++) {
            matrizA[index] = Math.floor((random.nextDouble() * 100));
            matrizB[index] = Math.floor((random.nextDouble() * 100));
            matrizC[index] = Math.floor((random.nextDouble() * 100));
        }
        System.out.println("Matriz A: " + Arrays.toString(matrizA));
        System.out.println("Matriz B: " + Arrays.toString(matrizB));
        System.out.println("Matriz C: " + Arrays.toString(matrizC));

        int indexMatrizD = 0;
        for (int index = 0; index < 3; index++) {
            if (index < 5) {
                matrizD[index] = matrizA[index];
            } else if (index < 10) {
                matrizD[index] = matrizB[index - 5];
            } else if (index < 15) {
                matrizD[index] = matrizC[index - 10];
            }
        }
        System.out.println(Arrays.toString(matrizD));

    }
}
