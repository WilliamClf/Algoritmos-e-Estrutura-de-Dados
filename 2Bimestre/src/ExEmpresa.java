import java.util.Random;

public class ExEmpresa {
    public static void main(String[] args) {
        int[] totalImpressoes = new int[100];

        Random random = new Random(100);
        // passo 1- gerar 100 valores aleatoriamente com o random
        for (int indice = 0; indice <= totalImpressoes.length; indice++) {
            totalImpressoes[indice] = random.nextInt() + 1;
        }

        System.out.println();
    }
}
