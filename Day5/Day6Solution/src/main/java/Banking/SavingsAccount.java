package Banking;

public class SavingsAccount extends BaseAccount{

    private double interestRate;


    public SavingsAccount(double initialBalance, double interestRate) {
        setInitialBalance(initialBalance);
        setInterestRate(interestRate);
    }

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
                ", accountNumber=" + accountnumber +
                ", interest='" + interestRate+ '\'' +
                '}';
    }


    }



	


