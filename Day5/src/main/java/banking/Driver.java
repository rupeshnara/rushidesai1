package banking;

public class Driver {

        public static void main(String[] args) {

            SavingsAccount s1 = new SavingsAccount(1000);
            SavingsAccount s2 = new SavingsAccount(2000);

            CheckingAccount c1 = new CheckingAccount(1500);
            CheckingAccount c2 = new CheckingAccount(2500, 12345678);


            System.out.println("Initial Balance for saving Account 1 is " + s1.getInitialBalance());
            System.out.println("Initial Balance for saving Account 1 is " + s1.getInitialBalance());
            System.out.println("Account Number for saving Account 1 is " + s1.genAccount());
            System.out.println("Account Number for saving Account 2 is " + s1.getAccountNumber());

            System.out.println(s1.countAccount());

            System.out.println("Initial Balance for Checking Account 1 is " + c1.getInitialBalance());
            System.out.println("Initial Balance for Checking Account 2 is " + c1.getInitialBalance());
            System.out.println("Account Number for Checking Account 1 is " + c1.genAccountNumber());
            System.out.println("Account Number for Checking Account 2 is " + c1.getAccountNumber());

            System.out.println(c1.genAccountNumber());
        }
    }



