package banking;

/**
 * Created by Paul on 12/3/2016.
 */
public class SavingsAccount {

   int initialBalance;
   double interestrate;
    int accountnumber;
    public static int count;


    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        SavingsAccount.count = count;
    }

    public int getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }


  //validation for initialBalance
    public SavingsAccount(int initialBalance) {
        this.initialBalance = initialBalance;

        if(initialBalance<=0){
            System.out.println("balance cannot be negative");
        }
    }

    public SavingsAccount(int initialBalance, double interestrate) {
        this.initialBalance = initialBalance;
        this.interestrate = interestrate;
        count++;
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


    public int calculateInterest() {
        return 0;
    }
}
