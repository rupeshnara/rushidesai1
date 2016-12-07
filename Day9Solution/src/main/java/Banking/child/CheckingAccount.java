package Banking.child;

import Banking.exceptions.AccountNumberLengthNotValidException;
import Banking.exceptions.DuplicateAccountNumberException;
import Banking.exceptions.InitialBalanceNotValidException;
import Banking.interfaces.IAccount;
import Banking.parent.BaseAccount;

public class CheckingAccount extends BaseAccount {

    private int transactionFees = 5;

    public CheckingAccount(double initialBalance) throws InitialBalanceNotValidException {
        super(initialBalance);
    }

    public CheckingAccount(double initialBalance, Integer accountNumberClient) throws InitialBalanceNotValidException,
            AccountNumberLengthNotValidException, DuplicateAccountNumberException{
        super(initialBalance, accountNumberClient);
    }

    public void credit(double amount){

        if (amount <= 0){
            throw new RuntimeException("Amount to be credited must be more than zero");
        }
        else {
            initialBalance = initialBalance + amount;
        }

    }

    public void debit(double amount) throws InitialBalanceNotValidException{

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