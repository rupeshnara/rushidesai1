package exceptios;

/**
 * Created by harik on 12/12/2016.
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
