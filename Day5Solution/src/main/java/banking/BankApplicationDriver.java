package banking;


public class BankApplicationDriver {


    public static void main(String[] args) {

        SavingsAccount savingsAccountArray[] = new SavingsAccount[2];
        savingsAccountArray[0] = new SavingsAccount(100, 55555555);
        savingsAccountArray[1] = new SavingsAccount(200, 11111111);

        CheckingAccount checkingAccountsArray[] = new CheckingAccount[2];
        checkingAccountsArray[0] = new CheckingAccount(100);
        checkingAccountsArray[1] = new CheckingAccount(200);

        for (int i = 0; i < checkingAccountsArray.length; i++) {
            double amountToWithDraw = (5 * checkingAccountsArray[i].getInitialBalance()) / 100;
            checkingAccountsArray[i].debit(amountToWithDraw);

            double amountToDeposit = (2 * checkingAccountsArray[i].getInitialBalance()) / 100;
            checkingAccountsArray[i].credit(amountToDeposit);
        }

        for (int i = 0; i < checkingAccountsArray.length; i++) {
            System.out.println("initialBalance = " + checkingAccountsArray[i].getInitialBalance() + "  feeCharged = " + checkingAccountsArray[i].getFeeCharged());
        }

        for (int i = 0; i < savingsAccountArray.length; i++) {
            double interestOwed = savingsAccountArray[i].calculateInterest();
            savingsAccountArray[i].credit(interestOwed);
            System.out.println("Updated Balance " + savingsAccountArray[i].getInitialBalance());
        }


        System.out.println("No of CheckingAccounts created = " + CheckingAccount.getCount());
        System.out.println("No of SavingsAccounts created = " + SavingsAccount.getCount());

        for (int i = 0; i < checkingAccountsArray.length; i++) {
            System.out.println("CheckingAccounts AccountNumber = " + checkingAccountsArray[i].getAccountNumber());
        }

        for (int i = 0; i < savingsAccountArray.length; i++) {
            System.out.println("SavingsAccounts AccountNumber " + savingsAccountArray[i].getAccountNumber());
        }
    }
}
