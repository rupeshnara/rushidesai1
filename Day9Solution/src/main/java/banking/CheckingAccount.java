package banking;

import java.util.ArrayList;

/**
 * Created by saikrishnareddy on 12/4/2016.
 */
public class CheckingAccount extends BaseAccount {

    private static CheckingAccount checkingAccount;
    private static ArrayList<Long> accountNumberList = new ArrayList<Long>();
    final int fee = 5;
    //long accountnumber;
    //private double initialBalance;

    //private CheckingAccount() {}

    public CheckingAccount(double initialBalance) {
        super();
        setInitialBalance(initialBalance);
    }

    public static CheckingAccount initialize(double initialBalance, long accountnumber) throws Exception {

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
            /*System.out.println("Please enter valid amount");
            return null;*/
        }
        checkingAccount = new CheckingAccount(initialBalance);
        return checkingAccount;
    }

    public static CheckingAccount initialize(double initialBalance) throws Exception {
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
            /*System.out.println("Please enter valid amount:");
            return null;*/
        }
        checkingAccount = new CheckingAccount(initialBalance);
        return checkingAccount;
    }

    /*public long getAccountnumber() { return accountnumber; }

    public void setAccountnumber(long accountnumber) { this.accountnumber = accountnumber; }
*/
    /*public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }*/

    /*public void credit(double amount) {
        if (amount > 0) {
            System.out.println("Account Ballance after credit:" + (initialBalance = initialBalance + amount));
        } else {
            System.out.println("Please ensure the amount to be deposited is not negative or zero:");
        }
    }*/

    public void debit(double amount) {
        if (amount < 0.0) {
            System.out.println("Please enter valid amount");
        } else if (initialBalance < amount + fee) {
            System.out.println("You don't have sufficient balance to do this transaction, Available Balance:" + initialBalance);
        } else {
            System.out.println("Please note, fee for this transaction is $" + fee);
            System.out.println("Account Balance after withdraw:" + (initialBalance = initialBalance - amount - fee));
        }
    }
}
