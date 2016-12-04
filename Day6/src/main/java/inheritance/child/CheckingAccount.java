package inheritance.child;

import inheritance.parent.BaseAccount;

/**
 * Created by desair4 on 11/30/2016.
 */
public class CheckingAccount {

    public int initialBalance;
    /*public int initialBalance;
    public int accountNumber;
    static public int count;
    */
    public BaseAccount baseAccount; //= new BaseAccount();  //Composition

    public int transactionFee = 10;

    public CheckingAccount(int initBalance) {

/*        if(initBalance <= 0){
            throw new RuntimeException("initital balance cannot be zero");
        }

        baseAccount.initialBalance = initBalance;*/
//        initialBalance = initBalance;

        baseAccount = new BaseAccount(initBalance);
    }

    public void setBaseAccount(BaseAccount baseAccount) {
        this.baseAccount = baseAccount;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "initialBalance=" + initialBalance +
                ", baseAccount=" + baseAccount +
                ", transactionFee=" + transactionFee +
                '}';
    }
}
