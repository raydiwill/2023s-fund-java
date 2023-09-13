package fr.epita.ddd.services.exceptions;

import java.sql.SQLException;

public class SaveFailedException extends Throwable {
    public SaveFailedException(Exception sqlException) {
        super(sqlException);
    }
}
