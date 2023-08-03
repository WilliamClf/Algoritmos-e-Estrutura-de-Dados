public class ListaAt06 {
    public static void main(String[] args) {
        int c = 0;
        double fh;

        for (int i = 0; i <= 10; i++) {
            System.out.println("Temperatura em celsius: " + c);
            c = c + 10;
            fh = ((c * 1.8) + 32);
            System.out.println("Temperatura em fahrenheit: " + fh);
        }
    }
}
