package training.services;

import bank.BaseAccount;
import training.bootstrap.AccountBootstrap;

/**
 * Created by desair4 on 12/19/2016.
 */
public class AccountService {

    public static BaseAccount searchAccount(Integer accountNumber) {
        return AccountBootstrap.ACCOUNT_MAP.get(accountNumber);
    }
}
