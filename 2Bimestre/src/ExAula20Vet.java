import java.util.Arrays;

public class ExAula20Vet {
    public static void main(String[] args) {
        int[] lista = { 9, 8, 7, 5, 3 };

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i] > lista[j]) {
                    int temp = lista[i];
                    lista[i] = lista[j];
                    lista[j] = temp;
                }
                System.out.println(Arrays.toString(lista));
            }

        }
    }
}
