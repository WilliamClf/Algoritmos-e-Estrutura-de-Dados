import java.util.Scanner;

public class ExSeq {
    public static void main(String[] args) {
        String[] nomes = { "Golias", "Rodolfo", "Paula", "Maria", "Neymar", "Roberto", "Celso",
                "Jacinto", "João" };
        Scanner ms = new Scanner(System.in);

        System.out.println("Informe o nome para ser pesquisado: ");
        String nome_pesquisa = ms.nextLine();

        boolean encontrado = false;
        // pesquisa sequencial
        // 1- percorrer a lista
        for (int i = 0; i < nomes.length; i++) {
            // 2-comparação
            if (nome_pesquisa.equals(nomes[i])) {
                encontrado = true;
                System.out.println("Nome encontrado no indice " + i);
                break;
            }
            // System.out.println(nomes[i]);
        }
        if (!encontrado) {
            System.out.println(nome_pesquisa + "\nnão foi encontrado");
        }
        ms.close();
    }
}
