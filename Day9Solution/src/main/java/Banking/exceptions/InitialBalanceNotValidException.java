package Banking.exceptions;

/**
 * Created by bhumi on 12/6/2016.
 */
public class InitialBalanceNotValidException extends Exception {

    public InitialBalanceNotValidException() {
    }

    public InitialBalanceNotValidException(String message) {
        super(message);
    }

    public InitialBalanceNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public InitialBalanceNotValidException(Throwable cause) {
        super(cause);
    }

}
