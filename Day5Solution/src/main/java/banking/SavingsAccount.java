package banking;
import java.util.Random;
public class SavingsAccount {

    private double initialBalance;
    private double interestRate;
    public int accountnumber;
    public int count = 0;

    //constructor
    public SavingsAccount(double initialBalance) {
        if (initialBalance <= 0) {
            System.out.println("Balance cannot be negative or zero.");
        } else
            this.initialBalance = initialBalance;
        count++;

    }

    public SavingsAccount(double initialBalance, double interestRate) {
        if (initialBalance <= 0) {
            System.out.println("Balance cannot be negative or zero.");
        } else
            this.initialBalance = initialBalance;
        this.interestRate = interestRate;
        count++;

    }

    //random account number generating and validation
    public SavingsAccount(double initialBalance, int accountnumber) {
        this.initialBalance = initialBalance;
        this.accountnumber = accountnumber;

        if(initialBalance>0)

    {

        accountnumber = ((int) ((Math.random() * 90000000) + 10000000));

        if (String.valueOf(accountnumber).length() == 8) {
            System.out.println("Accountnumber :" + accountnumber);
        } else {
            throw new IllegalArgumentException(Integer.toString(accountnumber) + "accountnumber not valid");
        }
    }


}

    //if account number is not given
    public void accountnumbernotgiven(){

        if(initialBalance> 0){

            accountnumber =  ((int)((Math.random() * 90000000)+10000000));


            System.out.println("Account nmuber :" + accountnumber);



        }}
    //getter and setter methods

    public double getAccountNumber() {

        return accountnumber;
    }

    public void setAccountNumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }


    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {

        this.initialBalance = initialBalance;

    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getCount() {
        return count;
    }

    public void credit(double amount) {
        if (amount < 0) {
            System.out.println("Please ensure the amount to be deposited is not negative: ");
        } else {
            this.initialBalance = this.initialBalance + amount;
        }
    }

    public void debit(double amount) {
        if (this.initialBalance < amount) {
            System.out.println("Please enter valid amount");

        } else {
            this.initialBalance = this.initialBalance - amount;
        }
    }

    public double calculateInterest() {
        return (this.initialBalance * this.interestRate) / 100;
    }


}
	


