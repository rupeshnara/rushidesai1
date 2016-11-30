package constructors;

/**
 * Created by desair4 on 11/29/2016.
 */
public class Day5 {

    public static void main(String[] args) {
        System.out.println("Entering main");
        SavingsAccount savingsAccount = new SavingsAccount(1000);
//        System.out.println(savingsAccount);

        //Exceptions stop program execution where they are thrown.
        System.out.println("Trying to create another object");
        try {
            SavingsAccount savingsAccount1 = new SavingsAccount(0);

            System.out.println("printin object");
            //Exceptions:
            System.out.println(savingsAccount1);
        } catch (RuntimeException e) {
            //Catch allows them to be caught and make program execution normal from there on
            System.out.println("Exception was thrown");
        }

        System.out.println(savingsAccount);
        System.out.println("Exiting main");
    }
}
