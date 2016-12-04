package Banking.parent;

import java.util.Date;
import java.util.Random;

public class BaseAccount {

    protected double initialBalance;
    protected Integer accountNumber;
    public  static int count = 0;

    private String accountHash;

    Date date = new Date();

    public BaseAccount(){

    }

    // Constructor to be used when client provides only the initial balance
    // Validate initial balance and generate a random unique account number

    public BaseAccount(double initialBalance) {

        // Validation of initial balance
        if (validateInitialBalance()) {
            throw new RuntimeException("Initial balance must be more than zero");
        }

        // Generate unique account number

        accountNumber = generateAccountNumber();

    }

    // Constructor to be used when client provides both initial balance and account number
    // Validate the initial balance and check if account number has 8 digits

    public BaseAccount(double initialBalance, Integer accountNumberClient) {

        // Validation of initial balance
        if (validateInitialBalance()) {
            throw new RuntimeException("Initial balance must be more than zero");
        }

        // Check if account number has 8 digits
        if (validateNumberOfDigits()) {
            throw new RuntimeException("Account Number should have exactly 8 digits");
        }

        // Check for duplicate account number

        if (duplicateAccountNumber()){
            throw new RuntimeException("Account Number already exists. Please provide another account number");
        }

        this.accountNumber = accountNumberClient;
        count++;
    }

    // Check for duplicate account number
    private boolean duplicateAccountNumber() {

        String verifiedAccountNumber = accountNumber.toString();
        if(verifiedAccountNumber.equals(accountNumber)) {

            return  false;
        }
        return true;
    }

    // count account creation instances by client

    public int countAccountCreationInstances(){

        System.out.println("You have created " + count + " instance(s) of account creation");
        return count;
    }

    // Check for number of digits in account number
    private boolean validateNumberOfDigits() {

        Integer temp = accountNumber;
        int digits = 0;

        while (temp >= 10) {
            temp = temp / 10;
            digits++;
        }

        if (digits == 8) {
            return true;
        }

        return false;
    }

    // Validate initial balance
    private boolean validateInitialBalance() {

        if (initialBalance <= 0) {
            return false;
        }
        return true;
    }

    public Integer generateAccountNumber() {

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
}