package banking;
import java.util.Random;
public class CheckingAccount {
    private double initialBalance;
    private double feeCharged = 5;
    private int accountnumber;
    static int count = 0;


    public CheckingAccount(double initialBalance) {
        setInitialBalance(initialBalance);
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CheckingAccount.count = count;
    }

    int aNumber = (int)((Math.random() * 90000000)+10000000);



    public int getAccountNumber(){
        return accountnumber;
    }
    public void setAccountNumber(int accountnumber){
        this.accountnumber= accountnumber;}


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
