package exceptios;

/**
 * Created by harik on 12/12/2016.
 */
public class DuplicateAccountNumberException extends Exception {
    public DuplicateAccountNumberException() {
    }

    public DuplicateAccountNumberException(String message) {
        super(message);
    }

    public DuplicateAccountNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateAccountNumberException(Throwable cause) {
        super(cause);
    }
}
