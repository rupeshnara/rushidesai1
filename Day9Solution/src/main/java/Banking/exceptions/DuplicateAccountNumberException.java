package Banking.exceptions;

/**
 * Created by bhumi on 12/6/2016.
 */
public class DuplicateAccountNumberException  extends Exception{

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
