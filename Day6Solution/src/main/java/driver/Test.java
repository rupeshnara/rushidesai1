package driver;

import child.SavingsAccount;

import java.util.Date;

/**
 * Created by desair4 on 12/4/2016.
 */
public class Test {
    public static void main(String[] args) {
      /*  BaseAccount sAccount=new SavingsAccount(1000,25);
        BaseAccount cAccount=new CheckingAccount(2000);
        sAccount.credit(2500.0);
        System.out.println("Savings Account Credit Amount:: "+ sAccount);
        sAccount.debit(4500.0);
        System.out.println("The Savings Account Debit Amount:: "+sAccount);

        System.out.println("Account Number ...... Savings Account  : " + sAccount.accountNumber);
        System.out.println("Account Number ...... Checking Account  : " + cAccount.accountNumber);*/
        
        SavingsAccount savingsAccount = new SavingsAccount(12, 1233434);

        String savingsAccountStringRepresantation = savingsAccount.toString();
        System.out.println(savingsAccountStringRepresantation);


        Date d = new Date();

        String s = d.toString();
        System.out.println(s);


/*        BaseAccount account1 = new SavingsAccount();
        BaseAccount account2 = new SavingsAccount();*/
/*
//        ----------------------Account-----------------
                prevAccountList = 1,2

//        ----------------------------------------------------------------------------------------------
               account1             |  account2             |       account3
                                    |                       |

//        -------------------------------------------------

        accountnumber = 2
        does 2 exist in prevAccountList ?
*/
        // System.out.println("To encode it with base 64 :" +);
    }

}


