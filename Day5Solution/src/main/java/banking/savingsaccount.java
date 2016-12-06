package banking;
import java.util.ArrayList;


/**
 * Created by Paul on 12/3/2016.
 */
public class SavingsAccount  {


   double interestrate;
   public static int count;
   public double initialBalance;
   int accountnumber;



    public static int getCount() {
        return count;
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

    public static void setCount(int count) {
        SavingsAccount.count = count;
    }

    public double getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(double interestrate) {
        this.interestrate = interestrate;
    }

    // arraylist for prvious account numbers
     ArrayList<Integer> previousaccountnumber= new ArrayList<Integer>(accountnumber);







    //validation for initialBalance and account number generation when not given
    public SavingsAccount(int initialBalance) {
        this.initialBalance = initialBalance;

        if(initialBalance<=0){
            throw new IllegalArgumentException(String.valueOf(initialBalance) + "BALANCE NOT VALID");
        }else{
            accountnumber = (int) (Math.random() * 90000000 + 10000000);
            System.out.println("Account number generated balance is valid :" + accountnumber);

        }
    }

    public SavingsAccount(int initialBalance, double interestrate) {
        this.initialBalance = initialBalance;
        this.interestrate = interestrate;
        count++;
    }




    //account number generation when account number given
    public SavingsAccount(int initialBalance,  int accountnumber1) {
        this.initialBalance = initialBalance;
        this.accountnumber = accountnumber1;

        if (initialBalance > 0) {
            if (String.valueOf(accountnumber1).length() == 8) {

                System.out.println("Account number is valid : " + accountnumber1);
            } else {


                accountnumber = (int) (Math.random() * 90000000 + 10000000);
                System.out.println("Account number is not correct  Please take your new account number :" + accountnumber);
            }
            count++;
        }
    else{

            throw new IllegalArgumentException(String.valueOf(initialBalance) + "BALANCE NOT VALID");

    }}

    //ammount credited in the account
  public void credit(double ammount){

        if(ammount > 0){

            initialBalance = ammount + initialBalance;
            System.out.println("new balance available in the :" +initialBalance );

        }else{

            System.out.println("Please ensure the amount to be deposited is not negative:");
        }
  }

  //ammount debited in the account
    public void debit(int ammount){

      if(ammount <= initialBalance){

          initialBalance = initialBalance - ammount;
          System.out.println("Avalaible ammount :" + initialBalance);

      }else{

          initialBalance =initialBalance;
          System.out.println("ammount insufficient");

        }



    }
  //Intrest rate caluculation

    public double calculateInterest(int initialBalance,double interestrate){

        double interest;
        interest = initialBalance * interestrate;
        System.out.println("interest on" + initialBalance + "at" + interestrate + "% rate is" + interest);
        return interest;
    }


    public double calculateInterest() {
        return 0;
    }
}

