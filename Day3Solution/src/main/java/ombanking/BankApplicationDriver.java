package ombanking;

import java.util.ArrayList;

/**
 * Created by Paul on 12/4/2016.
 */
public class BankApplicationDriver {

    public static void main(String[] args){

        SavingsAccount savingaccount[] = new SavingsAccount[2];
        savingaccount[0] = new SavingsAccount(300, 5);
        savingaccount[1] = new SavingsAccount(5000, 10);

        CheckingAccount checkingaccount[] = new CheckingAccount[2];
        checkingaccount[0] = new CheckingAccount(400);
        checkingaccount[1] = new CheckingAccount(500);



        for (int i = 0; i < checkingaccount.length; i++) {
            int finalammount= (5 * checkingaccount[i].getInitialBalance()) / 100;
            checkingaccount[i].debit(finalammount);

            double amountToDeposit = (2 * checkingaccount[i].getInitialBalance()) / 100;
            checkingaccount[i].credit(finalammount);
        }

        for (int i = 0; i < checkingaccount.length; i++) {
            System.out.println("initialBalance = " + checkingaccount[i].getInitialBalance() + "  feeCharged = " + checkingaccount[i].getFeecharged());
        }

        for (int i = 0; i < savingaccount.length; i++) {
            int finalammount= savingaccount[i].calculateInterest();
           savingaccount[i].credit(finalammount);
            System.out.println("final Balance " + savingaccount[i].getInitialBalance());
        }














    }
}
