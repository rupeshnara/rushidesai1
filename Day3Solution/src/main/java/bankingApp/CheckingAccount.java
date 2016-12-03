package bankingApp;


public class CheckingAccount {

    private double intialBalance;
    private int fee = 5;

    public CheckingAccount(double balance) {
        intialBalance = balance;

    }

    public void setInitialBalance(double initialBalance) {

        if (initialBalance <= 0) {
            System.out.println("Balance Can't be Negative or Zero");
        } else {
            this.intialBalance = initialBalance;
        }
    }

    public double getInitialBalance() {
        return intialBalance;
    }

    public void credit(double amount) {
        if (amount < 0) {
        } else {
            this.intialBalance = this.intialBalance + amount;
        }
    }

    public void debit(double amount) {
        if (this.intialBalance < amount) {

        } else {
            this.intialBalance = this.intialBalance - amount - fee;
        }

    }

    public void setFeeCharged(int feeCharged) {
        this.fee = feeCharged;
    }

    public double getFeeCharged() {
        return fee;
    }

}
