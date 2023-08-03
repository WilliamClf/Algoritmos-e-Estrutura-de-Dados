import java.util.Arrays;
import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class ExPesBi02 {
    public static void main(String[] args) {
        String[] nomes = { "Golias", "Rodolfo", "Paula", "Maria", "Neymar", "Roberto", "Celso",
                "Jacinto", "João" };
        Scanner ms = new Scanner(System.in);

        System.out.println("Informe o nome para ser pesquisado: ");
        String nome_pesquisa = ms.nextLine();

        // 1- ordenar a lista

        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = i + 1; j < nomes.length; j++) {
                if (nomes[i].compareToIgnoreCase(nomes[j]) > 0) {
                    String tempNome = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = tempNome;

                }
            }
        }

        System.out.println(Arrays.toString(nomes));
        // 2- inicializar as variaveis de controle
        int indiceInicio = 0;
        int indiceFinal = nomes.length - 1;
        int achou = -1;
        // 3- percorrer a lista

        while (indiceInicio <= indiceInicio) {
            int indiceMeio = (int) (indiceInicio + indiceFinal) / 2;

            int comparaçao = nomes[indiceMeio].compareToIgnoreCase(nome_pesquisa);

            if (comparaçao < 0) {
                indiceInicio = indiceMeio + 1;
            } else if (comparaçao > 0) {
                indiceFinal = indiceMeio - 1;
            } else {
                achou = indiceMeio;
                break;
            }

        }
        if (achou >= 0) {
            System.out.println("Nome " + nome_pesquisa + "encontrando no indice " + achou);
        } else {
            System.out.println("Nome" + nome_pesquisa + "Não encontrado");
        }
        ms.close();
    }
}