package solution;

import java.util.Random;

/**
 * Created by desair4 on 12/2/2016.
 */
public class CheckingAccount {

    private int initialBalance;
    private int accountNumber;

    public CheckingAccount(int initialBalance, int accountNumber) {
        //Condition1 : InitialBalance >= 0
        if (initialBalance <= 0) {
            throw new RuntimeException("Initial Balance cannot be less than or equal to zero");
        }

        //Condition2: AccountNumber should be 8 digits
        int lengthOfAccount = getNumberOfDigitsOfInt(accountNumber);
        if (lengthOfAccount != 8) {
            throw new RuntimeException("Account number should be of 8 digits");
        }

        //I will be sure input is valid in terms of my business requirements
        this.initialBalance = initialBalance;
        this.accountNumber = accountNumber;

        //At this point you have both accountNumber and initialBalance
    }

    public CheckingAccount(int initialBalance) {
        //genrate account number with 8 digits.
        accountNumber = generateAccountNumber();

        this.initialBalance = initialBalance;

        //At this point you have both accountNumber and initialBalance
    }

    private Random random = new Random();

    private int generateAccountNumber() {
        int temp = 10000000 + random.nextInt(99999999 - 10000000 + 1);
        return temp;
    }

    private int getNumberOfDigitsOfInt(int accountNumber) {
        return 0;
    }

    public int getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
