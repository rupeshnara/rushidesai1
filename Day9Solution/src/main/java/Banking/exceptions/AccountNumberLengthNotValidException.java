package Banking.exceptions;

/**
 * Created by bhumi on 12/6/2016.
 */
public class AccountNumberLengthNotValidException extends Exception{

    public AccountNumberLengthNotValidException() {
    }

    public AccountNumberLengthNotValidException(String message) {
        super(message);
    }

    public AccountNumberLengthNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountNumberLengthNotValidException(Throwable cause) {
        super(cause);
    }
}
