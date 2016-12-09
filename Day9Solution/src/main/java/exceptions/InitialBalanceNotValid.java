package exceptions;


public class InitialBalanceNotValid extends RuntimeException {

    public InitialBalanceNotValid() {
    }

    public InitialBalanceNotValid(String message) {
        super(message);
    }

    public InitialBalanceNotValid(String message, Throwable cause) {
        super(message, cause);
    }

    public InitialBalanceNotValid(Throwable cause) {
        super(cause);
    }
}
