package child;

import bank.BaseAccount;
import bank.EnumAccountType;

/**
 * Created by desair4 on 12/4/2016.
 */
public class CheckingAccount extends BaseAccount {

    //    public static final String TYPE = "Checking";
    public static EnumAccountType TYPE = EnumAccountType.CHECKING;
    private int transactionFees = 5;

    public CheckingAccount(double initialBalance) {
        super(initialBalance, generateAccountHash());
    }

    public CheckingAccount(double initialBalance, Integer accountNumberClient) {
        super(initialBalance, accountNumberClient, generateAccountHash());
    }

    public void credit(double amount) {
        if (amount <= 0) {
//            System.out.println("Please ensure the amount to be deposited is not negative"); //Not valid. we need to throw exceptions to prevent user from generating the client.
            throw new RuntimeException("Please ensure the amount to be deposited is not negative");
        } else {
            initialBalance = initialBalance + amount;
        }
    }

    public void debit(double amount) {
        if (initialBalance < amount + transactionFees) {
//            System.out.println("Your balance is less than the requested amount");  //Not valid. we need to throw exceptions let user know this method was unsuccessfull
            throw new RuntimeException("Your balance is less than the requested amount");
        } else {
//            this.initialBalance = this.initialBalance - amount - transactionFees;
            initialBalance = initialBalance - amount - transactionFees; //try to avoid 'this'
        }
    }

    public void print() {
        System.out.println("Checking");
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