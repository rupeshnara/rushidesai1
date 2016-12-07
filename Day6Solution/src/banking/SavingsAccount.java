package banking;

public class SavingsAccount extends BaseAccount {
    private double interestRate;

    public SavingsAccount(double balance, double interest) {
        super(intialBalance);
        interestRate = interest;
    }
    public void setInterestRate(double interest) {
        this.interestRate = interest;
    }

    public void debit(double amount){

        if (initialBalance < amount){

            throw new RuntimeException("Initial balance must be more than zero");
        }

        else {
            initialBalance = initialBalance - amount;
        }
    }
    public double getInterestRate() {
        return interestRate;
    }
    public double calculateInterest()
    {
        return (this.intialBalance * this.interest) / 100;

    }
    public String toString() {
        return " Initial Balance {" + initialBalance +
                "Interest Rate=" + interestRate +
                "} " + super.toString();
    }
}

