package banking;

/**
 * Created by Paul on 12/3/2016.
 */
public class CheckingAccount {

   public  int initialBalance;
    public int feecharged = 5 ;
   public  int accountnumber;
   public  static int count;

    public int getFeecharged() {
        return feecharged;
    }

    public void setFeecharged(int feecharged) {
        this.feecharged = feecharged;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CheckingAccount.count = count;
    }

    public int getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }







    //object creation based on intial balance
    public CheckingAccount(int initialBalance) {

        if(initialBalance<=0){
                System.out.println("balance cannot be negative");
            }
            else{

            this.initialBalance = initialBalance;

        }

        count++;

        }





        //  accountnumber generation
    public CheckingAccount(int initialBalance, int accountnumber) {
        this.initialBalance = initialBalance;
        this.accountnumber = accountnumber;

        if(initialBalance <= 0){

            throw new IllegalArgumentException(String.valueOf(accountnumber) + "Negative account number");
        }else{


                accountnumber = (int) (Math.random() * 90000000 + 10000000);
                System.out.println("Account number :" + accountnumber);


        }

    }




    //ammount credited in the account
    public void credit(int ammount){

        if(ammount > 0){

            initialBalance = ammount + initialBalance;
            System.out.println("new balance available in the :" +initialBalance );

        }else{

            System.out.println("Please ensure the amount to be deposited is not negative:");
        }
    }





    //ammount debited in the account by taking fee charged under consederation
    public void debit(int ammount) {

        if (ammount <= initialBalance) {

            initialBalance = (initialBalance - ammount) - feecharged;
            System.out.println("Avalaible ammount :" + initialBalance  +  "\n feecharged for transaction: " +feecharged);



        } else {

            initialBalance = initialBalance;
            System.out.println("ammount insufficient");

        }
    }






}
