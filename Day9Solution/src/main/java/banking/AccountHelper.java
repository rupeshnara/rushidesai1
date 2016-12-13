package banking;

/**
 * Created by saikrishnareddy on 12/13/2016.
 */
public class AccountHelper {

    public void debitMoney(BaseAccount baseAccount, double amount) {
        baseAccount.debit(amount);
    }
}
