package client;

import bank.BaseAccount;
import bank.exceptions.AccountNumberLengthNotValid;

/**
 * Created by desair4 on 12/5/2016.
 */
public class SmartClient extends BaseAccount {

    public SmartClient(double initialBalance, String accountHash1) {
        super(initialBalance, accountHash1);

//        BaseAccount baseAccount = new BaseAccount(12, "22");
    }

    public SmartClient(double initialBalance, Integer accountNumberClient, String accountHash1) throws AccountNumberLengthNotValid {
        super(initialBalance, accountNumberClient, accountHash1);
    }
}
