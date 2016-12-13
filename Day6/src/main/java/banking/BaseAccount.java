package banking;

import java.util.Base64;
import java.util.Date;

/**
 * Created by saikrishnareddy on 12/8/2016.
 */
public class BaseAccount {

    public long accountNumber;
    protected double initialBalance;
    private String accountHash;

    public BaseAccount() {
        String todaysDate = String.valueOf(new Date());
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] bytes = encoder.encode(todaysDate.getBytes());
        this.accountHash = String.valueOf(bytes);
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHash() {
        return accountHash;
    }


    public double getInitialBalance() {

        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public void credit(double amount) {
        if (amount > 0) {
            System.out.println("Account Ballance after credit:" + (initialBalance = initialBalance + amount));
        } else {
            System.out.println("Please ensure the amount to be deposited is not negative or zero:");
        }
    }
}

