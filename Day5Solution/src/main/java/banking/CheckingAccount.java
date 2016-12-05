package banking;
import java.util.Random;
public class CheckingAccount {
    private double initialBalance;
    private double feeCharged = 5;
    private int accountnumber;
     public static int count = 0;

    int [] array = new int[100];
    //constructor
    public CheckingAccount(double initialBalance) {
        if (initialBalance <= 0) {
            System.out.println("Balance cannot be negative or zero.");
        } else {
            this.initialBalance = initialBalance;
        }
        count++;
    }
    //random account number generating and validation
    public CheckingAccount(double initialBalance, int accountnumber) {
        this.initialBalance = initialBalance;
        this.accountnumber = accountnumber;
        if(initialBalance> 0){

            accountnumber =  ((int)((Math.random() * 90000000)+10000000));

            if( String.valueOf(accountnumber).length()== 8){
                System.out.println("Accountnumber :" + accountnumber);
            }
            else{
                throw new IllegalArgumentException(Integer.toString(accountnumber) + "accountnumber not valid");        }
            }


    }


    //if account number is not given
    public void accountnumbernotgiven(){

        if(initialBalance> 0){

            accountnumber =  ((int)((Math.random() * 90000000)+10000000));


            System.out.println("Account nmuber :" + accountnumber);



        }




        }




    //getter and setter methods

    public int getAccountNumber(){
        return accountnumber;
    }
    public void setAccountNumber(int accountnumber){
        this.accountnumber= accountnumber;}


    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;

    }
    public double getFeeCharged() {
        return feeCharged;
    }

    public void setFeeCharged(double feeCharged) {
        this.feeCharged = feeCharged;
    }
    public int getCount() {
        return count;
    }
    //public void setCount(int count) {CheckingAccount.count = count;}
//methods
    public void credit(double amount) {
        if (amount < 0) {
        } else {
            this.initialBalance = this.initialBalance + amount;
        }
    }

    public void debit(double amount) {
        if (this.initialBalance < amount) {

        } else {
            this.initialBalance = this.initialBalance - amount - feeCharged;
        }
    }


   // int aNumber = (int)((Math.random() * 90000000)+10000000);
}
