public class ListaAt2 {
    public static void main(String[] args) {
        int soma = 0;
        int num = 1;

        do {
            if (num % 2 == 0) {
                soma += num;
            }
            num++;
        } while (num <= 500);
        System.out.println("A soma dos números pares de 1 a 500 é " + soma);
    }
}
