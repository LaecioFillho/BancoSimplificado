package Account;

import java.util.Date;

import User.RegistrationUser;

public class CurrentAccount extends RegistrationUser{

    public CurrentAccount(String name, String email, Date birth, String password) {
        super(name, email, birth, password);
    }

    private double balance;
    private static final float monthlyPayment = 14.99f;
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }

    public static float getMonthlypayment() {
        return monthlyPayment;
    }
}
