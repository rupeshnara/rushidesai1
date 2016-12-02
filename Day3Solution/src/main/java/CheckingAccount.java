/**
 * Created by bhumi on 11/29/2016.
 */
public class CheckingAccount {

    private double initialBalance;
    private double interestRate;

    private double transactionFees = 5;

    CheckingAccount(double initialBalance){
        setInitialBalance(initialBalance);
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

    void credit(double amount){

        if (amount <= 0){
            System.out.println("Please ensure the amount to be deposited is not negative");
        }
        else {
            this.initialBalance = this.initialBalance + amount;
        }

    }

    void debit(double amount){

        if (this.initialBalance < amount + transactionFees){
            System.out.println("Your balance is less than the requested amount");
        }

        else {
            this.initialBalance = this.initialBalance - amount - transactionFees;
        }
    }

    public double getTransactionFees() {
        return transactionFees;
    }

    public void setTransactionFees(double transactionFees) {
        this.transactionFees = transactionFees;
    }
}
