package banking;

/**
 * Created by saikrishnareddy on 12/4/2016.
 */
public class CheckingAccount extends BaseAccount {

    final int fee = 5;
    //private double initialBalance;

    public CheckingAccount(double initialBalance) {
        setInitialBalance(initialBalance);
    }

    /*public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }*/

    /*public void credit(double amount) {
        if (amount > 0) {
            System.out.println("Account Ballance after credit:" + (initialBalance = initialBalance + amount));
        } else {
            System.out.println("Please ensure the amount to be deposited is not negative or zero:");
        }
    }*/

    public void debit(double amount) {
        if (amount < 0.0) {
            System.out.println("Please enter valid amount");
        } else if (initialBalance < amount + fee) {
            System.out.println("You don't have sufficient balance to do this transaction, Available Balance:" + initialBalance);
        } else {
            System.out.println("Please note, fee for this transaction is $" + fee);
            System.out.println("Account Balance after withdraw:" + (initialBalance = initialBalance - amount - fee));
        }
    }
}
