package banking;

public class TestAccount {
    public static void main(String[] args) {
        BaseAccount sAccount=new SavingsAccount(1000,25);
        BaseAccount cAccount=new CheckingAccount(2000);
        sAccount.credit(2500.0);
        System.out.println("Savings Account Credit Amount:: "+ sAccount);
        sAccount.debit(4500.0);
        System.out.println("The Savings Account Debit Amount:: "+sAccount);

        System.out.println("Account Number ...... Savings Account  : " + sAccount.accountNumber);
        System.out.println("Account Number ...... Checking Account  : " + cAccount.accountNumber);

       // System.out.println("To encode it with base 64 :" +);



    }
}
