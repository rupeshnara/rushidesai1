package Banking;

/**
 * Created by Venkat Ramana on 12/4/2016.
 */
public class Test {
    public static void main(String[] args) {
        SavingsAccount sc = new SavingsAccount(4);
        CheckingAccount ca = new CheckingAccount(6);

        System.out.println(sc);
        System.out.println(ca);

    }
}
