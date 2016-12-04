package Banking.child;

import Banking.parent.BaseAccount;

import java.util.Random;

public class SavingAccount extends BaseAccount {

    private double interestRate;

    public void debit(double amount){

        if (this.initialBalance < amount){
            System.out.println("Your balance is less than the requested amount");
        }

        else {
            this.initialBalance = this.initialBalance - amount;
        }
    }

    public double calculateInterest(){
        double interest = this.initialBalance * this.interestRate/100;

        return interest;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "initialBalance=" + initialBalance +
                '}';
    }
}