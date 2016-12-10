package bank;

import bank.child.SavingsAccount;

/**
 * Created by desair4 on 12/9/2016.
 */
public class AccountHelper {

    void debitMoney(SavingsAccount savingsAccount, double debitAmount) {
        savingsAccount.debit(debitAmount);
    }

    /*void debitMoney(CheckingAccount savingsAccount, double debitAmount){
        savingsAccount.debit(debitAmount);
    }*/
}
