package Banking.interfaces;

import Banking.exceptions.InitialBalanceNotValidException;

/**
 * Created by bhumi on 12/6/2016.
 */
public interface IAccount {

    void debit(double amount) throws InitialBalanceNotValidException;
}
