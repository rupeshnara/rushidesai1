package Banking.child;

import Banking.exceptions.*;
import Banking.interfaces.IAccount;
import Banking.parent.BaseAccount;

public class SavingAccount extends BaseAccount implements IAccount{

    private double interestRate;

    public SavingAccount(double initialBalance) throws InitialBalanceNotValidException {
        super(initialBalance);
    }

    public SavingAccount(double initialBalance, Integer accountNumberClient) throws InitialBalanceNotValidException,
            AccountNumberLengthNotValidException, DuplicateAccountNumberException{
        super(initialBalance, accountNumberClient);
    }

    public void debit(double amount) throws InitialBalanceNotValidException{

        if (initialBalance < amount){

            throw new InitialBalanceNotValidException("Initial balance must be more than zero");
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