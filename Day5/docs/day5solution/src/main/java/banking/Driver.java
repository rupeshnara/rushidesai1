package banking;

/**
 * Created by harik on 12/1/2016.
 */
public class Driver {
    public static void main(String[] args) {

        CheckingAccount ch1 = new CheckingAccount(500);
        CheckingAccount ch2 = new CheckingAccount(1000);
        CheckingAccount ch3 = new CheckingAccount(1500);
        CheckingAccount ch4 = new CheckingAccount(2000);
        CheckingAccount ch5 = new CheckingAccount(2500);
        ch1.checkingCountinstances();

        System.out.println();

        SavingAccount sc1 = new SavingAccount(100);
        SavingAccount sc2 = new SavingAccount(200);
        SavingAccount sc3 = new SavingAccount(300);
        SavingAccount sc4 = new SavingAccount(400);
        SavingAccount sc5 = new SavingAccount(500);
        sc1.savingCountinstances();
        System.out.println();
        ch1.randomAccountNumber();
        System.out.println();


    }
}
