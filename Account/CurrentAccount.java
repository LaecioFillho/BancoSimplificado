package Account;

import User.RegistrationUser;

public class CurrentAccount extends RegistrationUser{

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
