package exceptios;

/**
 * Created by harik on 12/12/2016.
 */
public class AccountNumberLengthNotValidException extends Exception {

    public AccountNumberLengthNotValidException() {

    }

    public AccountNumberLengthNotValidException(String message) {
        super(message);
    }

    public AccountNumberLengthNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

}
