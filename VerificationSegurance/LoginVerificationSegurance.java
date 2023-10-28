package VerificationSegurance;

import MainController.BankController;

public class LoginVerificationSegurance {
    

    public String verification(String email, String password){

        if (email.equals("laecio@exemplo.com") && password.equals("12345")) {
            verificationAcepted();
            BankController.Lastlogin();
            return "null";
        } else {
            verificationNegado();
            return "tenteNovamente";
        }
    }

    public void verificationAcepted(){
        System.out.println("______________________________");
        System.out.println("Login reaalizado com sucesso!");
        System.out.println("______________________________");
    }

    public void verificationNegado(){
        System.out.println("__________________");
        System.out.println("Dados Incorretos!");
        System.out.println("Tente novamente!");
        System.out.println("__________________");
    }

}
