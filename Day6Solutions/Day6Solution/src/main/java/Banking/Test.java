package Banking;

import java.util.Date;

/**
 * Created by Venkat Ramana on 12/4/2016.
 */
public class Test {
    public static void main(String[] args) {
        BaseAccount savingsAccount = new SavingsAccount(1000);
        BaseAccount cAccount = new CheckingAccount(2000);
        savingsAccount.credit(2500.0);
        System.out.println("Savings Account Credit Amount:: " + savingsAccount);
        // savingsAccount.debit(4500.0);
        System.out.println("The Savings Account Debit Amount:: " + savingsAccount);

        System.out.println("Account Number ...... Savings Account  : " + savingsAccount.accountNumber);
        System.out.println("Account Number ...... Checking Account  : " + cAccount.accountNumber);

        SavingsAccount savingsAccount1 = new SavingsAccount(12, 1233434);

        System.out.println(savingsAccount);


    }
}
