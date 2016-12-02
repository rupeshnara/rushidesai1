/**
 * Created by bhumi on 11/29/2016.
 */
public class BankApplicationDriver {

    public static void main(String[] args) {


        SavingAccount savingAccount = new SavingAccount(100, 2);

        double interest = savingAccount.calculateInterest();
        savingAccount.credit(interest);

        CheckingAccount checkingAccount = new CheckingAccount(500);

        SavingAccount[]  sAccount1 = new SavingAccount[2];
        sAccount1[0] = new SavingAccount(1000, 10);
        sAccount1[1] = new SavingAccount(2000, 15);

        CheckingAccount[]  cAccount1 = new CheckingAccount[2];
        cAccount1[0] = new CheckingAccount(1000);
        cAccount1[1] = new CheckingAccount(4000);

        // for checking account

        for (int i = 0; i < cAccount1.length; i++) {

            double amountToWithdraw = (5 * cAccount1[i].getInitialBalance())/ 100;
            cAccount1[i].debit(amountToWithdraw);

            double amountToDeposit = (2 * cAccount1[i].getInitialBalance())/ 100;
            cAccount1[i].credit(amountToDeposit);
        }

        for (int i = 0; i < cAccount1.length; i++){
            System.out.println("Initial Balance: " + cAccount1[i].getInitialBalance() + "." +
                    "Transaction Fees: " + cAccount1[i].getTransactionFees() );
        }

        System.out.println();

        // for saving account

        for (int i =0; i < sAccount1.length; i++){

            double interestAdded = sAccount1[i].calculateInterest();
            sAccount1[i].credit(interestAdded);

            System.out.println("New Balance: " + sAccount1[i].getInitialBalance());
        }
    }


}
