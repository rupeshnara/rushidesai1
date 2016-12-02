/**
 * Created by bhumi on 11/29/2016.
 */
public class SavingAccount {

    private double initialBalance;
    private double interestRate;

    SavingAccount(double initialBalance, double interestRate){
        setInitialBalance(initialBalance);
        setInterestRate(interestRate);
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {

        if (initialBalance <= 0) {
            System.out.println("Balance cannot be negative or zero");
        }
        else {
            this.initialBalance = initialBalance;
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

     public void credit(double amount){

        if (amount <= 0){
            System.out.println("Please ensure the amount to be deposited is not negative");
        }
        else {
            this.initialBalance = this.initialBalance + amount;
        }

    }

    public void debit(double amount){

        if (this.initialBalance < amount){
            System.out.println("Your balance is less than the requested amount");
        }

        else {
            this.initialBalance = this.initialBalance - amount;
        }
    }

    public double calculateInterest(){
        double interest = this.initialBalance * this.interestRate/100;

        return interest;
    }
}
