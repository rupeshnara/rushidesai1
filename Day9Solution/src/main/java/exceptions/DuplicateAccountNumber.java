package exceptions;

/**
 * Created by Venkat Ramana on 12/8/2016.
 */
public class DuplicateAccountNumber extends RuntimeException {
    public DuplicateAccountNumber() {
    }

    public DuplicateAccountNumber(String message) {
        super(message);
    }

    public DuplicateAccountNumber(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateAccountNumber(Throwable cause) {
        super(cause);
    }
}
