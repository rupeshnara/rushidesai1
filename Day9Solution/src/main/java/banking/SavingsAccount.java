package banking;

import java.util.ArrayList;

/**
 * Created by saikrishnareddy on 12/4/2016.
 */
public class SavingsAccount extends BaseAccount {

    private static SavingsAccount savingsAccount;
    private static ArrayList<Long> accountNumberList = new ArrayList<Long>();
    //long accountnumber;
    //private double initialBalance;
    private double interestRate;

    //private SavingsAccount() {}

    private SavingsAccount(double initialBalance, double interestRate) {
        super();
        setInitialBalance(initialBalance);
        setInterestRate(interestRate);
    }

    // initialize- static method used for validating the input and creating savingsAccount object.
    public static SavingsAccount initialize(double initialBalance, double interestRate, long accountnumber) throws Exception {
        if (accountnumber < 10000000 && accountnumber > 99999999) {
            throw new AccountNumberLengthNotValidException("Given Account number is invalid");
            //System.out.println("Given Account number is invalid");
            //return null;
        } else {
            System.out.println("Given Account number is:" + accountnumber);
            if (accountNumberList.contains(accountnumber)) {
                throw new DuplicateAccountNumberException("Account number already exists");
                //System.out.println("Account number already exists");
                //return  null;
            } else {
                accountNumberList.add(accountnumber);
                System.out.println("Account with" + accountnumber + "created sucessfully");
            }
        }

        if (initialBalance < 0) {
            throw new InitialBalanceNotValidException("Please enter valid amount:");
            //System.out.println("Please enter valid amount:");
            //return null;
        }
        savingsAccount = new SavingsAccount(initialBalance, interestRate);
        return savingsAccount;
    }

    public static SavingsAccount initialize(double initialBalance, double interestRate) throws Exception {
        boolean flag = false;
        for (long i = 10000000; i <= 99999999; i++) {
            if (!accountNumberList.contains(i)) {
                flag = true;
                accountNumberList.add(i);
                System.out.println("Account with" + i + "created sucessfully");
                break;
            }
        }
        if (!flag) {
            throw new Exception("There are no awailable 8 digit Account numbers");
            //System.out.println("There are no awailable 8 digit Account numbers");
            //return null;
        }

        if (initialBalance < 0) {
            throw new InitialBalanceNotValidException("Please enter valid amount:");
            //System.out.println("Please enter valid amount:");
            //return null;
        }
        savingsAccount = new SavingsAccount(initialBalance, interestRate);
        return savingsAccount;
    }

/*
    public double getInitialBalance() {

        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    } */

    /*public void credit(double amount) {
        if (amount < 0.0) {
            System.out.println("Please ensure the amount to be deposited is not negative:" + amount);
            //System.out.println("Account Ballance after credit:" + (initialBalance = initialBalance + amount));
        } else {
            System.out.println("Account Ballance after credit:" + (initialBalance = initialBalance + amount));
            //System.out.println("Please ensure the amount to be deposited is not negative:" +amount);
        }
    }
*/
    public void debit(double amount) {
        if (amount == initialBalance || amount <= initialBalance) {
            System.out.println("Account Ballance after withdraw:" + (initialBalance = initialBalance - amount));
        } else {
            System.out.println("Please enter valid 1amount" + amount);
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        double interest = (initialBalance * interestRate) / 100;
        // double interest= initialBalance * interestRate;
        System.out.println("Account Ballance after intrest:" + (initialBalance + interest));
        return interest;
    }
}
