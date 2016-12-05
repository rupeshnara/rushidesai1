package banking;

/**
 * Created by harik on 12/3/2016.
 */
public class BaseClass {

    public int initialBalance;
    public int accountNumber;
    private int accountHash;
    public int count;

    public void checkingCountinstances() {
        System.out.println("hello you are create instances for checking class");
        System.out.print(count);
    }


    public int getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }



    @Override
    public String toString() {
        return "BaseClass{" +
                "initialBalance=" + initialBalance +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
