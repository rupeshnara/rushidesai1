package solutions;

/**
 * Created by saikrishnareddy on 12/4/2016.
 */
public class SavingsAccount {

    private double initialBalance;
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        setInitialBalance(initialBalance);
        setInterestRate(interestRate);
    }
    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public void credit(double amount) {
        if (amount > 0) {
            System.out.println("Account Ballance after credit:" + (initialBalance = initialBalance + amount));
        } else {
            System.out.println("Please ensure the amount to be deposited is not negative or zero:");
        }
    }

    public void debit(double amount) {
        if (amount == initialBalance || amount <= initialBalance) {
            System.out.println("Account Ballance after withdraw:" + (initialBalance = initialBalance - amount));
        } else {
            System.out.println("Please enter valid amount");
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        System.out.println("Account Ballance after intrest:" + (initialBalance = initialBalance + initialBalance * interestRate));
    }
}
