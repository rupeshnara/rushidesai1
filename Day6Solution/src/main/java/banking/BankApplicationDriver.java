package banking;

/**
 * Created by saikrishnareddy on 12/4/2016.
 */
public class BankApplicationDriver {

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(10, 5);
        CheckingAccount ca = new CheckingAccount(10);
        double interest = sa.calculateInterest();
        sa.credit(interest);

        SavingsAccount savingsAccountArray[] = new SavingsAccount[2];
        savingsAccountArray[0] = new SavingsAccount(500, 5);
        savingsAccountArray[1] = new SavingsAccount(1000, 10);

        CheckingAccount checkingAccountArray[] = new CheckingAccount[2];
        checkingAccountArray[0] = new CheckingAccount(500);
        checkingAccountArray[1] = new CheckingAccount(1000);

        for (int i = 0; i < checkingAccountArray.length; i++) {
            double debitAmount = (checkingAccountArray[i].getInitialBalance() * 5 / 100);
            System.out.println("Available Balance after debit:" + (checkingAccountArray[i].getInitialBalance() - 5));
            checkingAccountArray[i].debit(debitAmount);

            double creditAmount = (checkingAccountArray[i].getInitialBalance() * 2 / 100);
            System.out.println("Available Balance after credit:" + (checkingAccountArray[i].getInitialBalance()));
            checkingAccountArray[i].credit(creditAmount);
        }
        for (int i = 0; i < savingsAccountArray.length; i++) {
            double balance = savingsAccountArray[i].calculateInterest();
            savingsAccountArray[i].credit(balance);
            System.out.println("Available Balance with intrest " + savingsAccountArray[i].getInitialBalance());
        }
    }
}
