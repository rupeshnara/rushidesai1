package banking;

/**
 * Created by harik on 12/3/2016.
 */
import java.util.Date;
public class CheckingAccount extends BaseClass {



    public CheckingAccount(int initialBalance,int accountNumber) {
        if (initialBalance <= 0) {
            System.out.println("initial balance cannot be zero");
            throw new RuntimeException("initial balance cannot be zero");
        }
        int lenOfAccount = getNumberOfDigitsInAccount(accountNumber);
        if (lenOfAccount != 8) {
            System.out.println("account number must be 8 numbers");
            throw new RuntimeException("account number must be 8 numbers");
        }
        System.out.println(this.accountNumber =accountNumber);
        System.out.println(this.initialBalance=initialBalance);
    }

    public CheckingAccount(int initialBalance)
    {
        this.initialBalance=initialBalance;
        System.out.println(this.initialBalance=initialBalance);
    }


    public  int getNumberOfDigitsInAccount(int accountNumber) {
        return accountNumber;
    }
    public void dateGenerate()
    {
        Date d=new Date();
        System.out.println(d.toString());
    }


}



