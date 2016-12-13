package banking;

/**
 * Created by saikrishnareddy on 12/13/2016.
 */
public class DuplicateAccountNumberException extends Exception {

    public DuplicateAccountNumberException(String message) {
        super(message);
    }
}
