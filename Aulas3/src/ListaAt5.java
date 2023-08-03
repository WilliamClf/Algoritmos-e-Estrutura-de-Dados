
public class ListaAt5 {
    public static void main(String[] args) {
        int anterior = 0;
        int atual = 1;
        int proximo;

        System.out.println(anterior);
        for (int i = 0; i < 10; i++) {
            System.out.println(atual);
            proximo = atual + anterior;
            anterior = atual;
            atual = proximo;
        }
    }

}
