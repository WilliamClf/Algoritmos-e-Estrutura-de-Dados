import java.util.Scanner;

public class Exerciciondv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean vaga1 = false;
        boolean vaga2 = false;
        boolean vaga3 = false;
        boolean vaga4 = false;
        boolean vaga5 = false;

        int tentativa = 0;

        System.out.println("Informe o número da vaga em que deseja estacionar (de 1 a 5)");
        tentativa = scanner.nextInt();

        if (tentativa == 1 && vaga1 == false) {
            vaga1 = true;
            System.out.println("&stacionado com sucesso!");
        } else if (tentativa == 2 && vaga2 == false) {
            vaga2 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 3 && vaga3 == false) {
            vaga3 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 4 && vaga4 == false) {
            vaga4 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 5 && vaga5 == false) {
            vaga5 = true;
            System.out.println("Estacionado com sucesso!");
        } else {
            System.out.println("Vaga ocupada");
        }

        System.out.println("Informe o número da vaga em que deseja estacionar (de 1 a 5)");
        tentativa = scanner.nextInt();

        if (tentativa == 1 && vaga1 == false) {
            vaga1 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 2 && vaga2 == false) {
            vaga2 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 3 && vaga3 == false) {
            vaga3 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 4 && vaga4 == false) {
            vaga4 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 5 && vaga5 == false) {
            vaga5 = true;
            System.out.println("Estacionado com sucesso!");
        } else {
            System.out.println("Vaga ocupada");
        }

        System.out.println("Informe o número da vaga em que deseja estacionar (de 1 a 5)");
        tentativa = scanner.nextInt();

        if (tentativa == 1 && vaga1 == false) {
            vaga1 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 2 && vaga2 == false) {
            vaga2 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 3 && vaga3 == false) {
            vaga3 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 4 && vaga4 == false) {
            vaga4 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 5 && vaga5 == false) {
            vaga5 = true;
            System.out.println("Estacionado com sucesso!");
        } else {
            System.out.println("Vaga ocupada");
        }

        System.out.println("Informe o número da vaga em que deseja estacionar (de 1 a 5)");
        tentativa = scanner.nextInt();

        if (tentativa == 1 && vaga1 == false) {
            vaga1 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 2 && vaga2 == false) {
            vaga2 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 3 && vaga3 == false) {
            vaga3 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 4 && vaga4 == false) {
            vaga4 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 5 && vaga5 == false) {
            vaga5 = true;
            System.out.println("Estacionado com sucesso!");
        } else {
            System.out.println("Vaga ocupada");
        }

        System.out.println("Informe o número da vaga em que deseja estacionar (de 1 a 5)");
        tentativa = scanner.nextInt();

        if (tentativa == 1 && vaga1 == false) {
            vaga1 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 2 && vaga2 == false) {
            vaga2 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 3 && vaga3 == false) {
            vaga3 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 4 && vaga4 == false) {
            vaga4 = true;
            System.out.println("Estacionado com sucesso!");
        } else if (tentativa == 5 && vaga5 == false) {
            vaga5 = true;
            System.out.println("Estacionado com sucesso!");
        } else {
            System.out.println("Vaga ocupada");
        }

        int vagasdisp = 0;
        int vagasoc = 0;

        if (vaga1 == true) {
            vagasoc = vagasoc + 1;
        } else {
            vagasdisp = vagasdisp = 1;
        }

        if (vaga2 == true) {
            vagasoc = vagasoc + 1;
        } else {
            vagasdisp = vagasdisp = 1;
        }

        if (vaga3 == true) {
            vagasoc = vagasoc + 1;
        } else {
            vagasdisp = vagasdisp = 1;
        }

        if (vaga4 == true) {
            vagasoc = vagasoc + 1;
        } else {
            vagasdisp = vagasdisp = 1;
        }

        if (vaga5 == true) {
            vagasoc = vagasoc + 1;
        } else {
            vagasdisp = vagasdisp = 1;

        }
        System.out.println("Vagas ocupadas " + vagasoc);
        System.out.println("Vagas disponiveis " + vagasdisp);
    }
}
