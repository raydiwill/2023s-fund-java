package fr.epita.dbtraining.services.exceptions;

import java.sql.SQLException;

public class UpdateFailedException extends Throwable {
    public UpdateFailedException(Exception sqlException) {
        super(sqlException);
    }
}
