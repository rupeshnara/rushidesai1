package constructors;

/**
 * Created by desair4 on 11/29/2016.
 */
public class SavingsAccount {

    private int initialBalance;
    private int accountNumber;
    /*
    * Constructors : They are 'special' methods
    * 1. they are called automatically when object is created.
    * 2. they have same name as the class
    * 3. it doesn't have a explicit return type
    * 4. it return object of the class by default
    * 5. it cannot be static. Because Constructors by default return Object of the class. Then static doesnt make sense.
    * */
    /*private SavingsAccount() {

    }*/

    //Constructors allow you to force client to create objects with default values.
    //
    public SavingsAccount(int initialBalance) {
//        if (initialBalance <= 0) {
        if (initialBalance <= 0) {
            System.out.println("initial balance cannot be less than zero");
            throw new RuntimeException("Balance has to be positive");
            //dont create the instance if condition is not met
        } else {
            //shadowing
            initialBalance = initialBalance;

            //how do I tell compiler I want to refer to instance initialBalance?
            this.initialBalance = initialBalance;
        }
        System.out.println("Exiting construtor : " + this.initialBalance);
    }

    SavingsAccount(int accountNumber, int initialBalance) {

    }

    //not satisfacotry. I want to force client to provide initial balance and only then allow him to create an object.
    public boolean validateInitialBalance() {
        if (initialBalance <= 0) {
            return false;
        } else {
            return true;
        }
    }

    //MethodOverloading
    private int validateInitialBalance(int dummyVariable) {
        if (initialBalance <= 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "initialBalance=" + initialBalance +
                '}';
    }
}

