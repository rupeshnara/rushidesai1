package Banking.exceptions;

import Banking.child.SavingAccount;

public class TestingExceptions {

    public static void main(String[] args) throws Exception{

        try {
            SavingAccount savingsAccount = new SavingAccount(12, 1234);
        }
        catch (InitialBalanceNotValidException ex) {
            System.out.println("Balance should be greater than zero");
            throw ex;
        }
        catch (AccountNumberLengthNotValidException ex) {
            System.out.println("AccountNumber length should be = 8");
            throw ex;
        }
        catch (DuplicateAccountNumberException ex) {
            System.out.println("Account Number already exists");
            throw ex;
        }
    }
}
