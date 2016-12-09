package banking;

import java.util.Random;

public class SavingsAccount {
    private static int count = 0;
    private static int[] allAccountNumbers = new int[100];
    private double initialBalance;
    private double interestRate;
    private int accountNumber;

    //constructor with initialBalance and AccountNumber
    public SavingsAccount(double initialBalance, int accountNumber) {
        if (initialBalance < 0) {
            throw new RuntimeException("Initial balance must be more than zero");
        }
        validateAccountNumber(accountNumber);
        setAccountNumber(accountNumber);
        count++;
    }

    //constructor with initialBalance and interestRate
    public SavingsAccount(double initialBalance, double interestRate) {
        this.interestRate = interestRate;
        if (initialBalance < 0) {
            throw new RuntimeException("Initial balance must be more than zero");
        }
        int newAccountNumber = getRandomNewAccountNumber();
        setAccountNumber(newAccountNumber);
        count++;
    }

    public static int getCount() {
        return count;
    }

    private void validateAccountNumber(int accountNumber) {
        String accountNumberString = String.valueOf(accountNumber);
        if (accountNumberString.length() != 8) {
            throw new IllegalArgumentException("Account number should be 8 digits" + accountNumberString);
        }
        for (int i = 0; i < allAccountNumbers.length; i++) {
            if (allAccountNumbers[i] == accountNumber) {
                throw new IllegalArgumentException("Account Number is duplicate" + accountNumberString);
            }
        }
    }

    private int getRandomNewAccountNumber() {
        int accountNumber = getRandomAccountNumber();
        for (int i = 0; i < allAccountNumbers.length; i++) {
            if (allAccountNumbers[i] == accountNumber) {
                accountNumber = getRandomAccountNumber();
                i = 0;
            }
        }
        return accountNumber;
    }

    private int getRandomAccountNumber() {
        Random r = new Random();
        int low = 10000000;
        int high = 99999999;
        int result = r.nextInt(high - low) + low;
        return result;
    }

    public void credit(double amount) {
        if (amount < 0) {
            System.out.println("Please ensure the amount to be deposited is not negative: ");
        } else {
            this.initialBalance = this.initialBalance + amount;
        }
    }

    public void debit(double amount) {
        if (this.initialBalance < amount) {

        } else {
            this.initialBalance = this.initialBalance - amount;
        }
    }

    public double calculateInterest() {
        return (this.initialBalance * this.interestRate) / 100;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;

    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
