import java.util.Arrays;
import java.util.Random;

public class Ex9 {
    // 9-Um agricultor está colhendo sua safra de soja e está na expectativa de ter
    // umaprodução recorde por hectare nesta safra. Ele pegou uma amostragem de 100
    // hectares de
    // seus mais de 1200 hectares para poder avaliar se sua produção foi maior que a
    // da última safra do mesmo período do ano anterior, que foi de 150 sacas por
    // hectare.
    // Para esse exercício, gere uma lista de 100 posições com valores inteiros
    // entre 90 a 170
    // para representar essa taxa de amostragem. Em seguida, utilize o método de
    // ordenação
    // para ordenar a lista e busque na lista os valores maiores que 160 e em
    // seguida valide se a
    // quantidade de valores acima de 160 é superior a 75% do total de hectares da
    // amostragem.
    // Caso seja igual ou maior a 75% imprima a mensagem "Safra recorde! Amostragem
    // com x%
    // a mais de hectares acima do último ano." e caso seja menor que 75% imprima a
    // mensagem "Amostragem com x% a mais de hectares acima do último ano." para que
    // produtor saiba quanto produziu a mais nesse período.
    public static void main(String[] args) {
        Random rd = new Random();
        int[] lista = new int[100];

        for (int i = 0; i < 100; i++) {
            lista[i] = rd.nextInt(90, 171);
        }

        for (int i = 0; i < lista.length; i++) {
            for (int j = i + 1; j < lista.length; j++)
                if (lista[i] > lista[j]) {
                    int temp = lista[i];
                    lista[i] = lista[j];
                    lista[j] = temp;
                }

        }

        int contador = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > 160) {
                contador++;
            }
        }

        double porcentagem = (double) contador / lista.length * 100;

        if (porcentagem >= 75) {
            System.out.printf("Safra recorde! Amostragem com %.2f%% a mais de hectares acima do último ano.%n",
                    porcentagem);
        } else {
            System.out.printf("Amostragem com %.2f%% a mais de hectares acima do último ano.%n", porcentagem);
        }
        System.out.println(Arrays.toString(lista));
    }

}
