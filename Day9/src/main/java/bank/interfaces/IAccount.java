package bank.interfaces;

/**
 * Created by desair4 on 12/5/2016.
 */
public interface IAccount {

    //they define what methods/behaviours your objects should have
    //they define contract for your objects
//    void debit(double amount);  //equivalent to this -> public abstract void debit(double amount);
    abstract void debit(double amount);     // you want all classes to have a method called 'debit' and you also want that clients should implement that method
}
