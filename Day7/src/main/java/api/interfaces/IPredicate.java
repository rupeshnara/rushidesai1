package api.interfaces;

/**
 * Created by desair4 on 12/2/2016.
 */
public interface IPredicate {
    //Contract

    //when I give you a number, you tell me if I should print it or not
    //methods without body
    boolean doPrint(int i); //Only contract
}