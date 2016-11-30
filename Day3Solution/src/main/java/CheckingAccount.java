public class CheckingAccount {
    private double initialBalance;
    private double feeCharged = 5;

    public CheckingAccount(double initialBalance) {
        setInitialBalance(initialBalance);
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

    public void credit(double amount) {
        if (amount < 0) {
        } else {
            this.initialBalance = this.initialBalance + amount;
        }
    }

    public void debit(double amount) {
        if (this.initialBalance < amount) {

        } else {
            this.initialBalance = this.initialBalance - amount - feeCharged;
        }
    }

    public double getFeeCharged() {
        return feeCharged;
    }

    public void setFeeCharged(double feeCharged) {
        this.feeCharged = feeCharged;
    }
}