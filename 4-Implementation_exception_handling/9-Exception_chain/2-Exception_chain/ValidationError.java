public class ValidationError extends Throwable {
    ValidationError(String message) {
        super(message);
    }

    ValidationError(String message, Throwable cause) {
        super(message, cause);
    }

    public void assignCause(Throwable cause) {
        initCause(cause);
    }

    @Override
    public String toString() {
        return "Validation error: " + this.getMessage();
    }
}