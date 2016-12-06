package banking;

/**
 * Created by Paul on 12/3/2016.
 */
public class CheckingAccount {

//intial parameters
    double interestrate;
    public static int count;
    public double initialBalance;
    int accountnumber;


    public int feecharged = 5 ;

   //getters and setter
    public double getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(double interestrate) {
        this.interestrate = interestrate;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CheckingAccount.count = count;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }
    public int getFeecharged() {
        return feecharged;
    }

    public void setFeecharged(int feecharged) {
        this.feecharged = feecharged;
    }








    //object creation based on intial balance and account number generation when not given
    public CheckingAccount(int initialBalance) {

        if(initialBalance > 0){


            accountnumber = (int) (Math.random() * 90000000 + 10000000);
            System.out.println("Account number :" + accountnumber);

            }
            else{

            throw new IllegalArgumentException(String.valueOf(accountnumber) + "Negative Balance");

        }




        count++;

        }


        //  accountnumber when provided
    public CheckingAccount(int initialBalance, int accountnumber1) {
        this(initialBalance);
        this.accountnumber = accountnumber1;
        if(initialBalance > 0) {
            if (String.valueOf(accountnumber1).length() == 8) {

                System.out.println("valid account number : " + accountnumber1);
            } else {


                accountnumber = (int) (Math.random() * 90000000 + 10000000);
                System.out.println("Account number is not correct your new account number :" + accountnumber);


            }
        }else{
            throw new IllegalArgumentException(String.valueOf(initialBalance) + "BALANCE NOT VALID");

        }

    }




    //ammount credited in the account
    public void credit(double ammount){

        if(ammount > 0){

            initialBalance = ammount + initialBalance;
            System.out.println("new balance available in the :" +initialBalance );

        }else{

            System.out.println("Please ensure the amount to be deposited is not negative:");
        }
    }





    //ammount debited in the account by taking fee charged under consederation
    public void debit(double ammount) {

        if (ammount <= initialBalance) {

            initialBalance = (initialBalance - ammount) - feecharged;
            System.out.println("Avalaible ammount :" + initialBalance  +  "\n feecharged for transaction: " +feecharged);



        } else {

            initialBalance = initialBalance;
            System.out.println("ammount insufficient");

        }
    }






}
