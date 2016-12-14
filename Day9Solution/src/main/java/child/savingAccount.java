package child;

import exceptios.AccountNumberLengthNotValidException;
import parent.BaseAccount;

/**
 * Created by harik on 12/12/2016.
 */
public class savingAccount extends BaseAccount {
    private double interestRate;

    public savingAccount(double initialBalance, double interestRate1) {

        super(initialBalance);

        interestRate = interestRate1;
    }

    public savingAccount(double initialBalance, Integer accountNumber1) throws AccountNumberLengthNotValidException {
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
