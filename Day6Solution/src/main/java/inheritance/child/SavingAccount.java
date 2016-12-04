package inheritance.child;

import inheritance.parent.BaseAccount;

/**
 * Created by desair4 on 11/30/2016.
 */
public class SavingAccount extends BaseAccount {

    /*public int initialBalance;
    public int accountNumber;
    static public int count;*/
//    BaseAccount baseAccount;

    public int interest;

    public SavingAccount(int initBalance) {

        initialBalance = initBalance;
//        accountKey;
        /*if(initBalance <= 0){
            throw new RuntimeException("initital balance cannot be zero");
        }*/

//        baseAccount.initialBalance = initBalance;
//        initialBalance = initBalance;
//        baseAccount = new BaseAccount(initBalance);
    }


    @Override
    public String toString() {
        return "SavingAccount{" +
                "interest=" + interest +
                "} " + super.toString();
    }
}
