package banking.parent;

/**
 * Created by harik on 12/8/2016.
 */

import banking.interfaces.IAccount;


public abstract class BaseAccount implements IAccount {
    protected double initialBalance;
    protected Integer accountNumber;
    public static int count = 0;
    private String accountHash;


    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }


}
