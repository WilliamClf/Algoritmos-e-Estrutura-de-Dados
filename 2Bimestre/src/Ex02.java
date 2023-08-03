
import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        double medias[] = new double[8];
        int index = 0;
        do {
            System.out.printf("Informe a média %d:", (index + 1));
            medias[index] = ms.nextDouble();
            index++;
        } while (index < 8);
        System.out.println(Arrays.toString(medias));

        double somaMedias = 0;
        for (int i = 0; i < 8; i++) {
            somaMedias += medias[1];
            // somaMedias = somaMedias + medias[1];
        }

        double mediaAlunos = somaMedias / 8;
        System.out.println("A média dos 8 alunos é " + mediaAlunos);
        ms.close();

    }

}