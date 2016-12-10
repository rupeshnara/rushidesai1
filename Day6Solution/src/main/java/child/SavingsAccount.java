package child;

import bank.BaseAccount;

/**
 * Created by desair4 on 12/4/2016.
 */
public class SavingsAccount extends BaseAccount {
    //if parent doesnt not have a no-argument constructor, then child also cannot have a no argument constructor

    //Since savings account doest not have a constructor, compiler adds a no-argument constructor.
    /*public SavingsAccount(){
        super(); //This will not compile since parent doesnot have a no argument constructor.
    }*/

    //We need to create explicit constructors since if we don't compiler creates one like above which is not valid.
    public SavingsAccount(double initialBalance) {
//        super(initialBalance, Base64.getEncoder().encodeToString(new Date().toString().getBytes()));  // instead of doing it inline here, we put it inside method, since method is going to be used by all childs we put it in parent.
        super(initialBalance, generateAccountHash());

        interestRate = interestRate;
    }

    public SavingsAccount(double initialBalance, Integer accountNumberClient) {
        super(initialBalance, accountNumberClient, generateAccountHash());
    }

    private double interestRate;

    public void debit(double amount) {

        if (initialBalance < amount) {
            System.out.println("Your balance is less than the requested amount");
        } else {
            initialBalance = initialBalance - amount;
        }
    }

    public void print() {
        System.out.println("Saving");
    }

    public double calculateInterest() {
        return initialBalance * interestRate / 100;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                "} " + super.toString();
    }
}