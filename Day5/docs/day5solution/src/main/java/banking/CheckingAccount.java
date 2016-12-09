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
    public int length;


    public int getAcnumber() {
        return acnumber;
    }

    public void setAcnumber(int acnumber) {
        this.acnumber = acnumber;
    }

    static int count;
    Random r = new Random();


    public CheckingAccount(int inb, int accountnumber) {
        //int length = (int) Math.log10(number) + 1;
        length = (int) Math.log10(accountnumber) + 1;
        System.out.println(length);
        if (inb <= 0 && length != 8) {
            System.out.println("initial balance should be greater than o or must be positive");
            throw new RuntimeException("Balance has to be positive");
        } else {
            initialBalance = inb;
            acnumber = accountnumber;
            System.out.println("initial balance is" + initialBalance + " account number is     " + acnumber);
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

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "initialBalance=" + initialBalance +
                '}';
    }
}





