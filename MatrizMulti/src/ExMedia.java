import java.security.SecureRandom;
import java.util.Arrays;

public class ExMedia {
    public static void main(String[] args) {
        double[][] aleatorios = new double[9][7];

        SecureRandom random = new SecureRandom();

        for (int i = 0; i < aleatorios.length; i++) {
            for (int j = i + 1; j < aleatorios[0].length; j++) {
                aleatorios[i][j] = random.nextDouble(0, 101);

            }
        }

    }
}
