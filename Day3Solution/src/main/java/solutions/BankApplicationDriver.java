package solutions;

/**
 * Created by saikrishnareddy on 12/4/2016.
 */
public class BankApplicationDriver {

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        CheckingAccount ca = new CheckingAccount();

        sa.calculateInterest();
    }
}
