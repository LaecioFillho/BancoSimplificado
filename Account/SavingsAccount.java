package Account;

import java.util.Date;
import User.RegistrationUser;

public class SavingsAccount extends RegistrationUser{
    
    public SavingsAccount(String name, String email, Date birth, String password) {
        super(name, email, birth, password);
    }

    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

}
