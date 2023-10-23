package MainController;

import java.util.Scanner;

public class BankController {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = "não";

        while (s.equals("não") || s.equals("Não")) {

            System.out.println();
            System.out.println("Seja Bem vindo(a)!");
            System.out.println();
            System.out.println("Escolha a opção que deseja: ");
            System.out.println("1 - Abrir conta Poupança.");
            System.out.println("2 - Abrir conta Corrente.");
            System.out.println("3 - Consutar Informações da Conta.");
            System.out.println("4 - Cancelar conta.");
            System.out.println();
            System.out.println("Deseja encerrar?");
            s = input.nextLine();

        }

    }
}
