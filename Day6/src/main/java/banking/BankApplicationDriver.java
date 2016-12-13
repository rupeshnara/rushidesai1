package banking;

/**
 * Created by saikrishnareddy on 12/4/2016.
 */
public class BankApplicationDriver {


    public static void main(String[] args) throws Exception {

        int count = 0;
        SavingsAccount sa = SavingsAccount.initialize(10, 5);
        CheckingAccount ca = CheckingAccount.initialize(10);
        if (sa != null) {
            count = count + 1;
            double interest = sa.calculateInterest();
            sa.credit(interest);
        }
        if (ca != null) {
            count = count + 1;
        }

        SavingsAccount savingsAccountArray[] = new SavingsAccount[2];
        savingsAccountArray[0] = SavingsAccount.initialize(500, 5);
        savingsAccountArray[1] = SavingsAccount.initialize(-1000, 10);

        CheckingAccount checkingAccountArray[] = new CheckingAccount[2];
        checkingAccountArray[0] = CheckingAccount.initialize(500);
        checkingAccountArray[1] = CheckingAccount.initialize(1000);

        for (int i = 0; i < checkingAccountArray.length; i++) {
            if (checkingAccountArray[i] != null) {
                count = count + 1;
                double debitAmount = (checkingAccountArray[i].getInitialBalance() * 5 / 100);
                System.out.println("Available Balance after debit:" + (checkingAccountArray[i].getInitialBalance() - 5));
                checkingAccountArray[i].debit(debitAmount);

                double creditAmount = (checkingAccountArray[i].getInitialBalance() * 2 / 100);
                System.out.println("Available Balance after credit:" + (checkingAccountArray[i].getInitialBalance()));
                checkingAccountArray[i].credit(creditAmount);
            }
        }
        for (int i = 0; i < savingsAccountArray.length; i++) {
            if (savingsAccountArray[i] != null) {
                count = count + 1;
                double balance = savingsAccountArray[i].calculateInterest();
                savingsAccountArray[i].credit(balance);
                System.out.println("Available Balance with intrest " + savingsAccountArray[i].getInitialBalance());
            }
        }
        System.out.println("Count of valid Accounts:" + count);
    }
}
