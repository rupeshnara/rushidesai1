package child;

import Banking.BaseAccount;
import exceptions.AccountNumberLengthNotValid;

/**
 * Created by Venkat Ramana on 12/8/2016.
 */
public class CheckingAccount extends BaseAccount {
    private int transactionFees = 5;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    public CheckingAccount(double initialBalance, Integer accountNumberClient) throws AccountNumberLengthNotValid {
        super(initialBalance, accountNumberClient);
    }

    public void credit(double amount) {
        if (amount <= 0) {
            //needs to throw error if amount<0
            throw new RuntimeException("Please ensure the amount to be deposited is not negative");
        } else {
            initialBalance = initialBalance + amount;
        }
    }

    public void debit(double amount) {
        if (initialBalance < amount + transactionFees) {

            throw new RuntimeException("Your balance is less than the requested amount");
        } else {

            initialBalance = initialBalance - amount - transactionFees;
        }
    }

    public double getTransactionFees() {
        return transactionFees;
    }

    public void setTransactionFees(int transactionFees) {
        transactionFees = transactionFees;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "transactionFees=" + transactionFees +
                "} " + super.toString();
    }
}

