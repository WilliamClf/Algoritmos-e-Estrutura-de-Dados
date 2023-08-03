import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int[][] matrizA = {
                { 2, 4, 3 },
                { 4, 20, 12 },
                { 3, 25, 8 },
                { 11, 22, 42 },
                { 7, 21, 35 }
        };

        int valor = matrizA[2][1];
        System.out.println(valor);

        for (int linha = 0; linha < matrizA.length; linha++) {
            // System.out.println(Arrays.toString(matrizA[linha]));
            for (int coluna = 0; coluna < matrizA[linha].length; coluna++) {
                System.out.println(matrizA[linha][coluna]);
            }
            System.out.println();
        }

    }
}
