package Banking.parent;

import Banking.exceptions.AccountNumberLengthNotValidException;
import Banking.exceptions.DuplicateAccountNumberException;
import Banking.exceptions.InitialBalanceNotValidException;
import Banking.interfaces.IAccount;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public abstract class BaseAccount implements IAccount {

    protected double initialBalance;
    protected Integer accountNumber;
    public  static int count = 0;
    private String accountHash;

    static List<Integer> allAccountNumbersArray = new ArrayList<Integer>();

    private Date date = new Date();

    public BaseAccount(){}

    // Constructor to be used when client provides only the initial balance
    // Validate initial balance and generate a random unique account number

    public BaseAccount(double initialBalance) throws InitialBalanceNotValidException{

        // Validation of initial balance
        if (!isInitialBalanceValid(initialBalance)) {
            throw new InitialBalanceNotValidException("Initial balance must be more than zero");
        }

        // Generate unique account number

        accountNumber = generateAccountNumber();
        allAccountNumbersArray.add(accountNumber);

        count++;
    }

    // Constructor to be used when client provides both initial balance and account number
    // Validate the initial balance and check if account number has 8 digits

    public BaseAccount(double initialBalance, Integer accountNumberClient) throws InitialBalanceNotValidException,
            AccountNumberLengthNotValidException, DuplicateAccountNumberException{

        // Validation of initial balance
        if (!isInitialBalanceValid(initialBalance)) {
            throw new InitialBalanceNotValidException("Initial balance must be more than zero");
        }

        // Check if account number has 8 digits
        if (!isNumberOfDigitsValid(accountNumberClient)) {
            throw new AccountNumberLengthNotValidException("Account Number should have exactly 8 digits");
        }

        // Check for duplicate account number

        if (!isDuplicateAccountNumber(accountNumberClient)){
            throw new DuplicateAccountNumberException("Account Number already exists. Please provide another account number");
        }

        accountNumber = accountNumberClient;
        count++;
    }

    // Check for duplicate account number
    private boolean isDuplicateAccountNumber(Integer accountNumber) {

        for (int i = 0; i < allAccountNumbersArray.size(); i++){

            if (allAccountNumbersArray.get(i).equals(accountNumber)) {
                return true;
            }
        }
        return false;
    }

    // count account creation instances by client

    public int countAccountCreationInstances(){

        System.out.println("You have created " + count + " instance(s) of account creation");
        return count;
    }

    // Check for number of digits in account number
    private boolean isNumberOfDigitsValid(Integer validateAccountNumber) {

        int digits = validateAccountNumber.toString().length();

        if(digits == 8){
            return true;
        }

        return false;

    }

    // Validate initial balance
    private boolean isInitialBalanceValid(double initialBalance) {

        return initialBalance > 0;
    }

    private Integer generateAccountNumber() {

        Random r = new Random();
        accountNumber = 10000000 + r.nextInt(90000000);
        allAccountNumbersArray.add(accountNumber);

        return accountNumber;
    }

    // Generate account hash

    protected String generateAccountHash(){
        return accountHash;
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

    @Override
    public String toString() {
        return "BaseAccount{" +
                "initialBalance=" + initialBalance +
                ", accountNumber=" + accountNumber +
                ", date=" + date +
                '}';
    }
}