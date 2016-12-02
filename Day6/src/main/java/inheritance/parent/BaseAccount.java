package inheritance.parent;

/**
 * Created by desair4 on 11/30/2016.
 */
public class BaseAccount extends Object {
    public int initialBalance;
    public int accountNumber;
    static public int count;
    private String password;
    protected int accountKey;   //protected == default if no inheritance is involved.

    public BaseAccount() {
    }

    public BaseAccount(int initial) {

        if (initial <= 0) {
            throw new RuntimeException("initital balance cannot be zero");
        }

        initialBalance = initial;
//        initialBalance = initBalance;
    }

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
