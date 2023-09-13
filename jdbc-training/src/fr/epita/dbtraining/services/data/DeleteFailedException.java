package fr.epita.dbtraining.services.data;

import java.sql.SQLException;

public class DeleteFailedException extends Throwable {
    public DeleteFailedException(Exception sqlException) {
        super(sqlException);
    }
}
