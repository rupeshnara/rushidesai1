package banking;

/**
 * Created by Paul on 12/4/2016.
 */
public class baseaccount {

    int initialBalance;
    public  int accountnumber;
    public  static int count;
    int accounthash;



    //getters and setters
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        count = count;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }


    public int getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public int getAccounthash() {
        return accounthash;
    }




    public void setAccounthash(int accounthash) {
        this.accounthash = accounthash;
    }
}
