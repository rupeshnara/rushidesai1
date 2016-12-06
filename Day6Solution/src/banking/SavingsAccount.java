package banking;

public class SavingsAccount extends BaseAccount {
    private double interestRate;

    public SavingsAccount(double balance, double interest) {
        super(intialBalance);
        interestRate = interest;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
    public double calculateInterest()
    {
        return (this.intialBalance * this.interestRate) / 100;

    }
}

