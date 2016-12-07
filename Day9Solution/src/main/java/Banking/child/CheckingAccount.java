package Banking.child;

import Banking.interfaces.IAccount;
import Banking.parent.BaseAccount;

public class CheckingAccount extends BaseAccount {

    private int transactionFees = 5;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    public CheckingAccount(double initialBalance, Integer accountNumberClient) {
        super(initialBalance, accountNumberClient);
    }

    public void credit(double amount){

        if (amount <= 0){
            throw new RuntimeException("Amount ot be credited must be more than zero");
        }
        else {
            initialBalance = initialBalance + amount;
        }

    }

    public void debit(double amount){

        if (initialBalance < amount + transactionFees){
            System.out.println("Your balance is less than the requested amount");
        }

        else {
            initialBalance = initialBalance - amount - transactionFees;
        }
    }

    public double getTransactionFees() {
        return transactionFees;
    }

    public void setTransactionFees(int transactionFees1) {
        transactionFees = transactionFees1;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" + initialBalance +
                "transactionFees=" + transactionFees +
                "} " + super.toString();
    }
}