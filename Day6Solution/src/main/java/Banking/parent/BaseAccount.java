package Banking.parent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class BaseAccount {

    protected double initialBalance;
    protected Integer accountNumber;
    public  static int count = 0;
    private String accountHash;

    private List<Integer> allAccountNumbersArray = new ArrayList<Integer>();

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

        count++;
    }

    // Constructor to be used when client provides both initial balance and account number
    // Validate the initial balance and check if account number has 8 digits

    public BaseAccount(double initialBalance, Integer accountNumberClient) {

        // Validation of initial balance
        if (validateInitialBalance()) {
            throw new RuntimeException("Initial balance must be more than zero");
        }

        // Check if account number has 8 digits
        if (isNumberOfDigitsValid(accountNumberClient)) {
            throw new RuntimeException("Account Number should have exactly 8 digits");
        }

        // Check for duplicate account number

        if (isDuplicateAccountNumber(accountNumberClient)){
            throw new RuntimeException("Account Number already exists. Please provide another account number");
        }

        accountNumber = accountNumberClient;
        count++;
    }

    // Check for duplicate account number
    private boolean isDuplicateAccountNumber(Integer accountNumber) {

        for (int i = 0; i < allAccountNumbersArray.size(); i++){

            if (allAccountNumbersArray.get(i) == accountNumber) {
                return false;
            }
        }
        return true;
    }

    // count account creation instances by client

    public int countAccountCreationInstances(){

        System.out.println("You have created " + count + " instance(s) of account creation");
        return count;
    }

    // Check for number of digits in account number
    private boolean isNumberOfDigitsValid(Integer validateAccountNumber) {

        int digits = validateAccountNumber.toString().length();

        return digits == 8;

    }

    // Validate initial balance
    private boolean validateInitialBalance() {

        return initialBalance > 0;
    }

    private Integer generateAccountNumber() {

        Random r = new Random();
        accountNumber = 10000000 + r.nextInt(90000000);
        allAccountNumbersArray.add(accountNumber);

        return accountNumber;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance1) {
        initialBalance = initialBalance1;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber1) {
        accountNumber = accountNumber1;
    }
}