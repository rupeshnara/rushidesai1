package Banking;

import child.CheckingAccount;
import child.SavingsAccount;

/**
 * Created by Venkat Ramana on 12/12/2016.
 */
public class AccountHelper {
    //method to access baseAccount
    public static void debitMoney(BaseAccount baseAccount,double z) {
        //SavingsAccount sa = new SavingsAccount(2000, 12345678);
        //sa.debit(1000);
        baseAccount.debit(z);

    }
    /*public static void debitMoney(SavingsAccount savingsAccount,double z) {
        //SavingsAccount sa = new SavingsAccount(2000, 12345678);
        //sa.debit(1000);
        savingsAccount.debit(z);

    }*/

    // method to access checkingAccount
// public  static  void debitMoney(CheckingAccount checkingAccount,double z) {
//        checkingAccount.debit(z);
//    }

}

