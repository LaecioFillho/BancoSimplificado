package VerificationSegurance;

public class LoginVerificationSegurance {
    

    public String verificationEmail(String email){

        if (email.equals("laecio@exemplo.com")) {
            return "yes";
        } else {
            return "Email incorreto!";
        }
    }

    public String verificationPassword(String password){

        if (password.equals("password")) {
            return "yes";
        } else {
            return "Senha incorreta!";
        }

    }

}
