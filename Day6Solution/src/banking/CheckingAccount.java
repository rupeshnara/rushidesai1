package banking;
import java.util.Random;
public class CheckingAccount extends BaseAccount {
    private int fee ;

        public CheckingAccount(double iBalance) {
            super(iBalance);
        }

        public CheckingAccount(double iBalance, int aNumber) {
            super(iBalance, aNumber);
        }

        public void credit(double amount){

            if (amount <= 0){
                      throws new RuntimeException("Amount should not be 0");
            }
            else {
                initialBalance = iBalance + amount;
            }

        }

        public void debit(double amount){

            if (initialBalance < amount + Fees){
                System.out.println("Your balance is less than the requested amount");
            }

            else {
                initialBalance = initialBalance - amount - Fees;
            }
        }

        public double getFees() {
            return Fees;
        }

        public void setFees(int Fees1) {
            Fees = Fees1;
        }

        @Override
        public String toString() {
            return "CheckingAccount{" + iBalance +
                    "Fees=" + Fees +
                    "} " + super.toString();
        }
    }
}
