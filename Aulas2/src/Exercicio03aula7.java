import java.util.Scanner;

public class Exercicio03aula7 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String name = ms.nextLine();

        System.out.println("Informe o sexo:");
        String sexo = ms.nextLine();

        if (sexo == "M") {
            System.out.println("Ilmo. Sr " + name);
        } else if (sexo == "F") {
            System.out.println("Ilma. Sra " + name);
        } else {
            System.out.println("Sexo Informado Inválido");
        }

    }
}
