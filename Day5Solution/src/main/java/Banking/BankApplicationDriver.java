package Banking;

/**
 * Created by bhumi on 11/29/2016.
 */
public class BankApplicationDriver {

    // Client can access this
    public static void main(String[] args) {

        SavingAccount savingAccount1 = new SavingAccount(1000);
        SavingAccount savingAccount2 = new SavingAccount(2000, 12345678);

        CheckingAccount checkingAccount1 = new CheckingAccount(1500);
        CheckingAccount checkingAccount2 = new CheckingAccount(2500, 12345678);


        System.out.println("Initial Balance for saving Account 1 is " + savingAccount1.getInitialBalance());
        System.out.println("Initial Balance for saving Account 1 is " + savingAccount1.getInitialBalance());
        System.out.println("Account Number for saving Account 1 is " + savingAccount2.generateAccountNumber());
        System.out.println("Account Number for saving Account 2 is " + savingAccount2.getAccountNumber());

        System.out.println(savingAccount1.countAccountCreationInstances());

        System.out.println("Initial Balance for Checking Account 1 is " + checkingAccount1.getInitialBalance());
        System.out.println("Initial Balance for Checking Account 2 is " + checkingAccount2.getInitialBalance());
        System.out.println("Account Number for Checking Account 1 is " + checkingAccount1.generateAccountNumber());
        System.out.println("Account Number for Checking Account 2 is " + checkingAccount2.getAccountNumber());

        System.out.println(checkingAccount1.countAccountCreationInstances());
    }
}

        /*SavingAccount savingAccount = new SavingAccount();
        double interest = savingAccount.calculateInterest();
        savingAccount.credit(interest);


        CheckingAccount checkingAccount = new CheckingAccount();

        SavingAccount[]  sAccount1 = new SavingAccount[2];
        sAccount1[0] = new SavingAccount(1000, 10);
        sAccount1[1] = new SavingAccount(2000, 15);

        CheckingAccount[]  cAccount1 = new CheckingAccount[2];
        cAccount1[0] = new CheckingAccount(1000);
        cAccount1[1] = new CheckingAccount(4000);

        try {
            SavingAccount savingAccount1 = new SavingAccount(100000, 20);

            System.out.println("This is a valid initial balance");
            System.out.println(savingAccount1);
        } catch (RuntimeException e) {
            //Catch allows them to be caught and make program execution normal from there on
            System.out.println("Initial balance value is invalid");
        }
        System.out.println(savingAccount);


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
    }*/