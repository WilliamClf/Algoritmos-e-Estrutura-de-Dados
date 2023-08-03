import java.math.BigInteger;

public class ListaAt7 {
    public static void main(String[] args) {
        int numqd = 64;
        BigInteger graos = BigInteger.ONE;
        BigInteger somaG = graos;

        for (int i = 2; i <= numqd; i++) {
            graos = graos.multiply(BigInteger.TWO);
            somaG = somaG.add(graos);
        }
        System.out.println("O número total de graos é " + somaG);
    }
}
