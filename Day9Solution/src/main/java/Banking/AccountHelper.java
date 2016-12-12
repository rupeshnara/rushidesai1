package Banking;

import child.CheckingAccount;
import child.SavingsAccount;

/**
 * Created by Venkat Ramana on 12/12/2016.
 */
public class AccountHelper {
    //method to access savingsAccount
    void debitMoney(SavingsAccount savingsAccount) {
        SavingsAccount sa = new SavingsAccount(2000, 12345678);
        sa.debit(1000);

    }

    // method to access checkingAccount
    void debitMoney(CheckingAccount checkingAccount) {
        checkingAccount.debit(2000);
    }
}

