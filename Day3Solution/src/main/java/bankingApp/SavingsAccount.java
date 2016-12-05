package bankingApp;


public class SavingsAccount {
    private double intialBalance;
    private double interestRate;

   /* public SavingsAccount() // constructor
    {
        System.out.print("Constructor called...");
    }*/

    public SavingsAccount(double balance, double interest)  // argumented constructor
    {
        intialBalance = balance;
        interestRate = interest;
    }

    public void setIntialBalance(double intialBalance) {     // setting  Intal Balance
        if (intialBalance <= 0) {
            System.out.println("Balance cannot be negative or zero.");
        } else {
            this.intialBalance = intialBalance;
        }
    }

    public double getIntialBalance()
    {
        return intialBalance;
    }

    public void setInterestRate(double interestRate)
    {    // setting Interst
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void credit(double amount) {                     // credit() method
        if (amount < 0) {
            System.out.println("The Amount Should be Positive...!: ");
        } else {
            this.intialBalance = this.intialBalance + amount;
        }
    }

    public void debit(double amount) {                   // debit method
        if (this.intialBalance < amount) {

        } else {
            this.intialBalance = this.intialBalance - amount;
        }
    }

    public double calculateInterest()
    {
        return (this.intialBalance * this.interestRate) / 100;

    }


}

