
package banking;
import java.util.Random;
public class SavingsAccount {

    private double initialBalance;
    private double interestRate;
    private int accountNumber;
    static int count=0;

   /* public SavingsAccount(double iBalance, double iRate) {
        this.initialBalance=iBalance;
        this.interestRate=iRate;
        count++;
    }*/

    public SavingsAccount(double iBalance) {

        if (validateInitialBalance()) {
            throw new RuntimeException("Initial balance should not be zero");
        }
        accountNumber = genAccount();

    }


    public static int getCount() {
        return count;
    }
    public int countAccount(){

        System.out.println(count );
        return count;
    }

    public static void setCount(int count) {
        SavingsAccount.count = count;
    }
     public int genAccount(){

        Random rand = new Random();
         accountNumber = rand.nextInt(111111111) + 1;
          return accountNumber;
    }

       public double getAccountNumber(){

        return accountNumber;
    }
    public void setAccountNumber(int accountnumber){
        this.accountNumber= accountnumber;
    }

    private boolean validateNumberOfDigits() {

        long temp = accountNumber;
        int digits = 0;

        while (temp >= 10) {
            temp = temp % 10;
            digits++;
        }

        if (digits == 8) {
            return true;
        }
        return false;
    }
    private boolean validateInitialBalance() {

        if (initialBalance <= 0) {
            return false;
        }
        return true;
    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double iBalance) {

        if (initialBalance <= 0) {
            System.out.println("Intal balance should not be zero.");
        } else {
            this.initialBalance = iBalance;
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double iRate) {
        this.interestRate = iRate;
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

    public double calculateInterest() { return (this.initialBalance * this.interestRate) / 100;
    }

    public void savingCountinstances() {

        System.out.print(count);
    }
}
