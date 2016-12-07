package bank.exceptions;

import bank.child.SavingsAccount;

/**
 * Created by desair4 on 12/5/2016.
 */
public class Test {

    public static void main(String[] args) {


        /*try {
            SavingsAccount savingsAccount = new SavingsAccount(-1, 1234);
        } catch (RuntimeException ex) {
            if (ex.getMessage().equals("Initial balance must be more than zero")) {
                System.out.println("Balance should be greater than zero");
            }

            if (ex.getMessage().equals("Account Number should have exactly 8 digits")) {
                System.out.println("Balance should be greater than zero");
            }
        }*/

        //1. Diff perspective to inheritance
        //2. How to better use exceptions

        /*
        * Till now we thought of inheritance:
        * 1. If we find some commonalties in bunch of classes, in form of state or behaviour or both, we can absorb it in parent.
        * 2. If someone has already written a class, we can extend it and modify it.
        *
        * */
        try {
            SavingsAccount savingsAccount = new SavingsAccount(12, 1234);
            //callDatabase()
        } catch (AccountNumberLengthNotValid ex) {
            //Log exception and then delegate what to do incase of exception to client.
            System.out.println("AccountNumber length should be = 8");
//            throw ex;
        } catch (InitialBalanceNotValid initialBalanceNotValidException) {
            System.out.println("Balance should be greater than zero");
            throw initialBalanceNotValidException;
        }

        //What if you are writing SavingsAccount and I want to tell client that I 'could' throw these exceptions
        //is there a way to force client to handle some exceptinos ?

        /*
        * 3 types of error scenaiors
        * 1. Error  //Interally to JRE
        * 2. Exceptions
        *
        * Two types of exceptions
        * 1. Checked exceptions
        * 2. Unchecked exceptions
        *
        * */


        //Problem: We actually dont want anyone instantiating BaseAccount class.
//        BaseAccount baseAccount = new BaseAccount(12,"12");       Solved with protected constructors

        //can I prevent someone from creating instance of any class?
        //hint : something with constructors
        //Idea : not expose constrotors

        //prog start normally from here
        System.out.println("Main exiting");
    }
}
