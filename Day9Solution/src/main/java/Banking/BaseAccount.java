package Banking;

import exceptions.AccountNumberLengthNotValid;
import exceptions.InitialBalanceNotValid;
import exceptions.DuplicateAccountNumber;

import java.util.Random;

/**
 * Created by Venkat Ramana on 12/8/2016.
 */
public abstract class BaseAccount implements IAccount {
    private static int count = 0;
    static private MyList previousAccountNumbers = new MyList(null);

    protected double initialBalance;
    protected Integer accountNumber;

    protected BaseAccount(double initialBalance) {
        // Validation of initial balance
        if (isValidaBalance()) {
            throw new RuntimeException("Initial balance must be more than zero");
        }

        accountNumber = generateAccountNumber();
        isDuplicateAccountNumber(accountNumber);
        previousAccountNumbers.nextItem = new MyList(accountNumber);

        count++;
    }


    protected BaseAccount(double initialBalance, Integer accountNumberClient1) throws AccountNumberLengthNotValid {
        // Validation of initial balance
        if (!isValidaBalance()) {
            throw new InitialBalanceNotValid("Initial balance must be more than zero");
        }

        // Check if account number has 8 digits
        if (!isValidNumberOfDigits(accountNumberClient1)) {
            throw new AccountNumberLengthNotValid("Account Number should have exactly 8 digits");
        }

        isDuplicateAccountNumber(accountNumberClient1);
        accountNumber = accountNumberClient1;

        count++;
    }

    public static int getCount() {
        return count;
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

    // Check for number of digits in account number
    private boolean isValidNumberOfDigits(Integer accountNumber1) {

        int digits = accountNumber1.toString().length();

        return digits == 8;
    }

    private boolean isValidaBalance() {
        return initialBalance >= 0;
    }

    private Integer generateAccountNumber() {
        Random r = new Random();
        accountNumber = r.nextInt((9999999 + 1000000) - 1);
        return accountNumber;
    }

    public void credit(double amount) {
        if (amount <= 0) {
            //needs to throw error if amount<0
            throw new RuntimeException("Please ensure the amount to be deposited is not negative");
        } else {
            initialBalance = initialBalance + amount;
        }
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



