package Banking.parent;

public class AccountHelper {

    // create debit money method which calls Saving's account debit method when
    // Saving object is called and calls checking account's debit  method when checking object is called
    public static void debitMoney(BaseAccount baseAccount, double debitAmount) throws Exception {

        baseAccount.debit(debitAmount);

    }
}
