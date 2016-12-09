package child;


import Banking.BaseAccount;
import exceptions.AccountNumberLengthNotValid;

/**
 * Created by Venkat Ramana on 12/8/2016.
 */
public class SavingsAccount extends BaseAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate1) {

        super(initialBalance);

        interestRate = interestRate1;
    }

    public SavingsAccount(double initialBalance, Integer accountNumber1) throws AccountNumberLengthNotValid {
        super(initialBalance, accountNumber1);
    }

    public void debit(double amount) {

        if (initialBalance < amount) {
            System.out.println("Your balance is less than the requested amount");
        } else {
            initialBalance = initialBalance - amount;
        }
    }

    public double calculateInterest() {
        return initialBalance * interestRate / 100;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                "} " + super.toString();
    }
}
