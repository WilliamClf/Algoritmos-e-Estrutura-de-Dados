import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        // matriz unidimensional ou vetor
        int[] matriz = new int[5];

        int[][] matriz2d = new int[2][3];
        int[][] matriz_2d = {
                { 1, 3, 4 },
                { 1, 4, 5 },
                { 2, 4, 20 }
        };

        int[] linha1 = matriz_2d[2];
        System.out.println(Arrays.toString(linha1));
    }
}