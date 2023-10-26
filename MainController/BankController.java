package MainController;

import java.util.Date;
import java.util.Scanner;
import Account.CurrentAccount;
import User.RegistrationUser;
import VerificationSegurance.LoginVerificationSegurance;

public class BankController {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = "não";

        while (s.equals("não") || s.equals("Não")) {

            System.out.println();
            System.out.println("Seja Bem vindo(a)!");
            System.out.println("__________________________");
            System.out.println("1 - Entrar na conta");
            System.out.println("2 - Abrir conta Poupança.");
            System.out.println("3 - Abrir conta Corrente.");
            System.out.println();
            System.out.print("Escolha a opção que deseja: ");
            int option = input.nextInt();
            

            switch (option) {
                case 1:
                    loginAccount();
                    break;
                case 2:
                    openSavingsAccount();
                    break;
                case 3:
                    openCurrentAccount();
                    break;
                default:
                    break;
            }
        }
    }

    public static void loginAccount() {

        Scanner input = new Scanner(System.in);
        LoginVerificationSegurance verification = new LoginVerificationSegurance();

        System.out.println("Realize o seu login");
        System.out.println("____________________");
        System.out.println("Email: ");
        verification.verificationEmail(input.next());
        System.out.println("Senha: ");
        verification.verificationPassword(input.next());

    }

    public static void openSavingsAccount() {

        Scanner input = new Scanner(System.in);
        RegistrationUser registration = new RegistrationUser(null, null, null, null);
        
        System.out.println("Abra sua conta poupança, simples, rapido e facil!");
        System.out.println("_________________________________________________");
        System.out.print("Digite seu nome: ");
        registration.setName(input.nextLine());
        System.out.println("Digite sua data de nascimento: ");
        //registration.setbirth( input.nextInt());
        System.out.println("Digite seu email: ");
        registration.setEmail(input.nextLine());
        System.out.println("Digite uma senha: ");
        registration.setPassword(input.nextLine());
        System.out.println("Confirme a senha: ");

    }

    public static void openCurrentAccount() {

        System.out.println("Abra sua Conta Corrente, simples, rapido e facil!");
        System.out.println("A conta corrente possui uma taxa mensal de " + CurrentAccount.getMonthlypayment());
        System.out.println("_________________________________________________");
        System.out.println("Digite seu nome: ");
        System.out.println("Digite sua data de nascimento: ");
        System.out.println("Digite seu email: ");
        System.out.println("Digite uma senha: ");
        System.out.println("Confirme a senha: ");
        

    }

    public static void Lastlogin() {

        System.out.println("Escolha a opção que deseja: ");
        System.out.println("___________________________");
        System.out.println("1 - Abrir conta Poupança.");
        System.out.println("2 - Abrir conta Corrente.");
        System.out.println("3 - Consutar Informações da Conta.");
        System.out.println("4 - Cancelar conta.");
        System.out.println();
        System.out.println("Deseja encerrar?");
    }
}
