import java.util.Scanner;

public class Ex5Aula9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o sexo da pessoa");
        String sexo = sc.nextLine();

        if ((!(sexo.equals("M") || sexo.equals("F")))) {
            System.out.println("Sexo inválido");
        } else {
            System.out.println("Sexo válido");
        }
        sc.close();

        // boolean isValid = !(sexo.equals("M") || sexo.equals("F"));
        // if (isValid) {
        // System.out.println("Sexo inválido");
        // } else {
        // System.out.println("Sexo válido");
        // }

    }

}
