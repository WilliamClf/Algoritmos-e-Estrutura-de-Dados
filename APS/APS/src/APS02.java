import java.security.SecureRandom;
import java.util.Arrays;

public class APS02 {
    // 6 - Elaborar um programa que leia uma matriz A do tipo inteira de duas
    // dimensões
    // com sete linhas e sete colunas.
    // Construir a matriz B de mesma dimensão, em que cada elemento seja o somatório
    // de 1 até o valor armazenado na posição da matriz A,
    // com exceção dos valores situados nos índices ímpares da diagonal principal
    // (B[1,1], B[3,3],
    // B[5,5] e B[7,7]), os quais devem ser o fatorial de cada elemento
    // correspondente da
    // matriz A. Apresentar ao final a matriz B.
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        int A[][] = new int[7][7];
        int B[][] = new int[7][7];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = random.nextInt(0, 10);
            }
            System.out.println(Arrays.toString(A[i]));

        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (i == j && i % 2 != 0) {
                    int fatorial = 1;
                    for (int f = 1; f <= A[i][j]; f++) {
                        fatorial *= f;
                    }
                    B[i][j] = fatorial;
                } else {
                    int soma = 0;
                    for (int s = 1; s <= A[i][j]; s++) {
                        soma += s;
                    }
                    B[i][j] = soma;
                }
            }
        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }
}