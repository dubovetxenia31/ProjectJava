package Lessson7;

public class IncorrectStoronaException extends Exception {
    public IncorrectStoronaException() {
    }

    public IncorrectStoronaException(String message) {
        super(message);
    }

    public IncorrectStoronaException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectStoronaException(Throwable cause) {
        super(cause);
    }

    public IncorrectStoronaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
