package training.bootstrap;

import bank.BaseAccount;
import child.CheckingAccount;
import child.SavingsAccount;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by desair4 on 12/19/2016.
 */
public class AccountBootstrap {
    public static final Map<Integer, BaseAccount> ACCOUNT_MAP;
//    public static final Map<Integer, UserSession> SESSION_MAP;

    static {
        ACCOUNT_MAP = new HashMap<>();
        ACCOUNT_MAP.put(12345671, new SavingsAccount(12, 12345671));
        ACCOUNT_MAP.put(12345672, new SavingsAccount(13, 12345672));
        ACCOUNT_MAP.put(12345673, new SavingsAccount(14, 12345673));
        ACCOUNT_MAP.put(12345674, new SavingsAccount(15, 12345674));
        ACCOUNT_MAP.put(12345675, new CheckingAccount(16, 12345675));
        ACCOUNT_MAP.put(12345676, new CheckingAccount(17, 12345676));
        ACCOUNT_MAP.put(12345677, new CheckingAccount(18, 12345677));
        ACCOUNT_MAP.put(12345678, new CheckingAccount(19, 12345678));

//        SESSION_MAP = new HashMap<>();
    }


}