package bank;

/**
 * Created by desair4 on 12/9/2016.
 */
public class AccountHelper {

    public static void debitMoney(BaseAccount baseAccount, double debitAmount) {
        //baseAccount = savingsAccount
        //baseAccount = checkingAccount

        //savingsAccount.debit(10)
        //checkingAccount.debit(10)
        baseAccount.debit(debitAmount);
    }

    /*void debitMoney(CheckingAccount savingsAccount, double debitAmount){
        savingsAccount.debit(debitAmount);
    }*/
}
