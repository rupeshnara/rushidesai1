package Banking.child;

import Banking.parent.*;

public class BankApplicationDriver {

    // Client can access this
    public static void main(String[] args) throws Exception {

        SavingAccount sAccount1 = new SavingAccount(1200);
        SavingAccount sAccount2 = new SavingAccount(1500, 999999);

        CheckingAccount cAccount1 = new CheckingAccount(100);
        CheckingAccount cAccount2 = new CheckingAccount(2500, 87654321);

        System.out.println(sAccount1.toString());
        System.out.println(sAccount2.toString());

        System.out.println(cAccount1.toString());
        System.out.println(cAccount2.toString());

        AccountHelper.debitMoney(sAccount1, 10);
        AccountHelper.debitMoney(cAccount1,20);

    }

}