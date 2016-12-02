package banking;

import java.util.Random;


/**
 * Created by harik on 12/1/2016.
 */
public class CheckingAccount {
    public int getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    private int initialBalance;
    private int acnumber;

    public int getAccountnumber() {
        return acnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.acnumber = accountnumber;
    }


    static int count;
    Random r = new Random();


    public CheckingAccount(int initialBalance, int acnumber) {
        if (initialBalance <= 0 && acnumber <= 8) {
            System.out.println("initial balance should be greater than o or must be positive");
        } else {
            System.out.println("initial balance is" + initialBalance);
        }




       /* if (accountnumber == 8)
        {
            System.out.println("account number is "+accountnumber);

        }
        else
        {
            System.out.println("account number is invalid");

        }*/
        count++;
    }


    public void checkingCountinstances() {
        System.out.println("hello you are create instances for checking class");
        System.out.print(count);
    }


    public void randomAccountNumber() {
        int aNumber = 0;
        aNumber = (int) ((Math.random() * 99999999) + 11111111);
        System.out.println("Random numbers are" + aNumber);
    }

}






