package bank;

import java.util.Base64;
import java.util.Date;
import java.util.Random;

/**
 * Created by desair4 on 12/4/2016.
 */
public class BaseAccount {
    protected double currentBalance;
    final protected Integer accountNumber;
    public static final int finalTemp = 1;
    public static final int finalTemp1; //This variable comes to life when class is loaded in jvm,  at that tiem construtor might not have been called
    private static int count = 0;   //Think of does it make sense to make this field protected or private it better?
    private String accountHash;
    static private MyList previousAccountNumbers = new MyList(null); //start with some initial value
    //    int[] previousAccountNumbersArr = new int[10];  //
    private Date date = new Date();

    /*public BaseAccount(){

    }*/
//    static initializers:
    static {
        finalTemp1 = 1;
    }


    //    instance initializers
    {
        //can be thought of as no - args constructor
        //will only be called when object is created

    }

    //static methods cannot access non static varaibles
    public static void dummy() {
//        accountNumber = "121";
    }

    // Constructor to be used when client provides only the initial balance
    // Validate initial balance and generate a random unique account number
    public BaseAccount(double currentBalance, String accountHash1) {
        // Validation of initial balance
     /*   if (validateInitialBalance()) {
            throw new RuntimeException("Initial balance must be more than zero");
        }
*/
//        finalTemp1 = 1;
        // Generate unique account number
        accountNumber = generateAccountNumber();
//        accountNumber = 2;
        isDuplicateAccountNumber(accountNumber);    //ideally we wont do this if we assume that the random generator draws numbers from uniform distribution and the period of the generator is big enough (which incase of java period is 2^48, so pretty huge)
        previousAccountNumbers.nextItem = new MyList(accountNumber);

        count++;
    }

    // Constructor to be used when client provides both initial balance and account number
    // Validate the initial balance and check if account number has 8 digits
    public BaseAccount(double currentBalance, Integer accountNumberClient, String accountHash1) {
        // Validation of initial balance
      /*  if (validateInitialBalance()) {
            throw new RuntimeException("Initial balance must be more than zero");
        }*/

        // Check if account number has 8 digits
        /*if (validateNumberOfDigits()) {
            throw new RuntimeException("Account Number should have exactly 8 digits");
        }*/

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
    private boolean validateNumberOfDigits() {
        Integer temp = accountNumber;
        int digits = 0;
        while (temp >= 10) {
            temp = temp / 10;
            digits++;
        }
        return digits == 8;
    }

    // Validate initial balance
    private boolean validateInitialBalance() {
        return currentBalance <= 0;
    }

    private Integer generateAccountNumber() {
        Random r = new Random();
//        accountNumber = r.nextInt((9999999 + 1000000) - 1);
        return r.nextInt((9999999 + 1000000) - 1);
    }

    static protected String generateAccountHash() {
        Date d = new Date();
        return Base64.getEncoder().encodeToString(d.toString().getBytes());
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    /*public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }*/

    public static int getCount() {
        return count;
    }

    public String getAccountHash() {
        return accountHash;
    }

    @Override
    public String toString() {
        return "BaseAccount{" +
                "initialBalance=" + currentBalance +
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
    }

    public void print() {
        System.out.println("Parent");
    }
}
