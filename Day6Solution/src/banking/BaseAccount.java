package banking;
import java.util.Date;
public class BaseAccount {
    public double intialBalance;
    public int accountNumber;
    private int accountHash;
    java.util.Date dateCreated = new java.util.Date();
      public BaseAccount(){
           // No argumented cons
      }
         public BaseAccount(double intialBal, int accountNO, int accountHash) {
                 this.intialBalance=intialBal;
                 this.accountNumber=accountNO;
                 this.accountHash=accountHash;
         }

    public void setIntialBalance(double intialBalance) {
        if (intialBalance <= 0) {
            System.out.println("Balance cannot be negative or zero.");
        } else {
            this.intialBalance = intialBalance;
        }
    }
    public double getIntialBalance() {
        return intialBalance;
    }
    public void credit(double amount) {
        if (amount < 0) {
        } else {
            this.intialBalance = this.intialBalance + amount;
        }
    }
     public void debit(double amount) {
        if (this.intialBalance < amount) {

        } else {
            this.intialBalance = this.intialBalance - amount;
        }
    }

}
