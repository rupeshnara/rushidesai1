package inheritance.parent;

/**
 * Created by desair4 on 11/30/2016.
 */
public class BaseAccount extends Object {
    static public int count;
    public int initialBalance;
    public int accountNumber;
    protected int accountKey;   //protected == default if no inheritance is involved.
    private String password;

    public BaseAccount() {
    }

    public BaseAccount(int initialBalance1) {

        if (initialBalance1 <= 0) {
            throw new RuntimeException("initital balance cannot be zero");
        }

        initialBalance = initialBalance1;
//        initialBalance = initBalance;
    }

    //Other methods which are not setters and getters


    //setters and getters

    public void setPassword(String password) {
        this.password = password;
    }

    //This is telling compiler I am overriding a method defined in my super class heirarchy.
    @Override
    public String toString() {
        return "BaseAccount{" +
                "initialBalance=" + initialBalance +
                ", accountNumber=" + accountNumber +
                ", password='" + password + '\'' +
                '}';
    }
}
