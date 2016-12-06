package bank;

import bank.exceptions.AccountNumberLengthNotValid;
import bank.exceptions.InitialBalanceNotValid;
import bank.interfaces.IAccount;

import java.util.Base64;
import java.util.Date;
import java.util.Random;

/**
 * Created by desair4 on 12/4/2016.
 */
public abstract class BaseAccount implements IAccount {

    /*
    * 1. You cannot instantiate abstract class
    * 2. They are class version of interface
    * 3. Or you want all clients to implement some methods and have common instance variables
    *
    * */
    protected double initialBalance;
    protected Integer accountNumber;
    private static int count = 0;   //Think of does it make sense to make this field protected or private it better?
    private String accountHash;
    static private MyList previousAccountNumbers = new MyList(null); //start with some initial value
    //    int[] previousAccountNumbersArr = new int[10];  //
    private Date date = new Date();

    /*public BaseAccount(){

    }*/

    //static methods cannot access non static varaibles
    protected static void dummy() {
//        accountNumber = "121";
    }

    // Constructor to be used when client provides only the initial balance
    // Validate initial balance and generate a random unique account number
    protected BaseAccount(double initialBalance, String accountHash1) {
        // Validation of initial balance
        if (isValidaBalance()) {
            throw new RuntimeException("Initial balance must be more than zero");
        }

        // Generate unique account number
        accountNumber = generateAccountNumber();
        isDuplicateAccountNumber(accountNumber);    //ideally we wont do this if we assume that the random generator draws numbers from uniform distribution and the period of the generator is big enough (which incase of java period is 2^48, so pretty huge)
        previousAccountNumbers.nextItem = new MyList(accountNumber);

        count++;
    }

    // Constructor to be used when client provides both initial balance and account number
    // Validate the initial balance and check if account number has 8 digits
    protected BaseAccount(double initialBalance, Integer accountNumberClient, String accountHash1) throws AccountNumberLengthNotValid {
        // Validation of initial balance
        if (!isValidaBalance()) {
            throw new InitialBalanceNotValid("Initial balance must be more than zero");
        }

        // Check if account number has 8 digits
        if (!isValidNumberOfDigits(accountNumberClient)) {
            throw new AccountNumberLengthNotValid("Account Number should have exactly 8 digits");
        }

        isDuplicateAccountNumber(accountNumberClient);
        accountNumber = accountNumberClient;

        count++;
    }

    // Check for duplicate account number
    private void isDuplicateAccountNumber(Integer accountNumber) {
        /*
        *       1 -> 2 -> 3
        *
        *       10
        *       1 -> 2 -> 3 -> null
        *
        *
        * */
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

    // Validate initial balance

    private boolean isValidaBalance() {
        return initialBalance >= 0;
    }

    private Integer generateAccountNumber() {
        Random r = new Random();
        accountNumber = r.nextInt((9999999 + 1000000) - 1);
        return accountNumber;
    }

    static protected String generateAccountHash() {
        Date d = new Date();
        return Base64.getEncoder().encodeToString(d.toString().getBytes());
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

    public static int getCount() {
        return count;
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


    static private class MyList {
        MyList nextItem;
        Integer accountNumber;   //your data

        /*
                myList1 -> myList2 -> myList3 -> null
                1           2           3
         */

        MyList(Integer accountNumber1) {
            accountNumber = accountNumber1;
        }

        //abstract classes
        //interfaces
        //inheritance
        //polymorphism
        //static
        //private

        /*
        * Topics left
        *
        * 1. Collections
        * 2. Generics
        * 3. Multithreading -> Limited. And it is too much advanced -> Concepts from Operating systems mutex ,semaphores
        * 4. enums
        * 5. final
        * 6. Mutability -> String -> StringBuffer StringBuilder
        * 7. AutoBoxing and Unboxing
        * */


        /*
        * Database
        * Hibernate
        * Spring
        * Spring AOP
        * SPring ORM
        * SPring DI
        * SPring MVC
        *
        * */
    }
}
