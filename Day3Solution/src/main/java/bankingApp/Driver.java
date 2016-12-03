package bankingApp;

public class Driver {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 5);
        double interst = savingsAccount.calculateInterest();
        savingsAccount.credit(interst);

        SavingsAccount savingsAccountArray[] = new SavingsAccount[2];
        savingsAccountArray[0] = new SavingsAccount(100, 5);
        savingsAccountArray[1] = new SavingsAccount(500, 6);

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
            System.out.println(" The Initial Balance is: = " + checkingAccountsArray[i].getInitialBalance());
            System.out.println(" The Fee Charged: = " + checkingAccountsArray[i].getFeeCharged());
        }

        for (int i = 0; i < savingsAccountArray.length; i++) {
            double interestOwed = savingsAccountArray[i].calculateInterest();
            savingsAccountArray[i].credit(interestOwed);
            System.out.println(" The Updated Balance is : " + savingsAccountArray[i].getIntialBalance());
        }


    }
}