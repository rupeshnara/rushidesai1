package Banking.parent;

import Banking.child.*;
import Banking.exceptions.*;

public class AccountHelper extends InitialBalanceNotValidException{

    // create debit money method which calls Saving's account debit method when
    // Saving object is called and calls checking account's debit  method when checking object is called
    public void debitMoney(BaseAccount baseAccount, double a) {

        /*AccountHelper sAccountDebit = new SavingAccount();
        AccountHelper cAccountDebit = new CheckingAccount(double amount2);
*/
        //baseAccount.debit(a);

    }
}
