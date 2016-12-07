package Banking.exceptions;

/**
 * Created by bhumi on 12/6/2016.
 */
public class DuplicateAccountNumberException  extends Exception{

        public DuplicateAccountNumberException(String message) {
            super(message);
        }
}
