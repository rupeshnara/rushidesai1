package bank.exceptions;

/**
 * Created by desair4 on 12/5/2016.
 */
public class AccountNumberLengthNotValid extends Exception {

    //I have created by own custom exceptions.

    public AccountNumberLengthNotValid() {
    }

    public AccountNumberLengthNotValid(String message) {
        super(message);
    }

    public AccountNumberLengthNotValid(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountNumberLengthNotValid(Throwable cause) {
        super(cause);
    }

/*    public AccountNumberLengthNotValid(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }*/
}
