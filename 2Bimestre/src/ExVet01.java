import java.util.Arrays;

public class ExVet01 {
    public static void main(String[] args) {
        int[] listaINT = { 1, 2, 3, 4, 5, 6 };
        String[] listaString = { "teste1", "teste2", "teste3", "teste4" };
        double[] listaDouble = { 0.1, 0.2, 0.4 };

        System.out.println(Arrays.toString(listaINT));
        for (int i = 0; i < listaINT.length; i++) {
            System.out.println("Indice ou index" + i + " - Valor:" + listaINT[i]);
        }
    }
}
