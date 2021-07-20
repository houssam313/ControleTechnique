package fr.cda.controle.errors;


public class AlreadyExistException extends RuntimeException {
    public AlreadyExistException() {
        super("Already Exist");
    }

    public AlreadyExistException(String message, Exception e) {
        super(message, e);
    }

    public AlreadyExistException(String message) {
        super(message);
    }

}
