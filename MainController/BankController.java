package MainController;

import java.util.Scanner;
import Account.CurrentAccount;
import Account.SavingsAccount;
import VerificationSegurance.LoginVerificationSegurance;

public class BankController {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = "não";

        while (s.equals("não") || s.equals("Não")) {

            System.out.println();
            System.out.println("Seja Bem vindo(a)!");
            System.out.println();
            System.out.println("O que você deseja?");
            System.out.println("__________________________");
            System.out.println("1 - Entrar na conta");
            System.out.println("2 - Abrir conta Poupança.");
            System.out.println("3 - Abrir conta Corrente.");
            System.out.println("4 - Sair");
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
                    s = "sim";
                    break;
            }
        }
    }

    public static void loginAccount() {

        Scanner input = new Scanner(System.in);
        LoginVerificationSegurance verification = new LoginVerificationSegurance();
        String acess = "tenteNovamente";

        while (acess.equals("tenteNovamente")) {
        
        System.out.println();
        System.out.println("Realize o seu login");
        System.out.println("____________________");
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Senha: ");
        String password = input.nextLine();

        acess = verification.verification(email, password);

        }
        
    }

    public static void openSavingsAccount() {

        Scanner input = new Scanner(System.in);
        String resgistration = "yes";

        while (resgistration.equals("yes")) {
                    
        System.out.println();
        System.out.println("_________________________________________________");
        System.out.println("Abra sua conta poupança, simples, rapido e facil!");
        System.out.println("_________________________________________________");
        System.out.println();
        System.out.print("Digite seu nome: ");
        String name = input.nextLine();
        //System.out.println("Digite sua data de nascimento: ");
        //savingsAccount.setbirth( input.nextInt());
        System.out.print("Digite seu email: ");
        String email = input.nextLine();
        System.out.print("Digite uma senha: ");
        String password= input.nextLine();
        System.out.print("Confirme a senha: ");

        SavingsAccount savingsAccount = new SavingsAccount(name, email, null, password);
        System.out.println();
        System.out.println("____________________");
        System.out.println("Cadastro realizado!");
        System.out.println("____________________");
        resgistration = "no";

        }
        
    }

    public static void openCurrentAccount() {

        Scanner input = new Scanner(System.in);
        CurrentAccount currentAccount = new CurrentAccount(null, null, null, null);

        System.out.println("Abra sua Conta Corrente, simples, rapido e facil!");
        System.out.println("A conta corrente possui uma taxa mensal de " + CurrentAccount.getMonthlypayment());
        System.out.println("_________________________________________________");
        System.out.println("Digite seu nome: ");
        currentAccount.setName(input.nextLine());
        //System.out.println("Digite sua data de nascimento: ");
        //currentAccount.setbirth(input.nextLine().formatted(Date));
        System.out.println("Digite seu email: ");
        currentAccount.setEmail(input.nextLine());
        System.out.println("Digite uma senha: ");
        currentAccount.setPassword(input.nextLine());
        System.out.println("Confirme a senha: ");
        
    }

    public static void Lastlogin() {

        Scanner input = new Scanner(System.in);
        int option = 0;

        while (option == 0) {
        
        System.out.println("Olá Sr. xxxxxx. O que deseja: ");
        System.out.println("___________________________");
        System.out.println("1 - Consutar Informações da Conta.");
        System.out.println("2 - Cancelar conta.");
        System.out.println();
        System.out.println("Deseja encerrar?");
        option = input.nextInt();

        }
    }
}
