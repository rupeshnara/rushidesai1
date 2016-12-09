package Banking;

import java.util.Base64;
import java.util.Date;
import java.util.Random;

public class BaseAccount {
    private static int count = 0;
    static private MyList previousAccountNumbers = new MyList(null);
    protected double initialBalance;
    protected Integer accountNumber;
    private String accountHash;
    private Date date = new Date();

    //constructor with initialbalance and accounthash1 and here we need to generate accountNumber
    public BaseAccount(double initialBalance, String accountHash1) {
        if (validateInitialBalance()) {
            throw new RuntimeException("Initial balance must be more than zero");
        }
        accountNumber = generateAccountNumber();
        isDuplicateAccountNumber(accountNumber);
        previousAccountNumbers.nextItem = new MyList(accountNumber);

        count++;
    }

    //constructor with initialBalance and accountNumber
    public BaseAccount(double initialBalance, Integer accountNumber1, String accountHash1) {

        if (validateInitialBalance()) {
            throw new RuntimeException("Initial balance must be more than zero");
        }

        if (validateNumberOfDigits()) {
            throw new RuntimeException("Account Number should have exactly 8 digits");
        }

        isDuplicateAccountNumber(accountNumber1);
        accountNumber = accountNumber1;

        count++;
    }

    static protected String generateAccountHash() {
        Date d = new Date();
        return Base64.getEncoder().encodeToString(d.toString().getBytes());
    }

    public static int getCount() {
        return count;
    }

    // A method to check for duplicate accountNumber
    private void isDuplicateAccountNumber(Integer accountNumber) {

        MyList currentAccountNumber = previousAccountNumbers.nextItem;
        while (currentAccountNumber != null) {
            if (currentAccountNumber.accountNumber.equals(accountNumber)) {
                throw new RuntimeException("AccountNumber already exists. Please provide different account number");
            }
            currentAccountNumber = currentAccountNumber.nextItem;
        }
    }

    // A method to validate accountNumber digits
    private boolean validateNumberOfDigits() {
        Integer temp = accountNumber;
        int digits = 0;
        while (temp >= 10) {
            temp = temp / 10;
            digits++;
        }
        return digits == 8;
    }

    // Validating  initial balance
    private boolean validateInitialBalance() {
        return initialBalance <= 0;
    }

    private Integer generateAccountNumber() {
        Random r = new Random();
        accountNumber = r.nextInt((9999999 + 1000000) - 1);
        return accountNumber;
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

    public String getAccountHash() {
        return accountHash;
    }

    @Override
    public String toString() {
        return "BaseAccount{" +
                "initialBalance=" + initialBalance +
                ", accountNumber=" + accountNumber +
                ", date=" + date +
                '}';
    }

    public void credit(double amount) {
        if (amount <= 0) {
            throw new RuntimeException("Please ensure the amount to be deposited is not negative");
        } else {
            initialBalance = initialBalance + amount;
        }
    }

    //Chceking all accountNumbers
    static private class MyList {
        MyList nextItem;
        Integer accountNumber;

        MyList(Integer accountNumber1) {
            accountNumber = accountNumber1;
        }
    }
}
