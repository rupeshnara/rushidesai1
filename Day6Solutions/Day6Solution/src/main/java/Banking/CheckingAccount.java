package Banking;

public class CheckingAccount extends BaseAccount {

    private int transactionFees = 5;

    //constructor with initialBalance and involing Baseclass constructor
    public CheckingAccount(double initialBalance) {
        super(initialBalance, generateAccountHash());
    }

    //constructor with initialBalance and accountNumber and superclass constructors
    public CheckingAccount(double initialBalance, Integer accountNumber1) {
        super(initialBalance, accountNumber1, generateAccountHash());
    }


    //method for debit
    public void debit(double amount) {
        if (initialBalance < amount + transactionFees) {
//throw exception if amount is less than initialBalance
            throw new RuntimeException("Your balance is less than the requested amount");
        } else {

            initialBalance = initialBalance - amount - transactionFees;
        }
    }

    public double getTransactionFees() {
        return transactionFees;
    }

    public void setTransactionFees(int transactionFees) {
        transactionFees = transactionFees;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "transactionFees=" + transactionFees +
                "} " + super.toString();
    }
}


