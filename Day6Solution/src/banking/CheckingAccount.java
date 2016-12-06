package banking;

public class CheckingAccount extends BaseAccount {
    private int fee ;
    public CheckingAccount(double intialBalance, int fee) throws
    {
        super(intialBalance);
        this.fee=fee;


    }
    public void setFeeCharged(int feeCharged) {
        this.fee = feeCharged;
    }

    public double getFeeCharged() {
        return fee;
    }
}
