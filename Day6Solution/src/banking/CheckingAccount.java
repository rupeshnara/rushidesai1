package banking;

public class CheckingAccount extends BaseAccount {
    private int fee = 5;
    public CheckingAccount(double balance) {
        intialBalance = balance;
    }
    public void setFeeCharged(int feeCharged) {
        this.fee = feeCharged;
    }

    public double getFeeCharged() {
        return fee;
    }
}
