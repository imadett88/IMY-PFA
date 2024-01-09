package ma.emsi.backendevents.exceptions;

public class SecurityException extends RuntimeException {

    public SecurityException() {
        super("Security exception: You are not authorized to perform this operation");
    }

    public SecurityException(String message) {
        super(message);
    }

    public SecurityException(String message, Throwable cause) {
        super(message, cause);
    }
}
