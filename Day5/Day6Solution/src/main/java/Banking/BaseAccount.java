package Banking;


import java.util.Date;

public class BaseAccount {
    public double initialBalance;
    //private int accountHash;
    protected int accountnumber;

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }
//validate account number and generated account number
    public void validateAccountNumber( int accountnumber)
    {
        if(initialBalance > 0) {
            accountnumber = (int) (Math.random() * 90000000 + 10000000);

        }
        if(String.valueOf(accountnumber).length() != 8) {
            throw new IllegalArgumentException(Integer.toString(accountnumber) + "accountnumber not valid");
        }
        else
            System.out.println("Accountnumber : " + accountnumber);

    }

    public double getInitialBalance() {
        return initialBalance;
    }


    public void setInitialBalance(double initialBalance) {


            this.initialBalance = initialBalance;

    }
    public void credit(double amount) {
        if (amount < 0) {
        } else {
            this.initialBalance = this.initialBalance + amount;
        }
    }
    //date generated
    public void toDays( ) {
        Date date = new Date();
        System.out.println(date.toString());
    }


//account hash caluculation
    int accountHash =   (int) new Date().getTime() + accountnumber;




    @Override
    public String toString() {
        return "BaseAccount{" +
                "initialBalance=" + initialBalance +

                ", accountHash='" + accountHash+
                '}';
    }




}