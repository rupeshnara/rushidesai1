package Banking.child;

import Banking.parent.BaseAccount;

import java.util.Random;

public class CheckingAccount extends BaseAccount {

    private int transactionFees = 5;

    public void credit(double amount){

        if (amount <= 0){
            System.out.println("Please ensure the amount to be deposited is not negative");
        }
        else {
            this.initialBalance = this.initialBalance + amount;
        }

    }

    public void debit(double amount){

        if (this.initialBalance < amount + transactionFees){
            System.out.println("Your balance is less than the requested amount");
        }

        else {
            this.initialBalance = this.initialBalance - amount - transactionFees;
        }
    }

    public double getTransactionFees() {
        return transactionFees;
    }

    public void setTransactionFees(int transactionFees) {
        this.transactionFees = transactionFees;
    }

    @Override
    public String toString() {
        return "Banking.child.CheckingAccount{" +
                "initialBalance=" + initialBalance +
                '}';
    }
}