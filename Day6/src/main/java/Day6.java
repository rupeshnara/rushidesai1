import inheritance.child.CheckingAccount;
import inheritance.child.SavingAccount;

/**
 * Created by desair4 on 11/30/2016.
 */
public class Day6 extends Object {

    public static void main(String[] args) {
        /*
        * Maven preaches convention over configuration
        *
        * 1. If you follow a convention given by maven, you never have to configure anything.
        * */

        /*
        * OOP's : Object oriented programming
        * 1. Encapsulation  //private
        * 2. Inheritance
        * */

        /*
        * SOC : Separation of Concerns : Always write code which is focused on single objective.
        * SRP : Single responsibility principal
        * DRY : Donot repeat yourself
        * */


//        get account data and show on screen
        // callService :
        // 1. Call webservice -> getData -> removing not needed information
        // callWebserviceAndFilterData() -> calls :
        // 1. callGetAccountWebservice() -> calls webservice and returns all data
        // 2. filterData() -> take all data returned and filters it to what is required


        //get account Data -> use it to do something.
        // you cannot reuse callWebserviceAndFilterData() -> filtering few fields. In this case you want them.
        // callWebserviceAndGetAllData() -> calls
        // 1. callGetAccountWebservice()
        // 2. moreProcessing

        //use savings and checking account


        CheckingAccount checkingAccount = new CheckingAccount(12);

        System.out.println(checkingAccount.baseAccount); //= new BaseAccount();

        SavingAccount savingAccount = new SavingAccount(14);
        System.out.println(savingAccount); //= new BaseAccount();

        savingAccount.setPassword("123");
//        savingAccount.accountKey;
        /*checkingAccount.baseAccount = new BaseAccount();
        checkingAccount.setBaseAccount(new BaseAccount());*/
//        checkingAccount.baseAccount = new BaseAccount(12);

        /*
        * Problem statement
        * What if I want variables in parent class that can only be seen by it's children?
        * ans : protected
        * */

        /*
        * Inheritance
        * 1. extends
        * 2. super
        * 3. protected
        *
        * Overriding
        * */

        /*
        * 1. Method overloading -> Methods in SAME class with SAME name but DIFFERENT input parameters
        * 2. Method Overriding ->  Inheritance -> Methods in CHILD class (also means not in same class), with SAME method signature.
        * */

    }
}