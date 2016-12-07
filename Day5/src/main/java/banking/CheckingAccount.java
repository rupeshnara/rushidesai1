package banking;
import java.util.Random;
public class CheckingAccount {

    private double initialBalance;
    private int FeeCharged;
    private Integer accountNumber;
    public  static int count = 0;


    public CheckingAccount(double iBalance) {

        if (validateInitialBalance()) {
            throw new RuntimeException("Initial balance should not be zero");
        }
        accountNumber = genAccountNumber();

    }
    public CheckingAccount(double iBalance, Integer aNumber) {
        if (validateInitialBalance()) {
            throw new RuntimeException("Initial balance should not be zero");
        }
        if (!validateNumberOfDigits()) {
            throw new RuntimeException("Account Number must be 8 digits");
        }

        if (duplicateAccount()){
            throw new RuntimeException("Account Number exists. Give Unique number.....");
        }
        this.accountNumber = aNumber;
        count++;
    }

    public int countAccount(){

        System.out.println(count);
        return count;
    }
    private boolean duplicateAccount() {

        String verifiedAccountNumber = accountNumber.toString();
        if(verifiedAccountNumber.equals(accountNumber)) {

            return  false;
        }
        return true;
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
    }

    public Integer genAccountNumber() {

        Random r = new Random();
        accountNumber = r.nextInt((9999999 + 1000000) - 1);
        return accountNumber;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
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

        if (this.initialBalance < amount + FeeCharged){
            System.out.println("Your balance is less than the requested amount");
        }

        else {
            this.initialBalance = this.initialBalance - amount - FeeCharged;
        }
    }

    public double getTransactionFees() {
        return FeeCharged;
    }

    public void setTransactionFees(int transactionFees) {
        this.FeeCharged = transactionFees;
    }

    @Override
    public String toString() {
        return "Banking.CheckingAccount{" +
                "initialBalance=" + initialBalance +
                '}';
    }
}