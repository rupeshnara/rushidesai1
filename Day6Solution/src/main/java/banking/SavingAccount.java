package banking;

import java.util.Date;

/**
 * Created by harik on 12/3/2016.
 */
public class SavingAccount extends BaseClass {
    public SavingAccount(int initialBalance,int accountNumber) {
        if (initialBalance <= 0) {
            throw new RuntimeException("initial balance cannot be zero");
        }
        int lenOfAccount = getNumberOfDigitsInAccount(accountNumber);
        if (lenOfAccount != 8) {
            throw new RuntimeException("account number must be 8 numbers");
        }
        System.out.println(this.accountNumber =accountNumber);
        System.out.println(this.initialBalance=initialBalance);
    }

    public  int getNumberOfDigitsInAccount(int accountNumber) {
        return accountNumber;
    }

    public static class Time {
        public static void main(String args[])
        {
            Date d=new Date();
            System.out.println(d.toString());
        }

    }
}
