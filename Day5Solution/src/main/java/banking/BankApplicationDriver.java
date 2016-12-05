package banking;

public class BankApplicationDriver {


    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(100, 5);
        double interest = savingsAccount.calculateInterest();
        savingsAccount.credit(interest);

        CheckingAccount checkingAccount = new CheckingAccount(100);

        SavingsAccount savingsAccountArray[] = new SavingsAccount[2];
        savingsAccountArray[0] = new SavingsAccount(100, 5);
        savingsAccountArray[1] = new SavingsAccount(200, 10);


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

        System.out.println("Account Number fvor Checking Account  : " + checkingAccount.getAccountNumber());

            SavingsAccount trial = new SavingsAccount(110,2345678);


        System.out.println("trial" + trial);





    }


}
