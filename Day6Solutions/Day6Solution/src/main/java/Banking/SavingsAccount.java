package Banking;

public class SavingsAccount extends BaseAccount{

    private double interestRate;

    //constructor with initialBalance and invoking super class constructor
    public SavingsAccount(double initialBalance) {

        super(initialBalance, generateAccountHash());

        interestRate = interestRate;
    }

    public SavingsAccount(double initialBalance, Integer accountNumber1) {
        super(initialBalance, accountNumber1, generateAccountHash());
    }

    //a method for creating debit
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

	

