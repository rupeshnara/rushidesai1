package Banking;

import java.util.Random;

/**
 * Created by bhumi on 11/29/2016.
 */
public class CheckingAccount {

    private double initialBalance;
    private int transactionFees;
    private Integer accountNumber;
    public  static int count = 0;

    // Constructor to be used when client provides only the initial balance
    // Validate initial balance and generate a random unique account number

    public CheckingAccount(double initialBalance) {

        // Validation of initial balance
        if (validateInitialBalance()) {
            throw new RuntimeException("Initial balance must be more than zero");
        }

        // Generate unique account number

        accountNumber = generateAccountNumber();

    }

    // Constructor to be used when client provides both initial balance and account number
    // Validate the initial balance and check if account number has 8 digits

    public CheckingAccount(double initialBalance, Integer accountNumberClient) {

        // Validation of initial balance
        if (validateInitialBalance()) {
            throw new RuntimeException("Initial balance must be more than zero");
        }

        // Check if account number has 8 digits
        if (!validateNumberOfDigits()) {
            throw new RuntimeException("Account Number should have exactly 8 digits");
        }

        // Check for duplicate account number
        if (duplicateAccountNumber()){
            throw new RuntimeException("Account Number already exists. Please provide another account number");
        }

        this.accountNumber = accountNumberClient;
        count++;
    }

    // count account creation instances by client

    public int countAccountCreationInstances(){

        System.out.println("You hve creates " + count + " instance(s) of account creation");
        return count;
    }

    // Check for duplicate account number
    private boolean duplicateAccountNumber() {

        String verifiedAccountNumber = accountNumber.toString();
        if(verifiedAccountNumber.equals(accountNumber)) {

            return  false;
        }
        return true;
    }

    // Check for number of digits in account number
    private boolean validateNumberOfDigits() {

        long temp = accountNumber;
        int digits = 0;

        while (temp >= 10) {
            temp = temp % 10;
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

    public void credit(double amount){

        if (amount <= 0){
            System.out.println("Please ensure the amount to be deposited is not negative");
        }
        else {
            this.initialBalance = this.initialBalance + amount;
        }

    }

    public void debit(double amount){

        if (this.initialBalance < amount + transactionFees){
            System.out.println("Your balance is less than the requested amount");
        }

        else {
            this.initialBalance = this.initialBalance - amount - transactionFees;
        }
    }

    public double getTransactionFees() {
        return transactionFees;
    }

    public void setTransactionFees(int transactionFees) {
        this.transactionFees = transactionFees;
    }

    @Override
    public String toString() {
        return "Banking.CheckingAccount{" +
                "initialBalance=" + initialBalance +
                '}';
    }
}

    /*private double initialBalance;
    private double interestRate;
    private double transactionFees = 5;
    private long accountNumber;

    private int count = 0;

    // No argument constructor

    public CheckingAccount(){

    }

    // creating constructor so that client can create object only if condition for initial balance is met

    public CheckingAccount(double initialBalance){

        if (validateInitialBalance()) {
            System.out.println("Balance cannot be negative or zero");

        }
        else {
            this.initialBalance = initialBalance;
            System.out.println("Your initial Checking Account balance is " + initialBalance);
        }
        setInitialBalance(initialBalance);

        count++;
    }

    // count account creation instances by client

    public int countAccountCreationInstances(){

        System.out.println("You hve creates " + count + " instance(s) of account creation");
        return count;
    }

    // validate initial balance

    public boolean validateInitialBalance() {
        if (initialBalance <= 0) {
            return false;
        } else {
            return true;
        }
    }

    // validate account number provided by client

    public boolean validateAccountNumber(){

        long temp = accountNumber;
        int digits = 0;

        while (digits <= 8){
            temp = temp % 10;
            digits++;
        }

        if (digits == 8){
            return true;
        }
        else {
            return false;
        }
    }

    // Random and unique account  number creation method

    public long generateAccountNumber(){

        Random r = new Random();
        accountNumber = r.nextInt(9000000) + 1000000;
        return accountNumber;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        if (initialBalance <= 0) {
            System.out.println("Balance cannot be negative or zero");
        }

        else {
            this.initialBalance = initialBalance;
        }
    */