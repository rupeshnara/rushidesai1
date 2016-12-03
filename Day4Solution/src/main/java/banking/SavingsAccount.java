package banking;
import java.util.Random;
public class SavingsAccount {

    private double initialBalance;
    private double interestRate;
    private int accountnumber;
    static int count=0;

    public SavingsAccount(double initialBalance, double interestRate) {
        setInitialBalance(initialBalance);
        setInterestRate(interestRate);
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        SavingsAccount.count = count;
    }

    int aNumber = (int)((Math.random() * 90000000)+10000000);



    public double getAccountNumber(){

        return accountnumber;
    }
    public void setAccountNumber(int accountnumber){
        this.accountnumber= accountnumber;}



    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {

        if (initialBalance <= 0) {
            System.out.println("Balance cannot be negative or zero.");
        } else {
            this.initialBalance = initialBalance;
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
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

	


