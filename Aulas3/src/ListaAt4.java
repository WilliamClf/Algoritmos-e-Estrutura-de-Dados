public class ListaAt4 {
    public static void main(String[] args) {
        int base = 3;
        int exp = 0;
        int resultado = 1;

        while (exp <= 15) {
            System.out.println(resultado);
            resultado *= base;
            exp++;
        }
    }
}
