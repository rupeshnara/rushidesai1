package Driver;

import child.SavingsAccount;
import Banking.AccountHelper;

import static Banking.AccountHelper.*;

/**
 * Created by Venkat Ramana on 12/12/2016.
 */
public class Test {
    public static void main(String[] args) {
        SavingsAccount sa= new SavingsAccount(2000.23,12345678);
        System.out.println(sa);
      //  System.out.println();

        //System.out.println(SavingsAccount);
        AccountHelper.debitMoney(sa,200);
    }
}
