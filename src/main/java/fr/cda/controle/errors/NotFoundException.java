package fr.cda.controle.errors;

public class NotFoundException extends Exception {

    public NotFoundException() {
        super("Not found");
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundException(String message) {
        super(message);
    }
}
