public class DriverClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //double initialBalance;
        SavingsAccount sv1 = new SavingsAccount();
        CheckingAccount ch = new CheckingAccount();
        sv1.credit(700);
        sv1.debit(400);
        sv1.calculateInterest();

        System.out.println("initial balance is" + sv1.getInitialBalance());


        ch.credit(500);
        ch.debit(160);
        System.out.println("initial balance is" + ch.getInitialBalance());


    }

}
