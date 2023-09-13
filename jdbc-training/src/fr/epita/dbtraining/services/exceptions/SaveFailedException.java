package fr.epita.dbtraining.services.exceptions;

public class SaveFailedException extends Exception {

    public SaveFailedException(Exception cause){
        super(cause);
    }
}
