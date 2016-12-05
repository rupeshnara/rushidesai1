package Banking.child;

import Banking.parent.BaseAccount;

import java.util.Random;

public class SavingAccount extends BaseAccount {

    private double interestRate;

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public SavingAccount(double initialBalance, Integer accountNumberClient) {
        super(initialBalance, accountNumberClient);
    }

    public void debit(double amount){

        if (initialBalance < amount){

            throw new RuntimeException("Initial balance must be more than zero");
        }

        else {
            initialBalance = initialBalance - amount;
        }
    }

    public double calculateInterest(){
        double interest = this.initialBalance * this.interestRate/100;

        return interest;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate1) {
        interestRate = interestRate1;
    }

    @Override
    public String toString() {
        return "Saving Account Initial Balance {" + initialBalance +
                "Interest Rate=" + interestRate +
                "} " + super.toString();
    }
}