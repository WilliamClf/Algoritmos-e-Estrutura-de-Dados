import java.util.Arrays;
import java.util.Scanner;

public class ExAgenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Array bidimensional - 10 linhas - 5 colunas
        String[][] matriz_2d = new String[2][5];
        // Percorrro a matriz no sentido da linha (vertical)
        for (int i = 0; i < matriz_2d.length; i++) {
            System.out.printf("\n\n\nCadastro usuário %d \n\n", i + 1);
            // Ler atribuir para coluna nome
            System.out.print("Informe o nome do usuário: ");
            String nome = scanner.nextLine();
            matriz_2d[i][0] = nome;

            // Ler atribuir para coluna endereço
            // System.out.print("Informe o endereço do usuário: ");
            // String endereco = scanner.nextLine();
            // matriz_2d[i][1] = endereco;

            // Ler atribuir para coluna código postal
            // System.out.print("Informe o código postal do usuário: ");
            // String cep = scanner.nextLine();
            // matriz_2d[i][2] = cep;

            // Ler atribuir para coluna bairro
            // System.out.print("Informe o bairro do usuário: ");
            // String bairro = scanner.nextLine();
            // matriz_2d[i][3] = bairro;

            // Ler atribuir para coluna telefone
            // System.out.print("Informe o telefone do usuário: ");
            // String telefone = scanner.nextLine();
            // matriz_2d[i][4] = telefone;
        }

        for (int i = 0; i < matriz_2d.length; i++) {
            for (int j = i + 1; j < matriz_2d.length; i++) {
                if (matriz_2d[i][0].compareToIgnoreCase(matriz_2d[j][0]) > 0) {
                    // troca de nome
                    String temp = matriz_2d[1][0];
                    matriz_2d[1][0] = matriz_2d[0][i];
                    matriz_2d[0][i] = temp;

                }
            }
        }
        System.out.println();
        System.out.println(Arrays.deepToString(matriz_2d));
        scanner.close();
    }
}