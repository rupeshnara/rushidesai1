package parent;

import exceptios.AccountNumberLengthNotValidException;
import exceptios.InitialBalanceNotValidException;
import interfaces.IAccount;

import java.util.Random;

/**
 * Created by harik on 12/12/2016.
 */
public abstract class BaseAccount implements IAccount {
    protected double initialBalance;
    protected Integer accountNumber;
    static int count = 0;
    static private MyList previousAccountNumbers = new MyList(null);


    public BaseAccount(double initialBalance) {
        if (initialBalance <= 0) {
            throw new RuntimeException("initial balance greater than zero");
        }

        accountNumber = generateAccountNumber();
        isDuplicateAccountNumber(accountNumber);
        previousAccountNumbers.nextItem = new MyList(accountNumber);

        count++;
    }

    protected BaseAccount(double initialBalance, Integer accountNumberClient1) throws AccountNumberLengthNotValidException {
        // Validation of initial balance
        if (!isValidaBalance()) {
            throw new InitialBalanceNotValidException("Initial balance must be more than zero");
        }

        // Check if account number has 8 digits
        if (!isValidNumberOfDigits(accountNumberClient1)) {
            throw new AccountNumberLengthNotValidException("Account Number should have exactly 8 digits");
        }

        isDuplicateAccountNumber(accountNumberClient1);
        accountNumber = accountNumberClient1;

        count++;
    }

    public static int getCount() {
        return count;
    }

    private boolean isValidaBalance() {
        return initialBalance >= 0;
    }

    private int generateAccountNumber() {
        Random r = new Random();
        accountNumber = r.nextInt((9999999 + 1000000) - 1);
        return accountNumber;
    }

    public void credit(double amount) {
        if (amount <= 0) {
            throw new RuntimeException("amount must be greater than zero");
        } else {
            initialBalance = initialBalance + amount;
        }
    }

    private void isDuplicateAccountNumber(Integer accountNumber) {

        MyList currentAccountNumber = previousAccountNumbers.nextItem;  //first accountNumber
        while (currentAccountNumber != null) {
            if (currentAccountNumber.accountNumber.equals(accountNumber)) {
                throw new RuntimeException("Account Number already exists. Please provide another account number");
            }
            currentAccountNumber = currentAccountNumber.nextItem;
        }
    }

    private boolean isValidNumberOfDigits(Integer accountNumber1) {

        int digits = accountNumber1.toString().length();

        return digits == 8;
    }


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


    @Override
    public String toString() {
        return "BaseAccount{" +
                "initialBalance=" + initialBalance +
                ", accountNumber=" + accountNumber +
                '}';
    }

    static private class MyList {
        MyList nextItem;
        Integer accountNumber;

        MyList(Integer accountNumber1) {
            accountNumber = accountNumber1;
        }


    }
}
