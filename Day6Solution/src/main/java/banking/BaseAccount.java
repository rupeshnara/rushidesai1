package banking;

/**
 * Created by saikrishnareddy on 12/8/2016.
 */
public class BaseAccount {

    protected double initialBalance;
    private int accountHash;
    //long accountNumber;

    public int getAccountHash() {
        return accountHash;
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
}

