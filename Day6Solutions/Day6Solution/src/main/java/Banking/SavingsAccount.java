package Banking;

public class SavingsAccount extends BaseAccount{

    private double interestRate;


    public SavingsAccount(double interestRate) {
        super();
        this.interestRate =interestRate;
    }


    /*
    public SavingsAccount(BaseAccount baseaccount, double interestRate) {

        super(initialBalance,accountHash);
        this.interestRate = interestRate;

    }*/

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }



    public void debit(double amount) {
        if (this.initialBalance < amount) {

        } else {
            this.initialBalance = this.initialBalance - amount;
        }
    }

    public double calculateInterest() {
        return (this.initialBalance * this.interestRate) / 100;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "initialBalance=" + initialBalance +
                ", interest='" + interestRate+ '\'' +
                '}';
    }


    }



	


