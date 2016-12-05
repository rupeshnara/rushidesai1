package Banking;

public class CheckingAccount extends BaseAccount {

    private double feeCharged = 5;

    public CheckingAccount(double feeCharged) {
        super();
        this.feeCharged = feeCharged;
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

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "initialBalance=" + initialBalance +
                ", feeCharged='" + feeCharged + '\'' +
                '}';

    }


}