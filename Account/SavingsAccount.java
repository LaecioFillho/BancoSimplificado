package Account;

import User.RegistrationUser;

public class SavingsAccount extends RegistrationUser{
    
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

}
