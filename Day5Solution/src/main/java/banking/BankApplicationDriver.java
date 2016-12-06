package banking;

/**
 * Created by Paul on 12/4/2016.
 */
public class BankApplicationDriver {

    public static void main(String[] args){


        //Array of Savings Avccount
        SavingsAccount savingaccount[] = new SavingsAccount[2];
        savingaccount[0] = new SavingsAccount(300, 5);
        savingaccount[1] = new SavingsAccount(5000, 12345678);


        //Array of Checking account
        CheckingAccount checkingaccount[] = new CheckingAccount[3];
        checkingaccount[0] = new CheckingAccount(400);
        checkingaccount[1] = new CheckingAccount(500);
        checkingaccount[2] = new CheckingAccount(5000, 12345678);




        for (int i = 0; i < checkingaccount.length; i++) {
            double finalammount= (5 * checkingaccount[i].getInitialBalance()) / 100;
            checkingaccount[i].debit(finalammount);

            double amountToDeposit = (2 * checkingaccount[i].getInitialBalance()) / 100;
            checkingaccount[i].credit(finalammount);
        }

        for (int i = 0; i < checkingaccount.length; i++) {
            System.out.println("initialBalance = " + checkingaccount[i].getInitialBalance() + "  feeCharged = " + checkingaccount[i].getFeecharged());
        }

        for (int i = 0; i < savingaccount.length; i++) {
            double finalammount= savingaccount[i].calculateInterest(12,5);
           savingaccount[i].credit(finalammount);
            System.out.println("final Balance " + savingaccount[i].getInitialBalance());
        }



    //count number of instances

        System.out.println("Number of instaces in Checkingaccount: "  + CheckingAccount.getCount());
        System.out.println("Number of instaces in Savingaccount: "  + SavingsAccount.getCount());

     //













    }
}
