public class SavingsAccount {

    private double initialBalance;
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        setInitialBalance(initialBalance);
        setInterestRate(interestRate);
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {

        if (initialBalance <= 0) {
            System.out.println("Balance cannot be negative or zero.");
        } else {
            this.initialBalance = initialBalance;
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void credit(double amount) {
        if (amount < 0) {
            System.out.println("Please ensure the amount to be deposited is not negative: ");
        } else {
            this.initialBalance = this.initialBalance + amount;
        }
    }

    public void debit(double amount) {
        if (this.initialBalance < amount) {

        } else {
            this.initialBalance = this.initialBalance - amount;
        }
    }

    public double calculateInterest() {
        return (this.initialBalance * this.interestRate) / 100;
    }
}

	


