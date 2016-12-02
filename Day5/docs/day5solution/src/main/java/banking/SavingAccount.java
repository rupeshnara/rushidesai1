package banking;

/**
 * Created by harik on 12/1/2016.
 */
public class SavingAccount {
    public int getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    private int initialBalance;
    private int accountnumber;

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    static int count;

    public SavingAccount(int initialBalance) {
        if (initialBalance <= 0 && initialBalance == 0) {
            System.out.println("initial balance should be greater than o or must be positive");
        } else {
            System.out.println("initial balance is" + initialBalance);
        }
        count++;
    }


    public void savingCountinstances() {
        System.out.println("hello you are create instances for saving class");
        System.out.print(count);
    }

}



